package com.yaser.model;

public class SomeType {
	
	public void f() throws CustomException {
		System.out.println("SomeType.f()");
		g();
	}
	
	
	public void g() throws CustomException {
		System.out.println("SomeType.g()");
		throw new CustomException(); //Özellestirilmis return mekanizmasidir.
		//System.out.println("Bu kod calismaz.Throw dan sonra geliyor.");
	}
	
	public void t() throws OtherException {
		System.out.println("SomeType.t()");
		throw new OtherException("Custom Message");
	}

}
