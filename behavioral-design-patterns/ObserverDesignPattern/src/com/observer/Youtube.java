package com.observer;

public class Youtube {

	public static void main(String[] args) {
	
		Channel channel=new Channel();
		Subscriber s1=new Subscriber();
		s1.setName("Faizan");
		Subscriber s2=new Subscriber();
		s2.setName("Yash");
		Subscriber s3=new Subscriber();
		s3.setName("Rahul");
		Subscriber s4=new Subscriber();
		s4.setName("Aakash");
		Subscriber s5=new Subscriber();
		s5.setName("Dixit");
		
		channel.subscribe(s1);
		channel.subscribe(s2);
		channel.subscribe(s3);
		channel.subscribe(s4);
		channel.subscribe(s5);
		
		s1.subscribeChannel(channel);
		s2.subscribeChannel(channel);
		s3.subscribeChannel(channel);
		s4.subscribeChannel(channel);
		s5.subscribeChannel(channel);
		
		channel.upload("How to Learn Design Patterns ???");
	}

}
