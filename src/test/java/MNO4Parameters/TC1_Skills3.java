package MNO4Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC1_Skills3 {
	//STEP-1
	WebDriver driver;
	String TestURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String UserName="Admin",Password="admin123";
	String SkillName="testing2000",SkillDescr="testing2000";
	
  @Test
  public void LoginTest() throws Exception {
	  TC1_Skills3 TC1=new TC1_Skills3();
	  TC1.openchromeBrowse();
	  TC1.openOrangeHRM(TestURL);           //STEP-2 GLOBAL VARIABLES
	  TC1.Login(UserName,Password);
	  TC1.AddSkills(SkillName,SkillDescr);
	  
	  
  }
  
  public void openchromeBrowse() {
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
  }
  public void openOrangeHRM(String TestURL1) {            //STEP=3 LOCAL VARIABLES
	  driver.get(TestURL1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	  
  }
   public void Login(String UserName1,String Password1) throws Exception{

		  findElement(By.name("username")).sendKeys(UserName1);
		  findElement(By.name("password")).sendKeys(Password1);
		  findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  
}
    public void AddSkills(String SkillName1,String SkillDescr1) throws Exception{
    	//admin
        findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]")).click();
		//Qualification
		findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		//Skills
		findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]")).click();
		//Add button
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		//Skills name
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SkillName1);
      //Skills Description
		findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(SkillDescr1);
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
