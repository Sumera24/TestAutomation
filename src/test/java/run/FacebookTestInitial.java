package run;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FacebookTestInitial {
	public WebDriver driver;
	@Parameters({"Browser","URL"})
  @Test(groups="Smoke")
  public void InitialSetting(String browserType,String website) {
	  switchBrowser( browserType, website);
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
	
	  
  

