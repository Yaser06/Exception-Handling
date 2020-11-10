package com.yaser.model;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LogException extends Exception{
	
	private Logger logger=Logger.getLogger("Log Exception: ");
	
	public LogException() {
		StringWriter stringWriter =new StringWriter();
		printStackTrace(new PrintWriter(stringWriter));
		logger.severe(stringWriter.toString());
		
	}

}
