package com.observer;

public class Subscriber {

	private String name;
	private Channel channel=new Channel(); //tight coupling
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void update() {
		System.out.println("Hey "+name+" video uploaded : "+channel.getTitle());
	}
	
	
	public void subscribeChannel(Channel ch) {
		channel=ch;
	}
	
}
