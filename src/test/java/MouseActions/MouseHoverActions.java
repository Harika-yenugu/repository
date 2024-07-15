package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverActions {
	
	
	WebDriver driver;
	
	  @Test
	  public void f() throws Exception {
		  
		    driver=new ChromeDriver();
			driver.manage().window().maximize() ;
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://Amazon.in");
			
			
			WebElement All=findElement(By.xpath("//span[text()='All']"));
			WebElement Best_Sellers=findElement(By.xpath("//a[text()='Best Sellers']"));
			
			Actions actions2=new Actions(driver);
			actions2.moveToElement(All).moveToElement(Best_Sellers).
			click().build().perform();
			
			
	  }

	private WebElement findElement(By by) throws InterruptedException {
		
		
		WebElement element = driver.findElement(by);
         Thread.sleep(500);
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid blue'", element);
	 
		}

		// TODO Auto-generated method stub
		return null;
	}
}



