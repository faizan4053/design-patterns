package com.adapter;

import com.friend.PioletPen;

public class PenAdapter implements Pen{

	PioletPen pp=new PioletPen();
	
	@Override
	public void write(String str) {
		pp.mark(str);
	}

}
