package com.yaser.program;

public class DriverRethrow {
	
	public static void main(String[] args) throws Exception {
											// exception throws etmezsem hata verir.
		try {
			throw new Exception();
			
		} catch (Exception e) {
			throw e; // gelen hatay� tekrardan firlatiyorum.
			//Bunu yapmam�n sebeplerinden bir tanesi  olusan hatayi g�stermek istemiyorum ve onun yerine
			//baska bir hata g�nderebilme sansi veriyor bana.
		}
	}

}
