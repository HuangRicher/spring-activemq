package com.activemq.amq;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.enation.framework.jms.JmsMessage;


@Component
public class MessageSenderThree {


    private final JmsTemplate jmsTemplate;


    public MessageSenderThree(final JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }


    public void send(final String text) {
        jmsTemplate.convertAndSend(text);
    }
    
    public void send(final JmsMessage jmsMessage) {
    	
        jmsTemplate.convertAndSend(jmsMessage);
    }
}
