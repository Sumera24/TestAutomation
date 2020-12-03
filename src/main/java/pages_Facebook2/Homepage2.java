package pages_Facebook2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage2 {
public WebDriver driver;
	
	//Store Locators for the elements
	@FindBy(name="email")
	WebElement emailField;
	
	@FindBy(name="pass")
	WebElement passwordField;
	
	@FindBy(name="login")
	WebElement loginButton;
	
	@FindBy(xpath ="//*[@id=\"content\"]/div/div/div/div[1]/h2" )
	WebElement displayText;
	
	@FindBy(xpath="//*[@id=\"u_0_a\"]/div[3]/a")
	WebElement forgotPasswordLink;
	
	@FindBy(linkText = "Create New Account")
	WebElement createAccountButton;
	
	@FindBy(linkText = "Create a Page") 
	WebElement createAPageLink;
	
	//Page Factory Constructor
	public Homepage2(WebDriver driver){
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
    
    public void clickCreateAccount() {
    	createAccountButton.click();
    }
    
    public void clickCreateAPage() {
    	createAPageLink.click();
    }
    
    public void verifyDisplayText() {
    	displayText.getText();
    }
}



