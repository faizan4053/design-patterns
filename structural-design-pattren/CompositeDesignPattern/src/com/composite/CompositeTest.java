package com.composite;

public class CompositeTest {

	public static void main(String[] args) {
		
		Component hdd=new Leaf(4000,"HDD");
		Component mouse=new Leaf(500,"MOUSE");
		Component monitor=new Leaf(8000,"Monitor");
		Component ram=new Leaf(3000,"RAM");
		Component processor=new Leaf(9000,"Intel core i7");
		
		Composite ph=new Composite("Peripheral-devices");
		Composite cabinet=new Composite("cabinet");
		Composite mb=new Composite("mother-board");
		Composite computer=new Composite("Computer-System");
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		
		cabinet.addComponent(hdd);
		cabinet.addComponent(mb);
		
		mb.addComponent(processor);
		mb.addComponent(ram);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		computer.showPrice();
		

	}

}
