package PIIT_Training.Practice;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumer\\eclipse-workspace\\Practice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		//driver.get(" https://www.facebook.com/");
		
		
 //File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	FileHandler.copy(from, to);(shots,new File("C:\Users\sumer\eclipse-workspace\Practice\Pictures\Amazon.png"));
		
// FileHandler.copy(shots, new File("C:\\Users\\sumer\\eclipse-workspace\\Practice\\Pictures\\facebook.png"));
	
		//FileHandler.copy(shots, new File("C:\\Users\\sumer\\eclipse-workspace\\Practice\\Pictures\\facebook.png"));
	Date dt=new Date();
	System.out.println(dt);
	System.out.println(dt.toString());
	String pic=dt.toString().replace(" ", "_").replace(":", "_");
	 File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(shots, new File("C:\\Users\\sumer\\eclipse-workspace\\Practice\\Pictures\\"+pic+".png"));
	
	}

}
