package com.main;

import com.os.Android;
import com.os.FactoryOperations;
import com.os.OS;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OS obj=new Android(); //not recommended as Android obj is exposed
		obj.specs();
		
		//Object from Factory class FactoryOperations
		FactoryOperations op=new FactoryOperations();
		OS os =op.getInstance("open");
		os.specs();
		os=op.getInstance("closed");
		os.specs();
		os=op.getInstance("other");
		os.specs();
	}

}
