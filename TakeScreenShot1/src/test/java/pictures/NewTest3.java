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

public class NewTest3 {
	
	static WebDriver driver;
	static String FolderLocation="C:\\Test0";
	
  @Test
  public void AddNationalities() throws IOException {
	  
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  NewTest3.TakescreenShot(FolderLocation,"screenshot1.jpg");
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  NewTest3.TakescreenShot(FolderLocation,"screenshot2.jpg");
	  
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  NewTest3.TakescreenShot(FolderLocation,"screenshot3.jpg");
	  
	  driver.findElement(By.className("orangehrm-login-button")).click();
	  NewTest3.TakescreenShot(FolderLocation,"screenshot4.jpg");
  }

private static void TakescreenShot(String folderLocation2, String string2) throws IOException {
	// TODO Auto-generated method stub
	
	TakesScreenshot srcShot4= (TakesScreenshot)driver;
    File SrcFile4=srcShot4.getScreenshotAs(OutputType.FILE);
     
    String str=folderLocation2+"\\"+string2;
    
    FileUtils.copyFile(SrcFile4, new File(str));

	
	
	
	
}
}
