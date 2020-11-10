package com.yaser.model;

public class ReTryExceptionThrower {
	private static int count = 4;
	
	public void f() throws ReTryException {
		if(--count >0) {
			throw new ReTryException();
		}
	}

}
