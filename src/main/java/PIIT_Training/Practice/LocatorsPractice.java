package PIIT_Training.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumer\\eclipse-workspace\\Practice\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

/*driver.get("https://www.amazon.com/");
//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
WebElement Search =driver.findElement(By.id("twotabsearchtextbox"));
WebElement SearchElement= driver.findElement(By.id("nav-search-submit-text"));
Search.sendKeys("Phones");
SearchElement.click();*/ 

driver.get("https://www.facebook.com/");
WebElement UserName= driver.findElement(By.name("email"));
WebElement Password=driver.findElement(By.name("pass"));
WebElement Login= driver.findElement(By.name("login"));
WebElement Login1= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
//WebElement Login1= driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/button"));
WebElement Login2= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
WebElement Forgot= driver.findElement(By.linkText("Forgot Password?"));
UserName.sendKeys("sumeraquazi@yahoo.com");
Password.sendKeys("sumer123");
//Login2.click();
//*[@id="email"]     
Login1.click();
//Login.click();
//Forgot.click();


	}

}
