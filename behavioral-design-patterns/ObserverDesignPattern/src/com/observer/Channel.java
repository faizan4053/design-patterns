package com.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	
	private String title;
	private List<Subscriber> subscribers =new ArrayList<>();
	
	public String getTitle() {
		return this.title;
	}
	
	//register
	public void subscribe(Subscriber subscriber) {
		this.subscribers.add(subscriber);
	}
	
	
	//unregister
	public void unSubscribe(Subscriber subscriber) {
		this.subscribers.remove(subscriber);
	}
	
	
	public void notifySubscriber() {
		for(Subscriber subscriber:subscribers) {
			subscriber.update();
		}
	}
	
	public void upload(String title) {
		this.title=title;
		notifySubscriber();
	}

}
