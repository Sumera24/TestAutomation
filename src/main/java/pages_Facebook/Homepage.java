 package pages_Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver driver;
	
	//Store Locators for the elements
	@FindBy(name="email")
	WebElement emailField;
	
	@FindBy(name="pass")
	WebElement passwordField;
	
	@FindBy(name="login")
	WebElement loginButton;
	
	@FindBy(xpath="//*[@id=\"u_0_a\"]/div[3]/a")
	WebElement forgotPasswordLink;
	
	//Page Factory Constructor
	public Homepage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Creation Of Methods For each Elements in accordance with the actions
	public void enterEmail(String email) {
		emailField.clear();
		emailField.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}
	
    public void clickLogin() {
    	loginButton.click();
    }
    
    public void clickForgotPassword() {
    	forgotPasswordLink.click();
    }
}
