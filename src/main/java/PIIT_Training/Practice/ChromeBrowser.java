package PIIT_Training.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sumer\\eclipse-workspace\\Practice\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
//driver.quit();

	} 

}
