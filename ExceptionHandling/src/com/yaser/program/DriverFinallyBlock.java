package com.yaser.program;

import com.yaser.model.SomeType;

public class DriverFinallyBlock {
	public static void main(String[] args) {
		SomeType someType=new SomeType();
		
		try {
			someType.f();
			
		} catch (Exception e) {
			//e.printStackTrace();
			// Tanim satiri olarak yapt�m. �uan da hata f�rlat�lm�� ama catch le yakalama islemi yapm�yoruz.
		}finally {
			System.out.println("Her sekilde burasi calisir.");
		//Hata olsada  olmasada burasi calisir.Tehlike bir yapidir. Hatayi kacirmaya sebep olabilir.
		}
	}

}
