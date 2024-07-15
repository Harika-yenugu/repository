package MNO3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC1_Jobs_Add1 {
	
	WebDriver driver;
	
  @Test
  public void Addjobs1() {
	  
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
      //job
      driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")).click();
      //job title
      driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();
      //add button
      driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
      //add job title
      driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("sales26");
      //job description
      driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys("sales26 des");
      //job note
      driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")).sendKeys("sales2 note");
      //save button
      driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();

  }
  @Test
  
public void Addjobs2() {
	  
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
      //job
      driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")).click();
      //job title
      driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();
      //add button
      driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
      //add job title
      driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("sales27");
      //job description
      driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys("sales27 desp");
      //job note
      driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")).sendKeys("sales2 note");
      //save button
      driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();

  }

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
