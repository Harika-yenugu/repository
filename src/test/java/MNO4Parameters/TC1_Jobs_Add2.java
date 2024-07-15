package MNO4Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC1_Jobs_Add2 {
	
	WebDriver driver;
	String TestURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String UserName="Admin",Password="admin123";
	String JobTitle="Sales1",JobDescr="Sales1",JobNote="Sales2";
	
  @Test
  public void Addjobs1() throws Exception {
	  
	  TC1_Jobs_Add2 TC1 = new TC1_Jobs_Add2();
	  TC1.openchromeBrowse();
	  TC1.openOrangeHRM(TestURL);           //STEP-2 GLOBAL VARIABLES
	  TC1.Login(UserName,Password);
	  TC1.AddJobs(JobTitle,JobDescr,JobNote);
 }
  public void openchromeBrowse() {
	  driver = new ChromeDriver();  
		driver.manage().window().maximize();

	  
  }
  public void openOrangeHRM(String TestURL1) {
	  driver.get(TestURL1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 

	  
  }
  public void Login(String UserName1,String Password1) throws Exception {
	  findElement(By.name("username")).sendKeys(UserName1);
	  findElement(By.name("password")).sendKeys(Password1);
	  findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  
  }
  public void AddJobs(String JobTitle1,String JobDescr1,String JobNote1) throws Exception {
	//admin
      findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]")).click();
      //job
      findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")).click();
      //job title
      findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();
      //add button
      findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
      //add job title
      findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(JobTitle1);
      //job description
      findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(JobDescr1);
      //job note
      findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")).sendKeys(JobNote1);
      //save button
      findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();
	  
  }
  


  public  WebElement findElement(By by) throws Exception 
  {

  	WebElement elem = driver.findElement(by);  
  	
  	if (driver instanceof JavascriptExecutor) 
  	{
  	 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid purple'", elem);
   
  	}
  	return elem;
  }

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
