package log4jDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LogginConsole {
	
	private static final Logger log = LogManager.getLogger(LogginConsole.class.getName());
	
	
	
	public static void main(String[] args) {
		log.debug("Debug Message Logged");
		log.error("Error message Logged");
		log.fatal("Fatal message Logged");
	
	}

}
