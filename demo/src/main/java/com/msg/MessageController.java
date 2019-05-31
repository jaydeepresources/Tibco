package com.msg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@Autowired
	private JmsTemplate jmsTemplate;

	@PostMapping("/send")
	public String send(@RequestBody MessageWrapper messageWrapper) {
		System.out.println("Sending a message..." + messageWrapper);
		jmsTemplate.convertAndSend("MessageWrapperQueue", messageWrapper);
		return "Sent msg: " + messageWrapper.getMessage();
	}

}