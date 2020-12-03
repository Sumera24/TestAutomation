package pages_Facebook2;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Loggs2 {
   public static Logger log= Logger.getLogger(Loggs2.class.getName());
	//public static Logger log=LogManager.getLogger(Loggs.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PropertyConfigurator.configure("C:\\Users\\sumer\\eclipse-workspace\\Practice\\log.properties");
		log.info("This is our first log ");
        log.error("Object not Displayed");
        log.fatal("object is missing");
        log.debug("I have Clicked on button");
	}  

}
 