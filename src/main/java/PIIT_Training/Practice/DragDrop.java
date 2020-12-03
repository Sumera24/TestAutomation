package PIIT_Training.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumer\\eclipse-workspace\\Practice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
	
		//Webelement framesize=driver.findElement(By.tagName("iframe"));
		// JavascriptExecutor js=(JavascriptExecutor)driver;
     //    js.executeScript("window.scrollBy(0,1000)");
		
		int noOfFrames= driver.findElements(By.tagName("iframe")).size();
		System.out.println(noOfFrames);
		
		WebElement frame= driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		WebElement source= driver.findElement(By.id("draggable"));
		act.moveToElement(source).click().build().perform();
		WebElement target= driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(source, target).build().perform();
		
	     driver.switchTo().defaultContent();// Switch back from frame to main page
		
		WebElement selectLink=driver.findElement(By.linkText("Selectable"));// Main page element Selectable 
		act.moveToElement(selectLink).click().build().perform();

	}

}
