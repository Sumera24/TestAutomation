package PIIT_Training.Practice;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotMethods {
static WebDriver driver;
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumer\\eclipse-workspace\\Practice\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		picture();
		
	}

	
	 public static void picture() throws IOException {
		 Date dt= new Date();
		String timeStamp= dt.toString().replace(" ", "_").replace(":","_");
		 
		File shots= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(shots,new File("C:\\Users\\sumer\\eclipse-workspace\\Practice\\Pictures\\"+timeStamp+".png") );

	 }
}
