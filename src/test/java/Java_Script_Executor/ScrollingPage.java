package Java_Script_Executor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollingPage {
	
WebDriver driver;
    
    @Test
    public void ByPixel() throws Exception {
    	
	    driver=new ChromeDriver();
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://Amazon.in");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,1500)");
        System.out.println("return window.pageYoffset;");
    }



}
