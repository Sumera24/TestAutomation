package pages_Facebook2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage2 {

	public WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"u_1_b\"]")
	WebElement firstNameTextbox;
	
	@FindBy(name = "lastname")
	WebElement lastNameTextbox;
	
	@FindBy(name = "reg_email__")
	WebElement mobileEmailTextbox;
	
	@FindBy(id = "password_step_input")
	WebElement passwordTextbox;
	
	@FindBy(id = "month")
	WebElement monthDropdown;
	
	@FindBy(id="day")
	WebElement dayDropdown;
	
	@FindBy(id="year")
	WebElement yearDropdown;
	
	@FindBy(xpath = "//*[text()='Female'] ") 
	WebElement fGenderButton;
	
	@FindBy(xpath = "//*[@id=\"u_5_3\"]")
	WebElement mGenderButton;
	
	@FindBy(xpath = "//*[@id=\"u_5_4\"]")
	WebElement cGenderButton;
	
	@FindBy(name = "websubmit")
	WebElement signUp;
	
	//Page Factory Constructor
	public CreateAccountPage2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	public void enerFirstName() {
		firstNameTextbox.sendKeys("Semera");
	}		
	
	public void enterLastName() {
		lastNameTextbox.sendKeys("Qazi");
	}
	
	public void enterMobileEmail() {
		mobileEmailTextbox.sendKeys("sumeraqazi@yahoo.com");
	}
	
	public void enterMobilePassword() {
		passwordTextbox.sendKeys("sum4567");
	}
	
	public void selectmonth() {
		Select password=new Select(monthDropdown);
		password.selectByValue("3");
	}
	
	public void selectday() {
		Select day=new Select(dayDropdown);
		day.selectByValue("20");
	}
	
	public void selectyear() {
		Select year=new Select(yearDropdown);
		year.selectByValue("2020");
	}
	
	public void clickmGender() {
		mGenderButton.click();
	}
	
	public void clickfGender() {
		fGenderButton.click();
	}
	
	public void clickcGender() {
		cGenderButton.click();
	}
	
	public void clickSignUp() {
		signUp.click();
	}
	}

