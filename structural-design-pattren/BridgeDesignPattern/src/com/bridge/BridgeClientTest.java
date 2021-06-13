package com.bridge;

abstract class TV{
	Remote remote;
	
	TV(Remote remote){
		this.remote=remote;
	}
	abstract void on();
	abstract void off();
}

class Sony extends TV{
	
	Remote remoteType;

	public Sony(Remote remote) {
		super(remote);
		this.remoteType = remote;
	}
	
	public void on() {
		System.out.println("Sony TV is ON");
		remoteType.on();
	}
	
	public void off() {
		System.out.println("Sony TV is OFF");
		remoteType.off();
	}
}


class Samsung extends TV{
	
	Remote remoteType;

	public Samsung(Remote remote) {
		super(remote);
		this.remoteType = remote;
	}
	
	public void on() {
		System.out.println("Samsung TV is ON");
		remoteType.on();
	}
	
	public void off() {
		System.out.println("Samsung TV is OFF");
		remoteType.off();
	}
}

interface Remote {
	void on();
	void off();
}

class OldRemote implements Remote{

	@Override
	public void on() {
		System.out.println("On with Old Remote");
	}

	@Override
	public void off() {
		System.out.println("Off with Old Remote");
	}
	
}


class NewRemote implements Remote{

	@Override
	public void on() {
		System.out.println("On with New Remote");
	}

	@Override
	public void off() {
		System.out.println("Off with New Remote");
	}
	
}

public class BridgeClientTest {

	public static void main(String[] args) {
		TV sonyOldRemote=new Sony(new OldRemote());
		sonyOldRemote.on();
		sonyOldRemote.off();
		System.out.println();
		
		TV sonyNewRemote=new Sony(new NewRemote());
		sonyNewRemote.on();
		sonyNewRemote.off();
		System.out.println();
		
		TV samsungOldRemote=new Sony(new OldRemote());
		samsungOldRemote.on();
		samsungOldRemote.off();
		System.out.println();
		
		TV samsungNewRemote=new Sony(new NewRemote());
		samsungNewRemote.on();
		samsungNewRemote.off();
		
	}

}
