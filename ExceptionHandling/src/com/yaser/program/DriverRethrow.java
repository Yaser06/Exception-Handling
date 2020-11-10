package com.yaser.program;

public class DriverRethrow {
	
	public static void main(String[] args) throws Exception {
											// exception throws etmezsem hata verir.
		try {
			throw new Exception();
			
		} catch (Exception e) {
			throw e; // gelen hatayý tekrardan firlatiyorum.
			//Bunu yapmamýn sebeplerinden bir tanesi  olusan hatayi göstermek istemiyorum ve onun yerine
			//baska bir hata gönderebilme sansi veriyor bana.
		}
	}

}
