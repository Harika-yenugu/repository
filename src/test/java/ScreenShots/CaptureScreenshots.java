package ScreenShots;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureScreenshots {
	
	WebDriver driver;

	
	@Test
	public void Login_Test() throws Exception
	{
		

	driver =new ChromeDriver();
	driver.manage().window().maximize() ;	
	driver.get("http://testautomationpractice.blogspot.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	
	
	}
}
