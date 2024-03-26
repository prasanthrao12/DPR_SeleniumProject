package utilies;

import org.apache.log4j.BasicConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import utilies.LogUtils;

public class LogUtils {

	  private static final Logger logger = LogManager.getLogger(LogUtils.class);

	    public static void main(String[] args) {
	    	BasicConfigurator.configure();
	        logger.debug("Debug message");
	        logger.info("Info message");
	        logger.warn("Warning message");
	        logger.error("Error message");
	        logger.fatal("Fatal message");
	    }
   
}
