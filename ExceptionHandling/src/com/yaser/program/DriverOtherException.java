package com.yaser.program;

import com.yaser.model.SomeType;

public class DriverOtherException {
	public static void main(String[] args) {
		SomeType someType =new SomeType();
		
		try {
			someType.t();
			// burada kod var ise onlarý okumaya devam eder.
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		System.out.println("Kod burdan devam etmez exit ile tamamen sonlandirdik sistemi.");
	}
	

}
