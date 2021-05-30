
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
public class App

{
	
private static final Logger LOG = LogManager.getLOgger(App.class);
public static void main (String[]args) {
	
String message = "Hello World ";
		LOG.debug(message + "Will show debug message");
		LOG.info(message + "Will show info message");
		LOG.warn(message+"Will show warn message");
		LOG.error(message+"Will show error message");
		LOG.fatal(message+"Will show fatal message");
		LOG.info("Appending String {}", message);
		System.out.println(message);
}
}