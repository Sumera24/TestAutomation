package PIIT_Training.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Validation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumer\\eclipse-workspace\\Practice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.facebook.com/");
		WebElement createAccount=driver.findElement(By.linkText("Create New Account"));
	System.out.println(createAccount.isDisplayed());
	  WebElement text=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/h2"));
	  System.out.println(text.getText()); //Validate using getText() */
		
		driver.get("https://www.qatarairways.com/en-us/homepage.html");
		Thread.sleep(6000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
	      js.executeScript("window.scrollBy(0,200)");
	       driver.findElement(By.id("cookie-close")).click();
		//WebElement round=driver.findElement(By.xpath("(//*[@name='bookingType'])[3]"));
		//System.out.println(round.isSelected());

		WebElement round=driver.findElement(By.xpath("(//*[@name='bookingType'])[1]"));
	System.out.println(round.isSelected());
	  
	  

	}

}
