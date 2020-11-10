package com.yaser.program;

import java.io.IOException;

class SimpleException extends Exception {
}

class OtherException extends Exception {
}

public class DriverExceptionV7Pre {
	
	public static void f() throws SimpleException {

	}

	public static void g() throws SimpleException, OtherException, IOException {

	}
	
	public static void main(String[] args) {
		
		// catchde hangi sýraya göre yazmaliyiz. Exception en üste yazarsak diger hatalari görmez
		// spesifikten en genele dogru yazmak gerekmektedir.

		try {
			f();
			g();
		} catch (SimpleException e) {
			e.printStackTrace();
		} catch (OtherException e) {

		} catch (IOException e) {

		} catch (Exception e) {
			
		}
		
		
		// Version 7 den sonra bu yazim sekli degisti.
	}

}
