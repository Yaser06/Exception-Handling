package com.yaser.program;

import java.util.logging.Logger;

import com.yaser.model.LogException;

public class DriverLogException {
	public static void main(String[] args) 
	{
		try {
		throw new LogException();	
		} catch (Exception e) {
			System.out.println("Catched: " + e );
		}
	}

}
