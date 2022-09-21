package com.assignments.Logging;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class MyFilter implements Filter{

	@Override
	public boolean isLoggable(LogRecord record) {
		// TODO Auto-generated method stub
		if(record.getLevel()==Level.CONFIG) return true;
		return true;
	}

}
