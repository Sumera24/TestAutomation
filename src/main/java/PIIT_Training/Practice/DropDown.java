package PIIT_Training.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumer\\eclipse-workspace\\Practice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement CreateAccount=driver.findElement(By.linkText("Create New Account"));
		CreateAccount.click();
		Thread.sleep(6000);
		WebElement month=driver.findElement(By.id("month"));
		Select obj1=new Select(month);
		obj1.selectByValue("7");
		WebElement day= driver.findElement(By.id("day"));
		Select obj2= new Select(day);
		obj2.selectByValue("24");
		WebElement year= driver.findElement(By.name("birthday_year"));
		Select obj3=new Select(year);
		obj3.selectByVisibleText("2019");
		WebElement female= driver.findElement(By.xpath("(//*[@class='_8esa'])[1]"));
		female.click();

	}

}
