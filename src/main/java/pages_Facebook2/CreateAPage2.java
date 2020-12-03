package pages_Facebook2;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CreateAPage2 {

	public WebDriver driver;
	 
	@FindBy(id="email")
	WebElement emailField;
	
	@FindBy(id="pass")
	WebElement passwordField;
	
	@FindBy(id="loginbutton")
	WebElement loginbutton;
	
	@FindBy(xpath = "//img[@src=\"/images/pages/create/biz_illustration.png\"]")
	WebElement image1;
	
	/*@FindBy(xpath = "//img[@src=\"/images/pages/create/community_illustration.png\"]")
	WebElement image2;*/
	
	@FindBy(xpath = "//img[@src=\"/images/pages/community_illustration.png\"]")
	WebElement image2;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div")
	WebElement getStartedButton1;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[2]/div/div[1]/div[2]/button/div/div")
	WebElement getStartedButton2;
	
	public CreateAPage2(WebDriver driver) {
						this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public void enterEmail() {
				emailField.sendKeys("Sumera");
						
	}
	
	public void enterPassword() {
					passwordField.sendKeys("asd123");
						}
	
	public void clickLogin() {
				loginbutton.click();
				}

	public void verifyImage1() {
						System.out.println(image1.isDisplayed());
								
			}
	
	public void verifyImage2() {
						System.out.println(image2.isDisplayed());
					
	}
	
}
