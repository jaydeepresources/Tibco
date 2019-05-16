package com;

public class HelloWorld {

	String msg;

	public HelloWorld() {
		System.out.println("DC");
	}

	public HelloWorld(String msg) {
		System.out.println("PC");
		this.msg = msg;
	}

	public String getMsg() {
		System.out.println("Get Msg");
		return msg;
	}

	public void setMsg(String msg) {
		System.out.println("Set Msg");
		this.msg = msg;
	}
}
