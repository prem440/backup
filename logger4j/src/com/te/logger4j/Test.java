package com.te.logger4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
	public  static final Logger logger = LogManager.getLogger(Test.class);
public static void main(String[] args) {

logger.fatal("i am fatal ");
logger.error("i am error");
logger.warn("i am warn");
logger.debug("i am debug");

logger.info("i am info");
logger.trace("i am trace");



}
}
