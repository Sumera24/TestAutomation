package run;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import commonClass.Usability;
import pages_Facebook2.ForgotPasswordPage2;
import pages_Facebook2.Homepage2;

public class FacebookTest1 extends Usability  {
	
	
	
	 @Test 
	  public  void ForgotPassword_Page2() {
	  Homepage2 obj1=new Homepage2(driver);
	   obj1.clickForgotPassword();
	   ForgotPasswordPage2 obj2=new ForgotPasswordPage2(driver);
	  SoftAssert obj3= new SoftAssert();
	  String display=obj2.verifyDisplayData();
	   //String display=obj2.verifyDisplayData();
	   System.out.println(display);
	   obj3.assertEquals(display, "Find Your Account");
	   //assertEquals(display, "Find Your Account96");
	   obj2.entersearchdata("sumeraqz@yahoo.com");
	   obj2.clickSearchButton();
	   obj3.assertAll();
	     
	  }
	 
	 
	 @Test(groups="Smoke")
	 public void validation() {
		 System.out.println("Validation");
	 }
	  
	  @Test
	 public void cancelSearch() {
		 Homepage2 obj1=new Homepage2(driver);
		
		  obj1.clickForgotPassword();
		  
		   ForgotPasswordPage2 obj2=new ForgotPasswordPage2(driver);
		   obj2.clickCancelButton();
		   
		   
		  
	  }
}
