package PIIT_Training.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumer\\eclipse-workspace\\Practice\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	/*driver.get("http://demo.guru99.com/test/delete_customer.php");
	WebElement submit= driver.findElement(By.name("submit"));
	submit.click();
	// Simple Pop Up Handling
	//driver.switchTo().alert().accept(); // Ok Pop Up
	driver.switchTo().alert().dismiss(); // Cancel Pop Up
	//driver.switchTo().alert().accept();*/
	
	driver.get("https://www.qatarairways.com/en-us/homepage.html");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
      js.executeScript("window.scrollBy(0,200)");
       driver.findElement(By.id("cookie-close")).click();
      driver.findElement(By.xpath("//*[@id=\"T7-departure_1\"]")).click();
	driver.findElement(By.xpath("(//*[text()='26'])[2]")).click();
	Thread.sleep(9000);
	driver.findElement(By.className("close-sc closeStyle1-sc"))	.click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	
	}

}
