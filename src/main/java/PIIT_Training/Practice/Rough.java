package PIIT_Training.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver","C:\\Users\\sumer\\eclipse-workspace\\Practice\\Drivers\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("http://www.qaclickacademy.com/");
 driver.manage().window().maximize();
 WebElement course=driver.findElement(By.xpath("(/html/body/header/div/div/nav/ul/li/a)[6]"));
 course.click();
 
		
	
	}

}
