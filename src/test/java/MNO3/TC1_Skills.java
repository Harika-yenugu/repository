package MNO3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC1_Skills {
	
	WebDriver driver;
	
  @Test
  public void LoginTest() {
	  
	  driver= new ChromeDriver();
	  driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.findElement(By.name("password")).sendKeys("admin123");
		  driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		

				
		//admin
      driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]")).click();
		//Qualification
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		//Skills
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]")).click();
		//Add button
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		//Skills name
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("testing");
      //Skills Description
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys("testing2");
		//Save Button
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();




  }
}
