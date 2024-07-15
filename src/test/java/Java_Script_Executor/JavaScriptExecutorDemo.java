package Java_Script_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;

public class JavaScriptExecutorDemo {
WebDriver driver;
	
	
    @Test		
    public void Login() throws Exception 					
    {		
	    driver=new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//when ever getting element intercepted exception we have to use
		//these for sendKeys()
		WebElement Inputbox=driver.findElement(By.xpath("//input[@text()='name']"));
	
		JavascriptExecutor js = (JavascriptExecutor)driver;	
        js.executeScript("arguments[0].value='Admin';", Inputbox);
        
        //these for click() 
        WebElement button=driver.findElement(By.xpath("//input[@text()='name']"));
    	
        js.executeScript("arguments[0].click()", button);

		    }
	  
    }
    
    
    
    


