package com.os;

public class FactoryOperations {
	public OS getInstance(String str) {
		if(str.equals("open"))
			return new Android();
		else if(str.equals("closed"))
			return new IOS();
		else
			return new Windows();
	}
}
