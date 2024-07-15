package MNO4Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC1_Skills2 {
	
	WebDriver driver;
	
  @Test
  public void LoginTest() throws Exception {
	  TC1_Skills2 TC1=new TC1_Skills2();
	  TC1.openchromeBrowse();
	  TC1.openOrangeHRM();
	  TC1.Login();
	  TC1.AddSkills();
	  
	  
  }
  
  public void openchromeBrowse() {
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
  }
  public void openOrangeHRM() {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	  
  }
   public void Login() throws Exception{

		  findElement(By.name("username")).sendKeys("Admin");
		  findElement(By.name("password")).sendKeys("admin123");
		  findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  
}
    public void AddSkills() throws Exception{
    	//admin
        findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]")).click();
		//Qualification
		findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		//Skills
		findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]")).click();
		//Add button
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		//Skills name
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("testing200");
      //Skills Description
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys("testing200");
		//Save Button
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
  }


   public  WebElement findElement(By by) throws Exception 
  {

  	WebElement elem = driver.findElement(by);  
  	
  	if (driver instanceof JavascriptExecutor) 
  	{
  	 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid black'", elem);
   
  	}
  	return elem;
  }

}
