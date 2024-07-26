package pictures;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

public class NewTest2 {
	
	WebDriver driver;
	
  @Test
  public void f() throws IOException {
	  
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  TakesScreenshot srcShot1= (TakesScreenshot)driver;
      File SrcFile1=srcShot1.getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(SrcFile1, new File("C:\\Test0\\TC1_ScreenShot1.jpg"));
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
      TakesScreenshot srcShot2= (TakesScreenshot)driver;
      File SrcFile2=srcShot2.getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(SrcFile2, new File("C:\\Test0\\TC1_ScreenShot2.jpg"));

      driver.findElement(By.name("password")).sendKeys("admin123");
      TakesScreenshot srcShot3= (TakesScreenshot)driver;
      File SrcFile3=srcShot3.getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(SrcFile3, new File("C:\\Test0\\TC1_ScreenShot3.jpg"));
      
      
      driver.findElement(By.className("orangehrm-login-button")).click();
      TakesScreenshot srcShot4= (TakesScreenshot)driver;
      File SrcFile4=srcShot4.getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(SrcFile4, new File("C:\\Test0\\TC1_ScreenShot4.jpg"));
      
//<button data-v-10d463b7="" data-v-0af708be="" type="submit" class="oxd-button oxd-button--medium oxd-button--main orangehrm-login-button" fdprocessedid="rkwa3r"><!----> Login <!----></button>
	  
  }
}
