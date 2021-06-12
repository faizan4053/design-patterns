package com.phone;

public class shop {

	public static void main(String[] args) {
		Phone p=new Phone("IOS",4,"Apple",5.5,3500); //not recommended
		System.out.println(p);
		
		//using  builder design pattern by builder class Phone Builder
		Phone obj=new PhoneBuilder()
				.setOs("Android")
				.setBattery(3500)
				.getPhone();
		
		System.out.println(obj);
	}

}

