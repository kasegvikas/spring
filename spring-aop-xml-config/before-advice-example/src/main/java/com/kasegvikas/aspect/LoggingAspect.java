package com.kasegvikas.aspect;

import org.apache.log4j.Logger;

public class LoggingAspect {
	private static final Logger LOGGER = Logger.getLogger(LoggingAspect.class);

	public void logExecution() {
		LOGGER.info("Log Execution");
	}
}
