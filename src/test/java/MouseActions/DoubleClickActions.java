package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClickActions {
	
	
static WebDriver driver;
	
	@Test
	public void Login_Test() throws Exception
	{
		

	driver =new ChromeDriver();
	driver.manage().window().maximize() ;	
	driver.get("http://testautomationpractice.blogspot.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	//findElement(By.xpath("//*[@id='HTML10']/div[1]/button")).click();
	
	//driver.switchTo().frame("iframeResult");
	WebElement Copy=driver.findElement(By.xpath("//*[@id='HTML10']/div[1]/button"));
	
	//Copy.clear();
	//Copy.sendKeys("Harika");
	
	Actions actions = new Actions(driver);
	
	actions.doubleClick(Copy).perform();


		
	}
	
	
	
	 public  WebElement findElement(By by) throws Exception 
		{
	
			WebElement element = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid blue'", element);
		 
			}
			return element;
		}

	


}
