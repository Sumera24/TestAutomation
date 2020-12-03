package PIIT_Training.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumer\\eclipse-workspace\\Practice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement UserName= driver.findElement(By.name("email"));
		WebElement Password=driver.findElement(By.name("pass"));
		WebElement Login= driver.findElement(By.name("login"));
        UserName.sendKeys("sumeraquazi@yahoo.com");
		Password.sendKeys("sumer123");
		Login.click();
		WebElement Forgot= driver.findElement(By.xpath("//*[@class='_97w4']"));
		Forgot.click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//*[@role='button'])[1]")).click();
		

	}

}
