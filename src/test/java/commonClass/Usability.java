package commonClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Usability {
	
	public WebDriver driver;
	@Parameters({"Browser","URL"})
	 @BeforeMethod
		    public void beforeClass(String browserPara, String urlPara) {
		  switchBrowser(browserPara,urlPara);
			
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
	 
	@AfterMethod
	  public void afterTest() {
		driver.close();
	  }
  
}
