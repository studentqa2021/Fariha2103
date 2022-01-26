package practice_selenium_automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;

public class BaseLogin {

	public void getLogin() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(BaseConfig.getconfig("URL"));
		
		Masterpagefactory mpf= new Masterpagefactory(driver) ;
        
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='5px solid red'", mpf.getUsername());
		mpf.getUsername().sendKeys(BaseConfig.getconfig("username"));
		mpf.getPassword().sendKeys(BaseConfig.getconfig("password"));
		mpf.getLogin().click();
		
		
		
		
	}
	
	
		

}
