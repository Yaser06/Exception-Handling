package com.yaser.program;

import java.io.IOException;

public class DriverExceptionV7Post {
	public static void f() throws SimpleException {

	}

	public static void g() throws SimpleException, OtherException, IOException {
		throw new SimpleException();
	}

	//Version 7 den sonra bu sekilde catch blogu yazabilir hale geldik.
	public static void main(String[] args) {

		try {
			f();
			g();
		} catch (SimpleException | OtherException | IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			// Exception ayrý yazýyoruz.En genel oldugu icin hemen diger hatalara bakmaz.
		}

	}
}
