package com.assignments.Logging;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerDemo {
	static Logger logger = Logger.getLogger(LoggerDemo.class.getName());
	
	public static void main(String args[])
	{
		/*try {
			LogManager.getLogManager().readConfiguration(new FileInputStream("src/myLogging.properties"));
		}catch(SecurityException  | IOException ie)
		{
			ie.printStackTrace();
		}*/
		logger.setLevel(Level.FINE);
		//logger.addHandler(new ConsoleHandler());
		//logger.addHandler(new MyHandler());
		try {
			Handler fileHandler = new FileHandler("src/logger.log",20000,5); 
			fileHandler.setFormatter(new MyFormatter());
			fileHandler.setFilter(new MyFilter());
			logger.addHandler(fileHandler);
			for(int i=0;i<5;i++)
			{
				if(i%3 == 0)
					logger.log(Level.INFO, "The io exception has occured "+i);
				else if(i%2 ==0)
					logger.log(Level.WARNING, "The warning appeared "+i);
				logger.log(Level.SEVERE, "It is just a info message "+i);

			}
		}catch(SecurityException  | IOException ie)
		{
			ie.printStackTrace();	
		}
	}
}
