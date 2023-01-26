package Testing.FastraxCP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class LandingPage_Elements  {

	
	public static WebDriver driver;
	@Test
	public void launch() {
	ChromeOptions options = new ChromeOptions();
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver(options);
	
	LandingPage_Objects LandingPage_Object =new LandingPage_Objects(driver);
	LandingPage_Object.goTo();
	LandingPage_Object.loginPageActions("bhargav+1@zibtek.in","123456");
	
	
	
	

}
}