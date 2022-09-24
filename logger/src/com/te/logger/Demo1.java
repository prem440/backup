package com.te.logger;



import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Demo1 {
 public static final Logger logger=Logger.getLogger(Demo1.class.getName());
public static void main(String[] args) {
	ConsoleHandler ch=new ConsoleHandler();
	ch.setLevel(Level.FINEST);
	logger.addHandler(ch);
	logger.setLevel(Level.WARNING);
	logger.severe("i am severe");
	logger.warning("i am warning");
	logger.info("i am info");
	
	

	
}
}
