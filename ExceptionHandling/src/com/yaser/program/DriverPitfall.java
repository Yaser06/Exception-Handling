package com.yaser.program;

public class DriverPitfall {
	public static void main(String[] args) {
		
		try {
			try {
				throw new Exception();
			}finally {
				System.out.println("Her türlü finally yazilir.");
				
				// bunun en  büyük risklerinden bir tanesi hatayý yakalamaya bilirim.Yanlis yazim sonrasinda
				return; // bunu yorum satiri yaparsak hatayi yakalariz yanlis kullanim hatanin kacmasina sebeb olabilir.
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
