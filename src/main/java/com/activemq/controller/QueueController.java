package com.activemq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.activemq.amq.MessageSenderOne;
import com.enation.framework.jms.JmsMessage;

@Controller
@RequestMapping("/queue")
public class QueueController {

	//private final static Logger LOGGER=LoggerFactory.getLogger(QueueController.class);
	@Autowired
	private MessageSenderOne messageSenderOne;
	
	@RequestMapping("/send")
	public @ResponseBody String sendMsg(JmsMessage jmsMessage){
		messageSenderOne.send(jmsMessage);
		return "success";
	}
		
}
