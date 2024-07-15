package MouseActions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SliderDemo {
	
WebDriver driver;
	
	@Test
	public void Login_Test() throws Exception
	{
		

	driver =new ChromeDriver();
	driver.manage().window().maximize() ;	
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	//WebElement min

}
}

