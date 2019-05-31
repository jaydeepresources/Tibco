package com.msg;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageWrapperReceiver {
	
	@JmsListener(destination = "MessageWrapperQueue", containerFactory = "myFactory")
	public void receiveMessage(MessageWrapper messageWrapper) {
		System.out.println("Received <" + messageWrapper.getMessage() + ">");
	}
}