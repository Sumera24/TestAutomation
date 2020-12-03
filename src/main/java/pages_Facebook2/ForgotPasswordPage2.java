package pages_Facebook2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage2 {

public WebDriver driver;
	
	//Store Locators for the elements
	@FindBy(id="identify_email")
	WebElement searchField;
	
	@FindBy(name="did_submit")
	WebElement searchbutton;
	
	@FindBy(xpath="//*[@id=\"identify_yourself_flow\"]/div/div[3]/div/div[1]/a/span")
	WebElement cancelButton;
	
	 @FindBy(xpath="//*[@id=\"identify_yourself_flow\"]/div/div[1]/div/div[2]/h2")
	 WebElement displayData;
	
	//Page Factory Constructor
		public ForgotPasswordPage2(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
}
		//Creation Of Methods For each Elements in accordance with the actions
		public void entersearchdata(String data) {
			searchField.sendKeys(data);
		}
		
		public void clickSearchButton() {
			searchbutton.click();
		}
		
		public void clickCancelButton() {
			cancelButton.click();
		}
		
		/*public WebElement verifyDisplayData() {
			return displayData;
		
			
		}*/
		
		public String verifyDisplayData() {
			String s= displayData.getText();
			return s;
		
			
		}
		
		
}

