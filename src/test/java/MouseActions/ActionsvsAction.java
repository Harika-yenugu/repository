package MouseActions;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsvsAction {
	
	
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
	
	//Action myaction= actions.contextClick(Button).build();
	//myaction.perform();
	

}

	private WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}