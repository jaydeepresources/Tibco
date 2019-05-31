package com.msg;

public class MessageWrapper {

	private String message;

	public MessageWrapper() {

	}

	public MessageWrapper(String name) {
		this.message = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MessageWrapper [message=" + message + "]";
	}

}
