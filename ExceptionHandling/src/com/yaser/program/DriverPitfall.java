package com.yaser.program;

public class DriverPitfall {
	public static void main(String[] args) {
		
		try {
			try {
				throw new Exception();
			}finally {
				System.out.println("Her t�rl� finally yazilir.");
				
				// bunun en  b�y�k risklerinden bir tanesi hatay� yakalamaya bilirim.Yanlis yazim sonrasinda
				return; // bunu yorum satiri yaparsak hatayi yakalariz yanlis kullanim hatanin kacmasina sebeb olabilir.
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
