package run;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages_Facebook.ForgotPasswordPage;
import pages_Facebook.Homepage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class FacebookTest {
	public WebDriver driver;
 /* @Test
  public void HomeTest() throws InterruptedException {
	 // Open the Facebook site and Verify Login Function
	  Homepage obj=new Homepage(driver);
	  obj.enterEmail("Sumera");
	  obj.enterPassword("abc345");
	  obj.clickLogin();
	  Thread.sleep(3000);
	Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'Friends')]")).isDisplayed());
  }*/
 
  @Test
  public  void ForgotPassword_Page() {
  Homepage objj=new Homepage(driver);
   objj.clickForgotPassword();
   ForgotPasswordPage obj2=new ForgotPasswordPage(driver);
  SoftAssert obj3= new SoftAssert();
   String display=obj2.verifyDisplayData().getText();
   System.out.println(display);
   obj3.assertEquals(display, "Find Your Account96");
   //assertEquals(display, "Find Your Account96");
   obj2.entersearchdata("sumeraqz@yahoo.com");
   obj2.clickSearchButton();
   obj3.assertAll();
     
  }

  @BeforeClass
    public void beforeClass() {
	  switchBrowser("Chrome","https://www.facebook.com/");
		
  }

  @AfterClass
  public void afterClass() {
	driver.close();
  }
  
  public  void switchBrowser(String browserName, String URL ) {
		if(browserName.equalsIgnoreCase("Chrome")) {
			String directory=System.getProperty("user.dir");
			System.out.println(directory);
			System.setProperty("webdriver.chrome.driver",directory+ "\\Drivers\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\sumer\\eclipse-workspace\\Practice\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(URL);;
		driver.manage().window().maximize();
		}else {
			String directory=System.getProperty("user.dir");
			System.out.println(directory);
			System.setProperty("webdriver.gecko.driver",directory+"\\Drivers\\geckodriver.exe");
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\sumer\\eclipse-workspace\\Practice\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(URL);
			driver.manage().window().maximize();
		}
	}

}

  
  


