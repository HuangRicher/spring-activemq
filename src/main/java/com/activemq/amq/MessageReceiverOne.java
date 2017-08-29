package com.activemq.amq;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import org.springframework.beans.factory.annotation.Autowired;

import com.activemq.entity.po.ActivityGroupPO;
import com.activemq.service.ActivityGroupService;
import com.enation.framework.jms.JmsMessage;

public class MessageReceiverOne implements MessageListener {

	@Autowired
	private ActivityGroupService activityGroupService;

	private SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public void onMessage(Message message) {

		if (message instanceof ObjectMessage) {
			try {
				Object obj = null;
				byte[] bytes = (byte[]) ((Map) ((ObjectMessage) message).getObjectProperty("Map")).get("eop_message");
				ObjectInputStream in = null;
				try {
					in = new ObjectInputStream(new ByteArrayInputStream(bytes));
					obj = in.readObject();
					JmsMessage msg = (JmsMessage) obj;
					ActivityGroupPO activityGroup = new ActivityGroupPO();
					if(!msg.getJoinUserId().equals(msg.getMemberId())){
						synchronized (activityGroup) {
							System.out.println(String.format("======Received: %s",msg.getJoinUserId() + ",time:"+ sf.format(new Date())));
							activityGroup.setJoinUserId(msg.getJoinUserId());
							activityGroup.setMemberId(msg.getMemberId());
							activityGroupService.add(activityGroup);
							System.out.println(String.format("======Received: %s", msg.getJoinUserId()+ ",time:" + sf.format(new Date())));
						}
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (in != null) {
						try {
							in.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
