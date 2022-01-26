package practice_selenium_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Masterpagefactory {
	
	public Masterpagefactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//*[@class='input_error form_input']")
	private WebElement username;
	
	//@FindBy(xpath="//*[@id='password']")
	//private WebElement password;
	
	@FindBy(xpath="//*[contains(@id,'password')]")
	private WebElement password;
	
	
	
	@FindBy(xpath="//*[@id='login-button']")
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
}
