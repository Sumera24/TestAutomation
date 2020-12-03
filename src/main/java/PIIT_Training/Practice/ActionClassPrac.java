package PIIT_Training.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumer\\eclipse-workspace\\Practice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement move= driver.findElement(By.xpath("//*[text()='Hello, Sign in']"));
		act.moveToElement(move).build().perform();
		WebElement signin= driver.findElement(By.xpath("//*[text()='Sign in']"));
		act.moveToElement(signin).click().build().perform();
		/*act.keyDown(driver.findElement(By.id("createAccountSubmit")),Keys.CONTROL).click().build().perform();
 act.keyUp(Keys.LEFT_SHIFT).build().perform(); */
		
		WebElement createAccSub= driver.findElement(By.id("createAccountSubmit"));
		 act.moveToElement(createAccSub).keyDown(Keys.SHIFT).click().build().perform();
		
		/* WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		 act.moveToElement(search).click().keyDown(key)*/
		
	}

}
