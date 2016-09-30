package newjbAutomation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FBlogin extends jobbuzzBaseFunctions {
	
	
	@BeforeMethod
	public void setup()
	{
		try {
			jobbuzzBaseFunctions.startup();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
		
	}
	
	
	@Test
	   public void FBRegister() throws InterruptedException
	   {
		   	driver.get(p.getProperty("jB_URL"));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.className(p.getProperty("login"))).click();
			Thread.sleep(4000);

			driver.findElement(By.xpath(p.getProperty("Fbbutton"))).click();
			
			/*WebDriverWait wait = new WebDriverWait(driver,50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myModalSignup']/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div[1]/div[1]/a")));*/
			
			//driver.findElement(By.xpath("//*[@id='myModalSignup']/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div[1]/div[1]/a")).click();
			//driver.findElement(By.xpath("//*[@id='account-chooser-add-account']")).click();
			driver.findElement(By.id(p.getProperty("EmailId"))).sendKeys("diveshpremchandani@gmail.com");
			driver.findElement(By.id(p.getProperty("Password"))).sendKeys("testtest@123");
			driver.findElement(By.xpath(p.getProperty("SubmitButton"))).click();
			System.out.println("Login Successful through Facebook");
	   }
	
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
	

}
