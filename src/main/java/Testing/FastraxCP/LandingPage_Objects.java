package Testing.FastraxCP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LandingPage_Objects {
	
	WebDriver driver;
	public LandingPage_Objects(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="exampleInputEmail1")
	WebElement userName;
	@FindBy(id="exampleInputPassword1")
	WebElement password;
	@FindBy(xpath="//button[text()='Log in']")
	WebElement click;

	public void loginPageActions(String email,String Password1) {
	userName.sendKeys(email);	
	password.sendKeys(Password1);
	click.click();
	}
	public void goTo() {
		driver.get("http://13.68.226.30/login/rakshith-and-co/8lTYMcQDO");
	}
}
