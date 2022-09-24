package com.te.logger;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyFormater extends Formatter {

	@Override
	public String format(LogRecord record) {
		return record.getLoggerName() + "," + record.getMessage() + "," + record.getSourceMethodName() + ","
				+ record.getMillis() + "\n";

	}

}
