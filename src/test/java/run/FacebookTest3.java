package run;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import commonClass.Usability;
import pages_Facebook2.CreateAPage2;
import pages_Facebook2.Homepage2;
import pages_Facebook2.Loggs;


public class FacebookTest3 extends Usability { 
	
	 public  Logger log= Logger.getLogger(FacebookTest3.class.getName());
 
	@Test
  public void CreateAPageTest2() {
		 PropertyConfigurator.configure("C:\\Users\\sumer\\eclipse-workspace\\Practice\\log.properties");
		 Homepage2 objC= new Homepage2(driver);
	 	  objC.clickCreateAPage();
	 	 CreateAPage2 objD=new CreateAPage2(driver);
	  	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 objD.enterEmail();
	 log.debug("Email Entered");
	  objD.enterPassword();
	  log.debug("Password Entered");
	   objD.clickLogin(); 
	   log.debug("Button Clicked");
	   
	  
	   
	  
	 	  }
 
	@Test
  public void verifyImages() {
		PropertyConfigurator.configure("C:\\Users\\sumer\\eclipse-workspace\\Practice\\log.properties");
		 Homepage2 objC= new Homepage2(driver); 
		CreateAPage2 objE=new CreateAPage2(driver);
		objC.clickCreateAPage();
		 objE.verifyImage1();
		 log.error("Image Not Displayed");
		  
		 objE.verifyImage2();
		
		   log.error("Image Not Displayed");
		  
  } 
  
	/*@Test
  public void bussinessOrBrand() {
	  
  }
  
	@Test
	public void CommunityOrPublicFigure() {
	
	}*/
  
}
