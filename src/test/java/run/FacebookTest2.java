package run;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import commonClass.Usability;
import pages_Facebook2.CreateAccountPage2;
import pages_Facebook2.Homepage2;

public class FacebookTest2 extends Usability  {
	//public WebDriver driver;
	
	 @Test( dataProvider="data" )
	  public void HomeTest2(String emaildata, String passwordData)  {
		 // Open the Facebook site and Verify Login Function
		// System.out.println(emaildata+" "+passwordData);
		
		 Homepage2 obj=new Homepage2(driver);
		  obj.enterEmail(emaildata);
		 obj.enterPassword(passwordData);
		 obj.clickLogin();
		 		  		
	  
	 	
	}
	 @Test (groups="Smoke")
	 public void verification() {
		 System.out.println("Verified");
	 }
	  
	 
	 @Test
	 public void createAccountTest2() {
		 Homepage2 obj1=new Homepage2(driver);
		 obj1.clickCreateAccount();
		
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 CreateAccountPage2 objA= new CreateAccountPage2(driver);
		  objA.enerFirstName();
		  objA.enterLastName();
		  objA.enterMobileEmail();
		  objA.enterMobilePassword();
		  objA.selectmonth();
		  objA.selectday();
		  objA.selectyear();
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  objA.clickfGender();
		  objA.clickSignUp();
		  
	  }
	 
	 
	 @DataProvider
		public Object[][] data(){
			return new Object[][] {
				new Object[] {"Valid" ,"Valid"},
				new Object[]	{"Valid","InValid"},
				new Object[]	{"Invalid", "Valid"},
				new Object[] {"Invalid","Invalid"}
			};
			}
	
	
		
		
	}
	  
	 

