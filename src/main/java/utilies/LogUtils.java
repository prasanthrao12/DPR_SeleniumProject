package utilies;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogUtils {

	 private   Logger logger=LogManager.getLogger(LogUtils.class);
	  
	  public static void main(String[] args) {
		   
	}
    
	  
	  public  void infoLogs(String msg) {
		  logger.info(msg);
	  }
	   
   
}
