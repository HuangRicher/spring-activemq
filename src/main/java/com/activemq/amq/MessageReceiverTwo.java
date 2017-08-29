package com.activemq.amq;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.activemq.entity.ActivityGroup;
import com.activemq.service.ActivityGroupService;
import com.enation.framework.jms.JmsMessage;

public class MessageReceiverTwo implements MessageListener {

	private static Logger logger = Logger.getLogger(MessageReceiverTwo.class);
	@Autowired
	private ActivityGroupService activityGroupService;
	
	@SuppressWarnings("unchecked")
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
					Map<String, Object> datas=(Map<String, Object>)msg.getData();
					Integer groupId=(Integer)datas.get("groupId");
					Integer memberId=(Integer)datas.get("memberId");
					
					ActivityGroup group=new ActivityGroup();
					group.setMemberId(memberId);
					group.setGroupId(groupId);
					logger.info("receive two:");
					activityGroupService.addCoupons(group);
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
