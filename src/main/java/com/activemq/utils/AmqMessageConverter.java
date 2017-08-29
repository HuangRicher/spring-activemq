package com.activemq.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.apache.activemq.command.ActiveMQObjectMessage;
import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;

import com.enation.framework.jms.JmsMessage;




/**
 * 消息转换器
 */
public class AmqMessageConverter implements MessageConverter {

	@Override
	public Object fromMessage(Message msg) throws JMSException,MessageConversionException {
		if (msg instanceof ObjectMessage) {
			Object obj = null;
			byte[] bytes = (byte[]) ((Map) ((ObjectMessage) msg).getObjectProperty("Map")).get("eop_message");
			ObjectInputStream in = null;
			try {
				in = new ObjectInputStream(new ByteArrayInputStream(bytes));
				obj = in.readObject();
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
			return obj;
		} else {
			throw new JMSException("Msg:[" + msg + "] is not Map");
		}
	}

	@Override
	public Message toMessage(Object obj, Session session) throws JMSException,
			MessageConversionException {
		if (obj instanceof JmsMessage) {
			ActiveMQObjectMessage objMsg = (ActiveMQObjectMessage) session.createObjectMessage();
			Map<String, byte[]> map = new HashMap<String, byte[]>();
			byte[] bytes = null;
			ByteArrayOutputStream buf = null;
			ObjectOutputStream o = null;
			try {
				buf = new ByteArrayOutputStream();
				o = new ObjectOutputStream(buf);
				o.writeObject(obj);
				bytes = buf.toByteArray();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (o != null) {
					try {
						o.flush();
						o.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if (buf != null) {
					try {
						buf.flush();
						buf.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			map.put("eop_message",bytes);
			objMsg.setObjectProperty("Map", map);
			return objMsg;
		} else {
			throw new JMSException("Object:[" + obj + "] is not Member");
		}
	}

}
