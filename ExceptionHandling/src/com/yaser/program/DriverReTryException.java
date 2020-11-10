package com.yaser.program;

import com.yaser.model.ReTryExceptionThrower;

public class DriverReTryException {
	public static void main(String[] args) {

		while (true) {
			
			ReTryExceptionThrower retry = new ReTryExceptionThrower();

			try {
				retry.f();
				// 3 defa exception kontrolü yapiyoruz ve hatayý firlatiyoruz.

			} catch (Exception e) {
				System.out.println("Exception catched and now retrying ...");
				continue;
			}

			System.out.println("Cont..");
			break;

		} // end of while

		System.out.println("Main method finished successfully");
	}

}
