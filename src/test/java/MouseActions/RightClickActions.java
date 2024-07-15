package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClickActions {
	
	WebDriver driver;
	
	@Test
	public void Login_Test() throws Exception
	{
		

	driver =new ChromeDriver();
	driver.manage().window().maximize() ;	
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	WebElement Button=findElement(By.xpath("//span[text()='right click me']"));
	
	Actions actions = new Actions(driver);
	
	actions.contextClick(Button).perform();


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

