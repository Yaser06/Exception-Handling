package com.yaser.program;

import com.yaser.model.SomeType;

public class DriverCustomException {
	//Exceptionlar heapta alan acilmis objelerdir ve runtime da calisirlar.
	
	
	public static void main(String[] args) {
		SomeType someType =new SomeType();
		
		try {
			someType.f(); // sadece try blogunu yazarak hatayý bulamayiz.
			
		}catch(Exception e) {
			e.printStackTrace(); //  hatayi catchle yakalamamiz gerekmektedir.
		}
		
	}

}
