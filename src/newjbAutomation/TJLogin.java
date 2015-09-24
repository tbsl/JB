package newjbAutomation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TJLogin extends jobbuzzBaseFunctions {

	@BeforeMethod
	public void setup()
	{
		try {
			jobbuzzBaseFunctions.startup();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*//driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
		
	}
	
	@Test
	   public void TJLogin()
	   {
		   driver.get(p.getProperty("jB_URL"));
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.findElement(By.className(p.getProperty("login"))).click();
		   driver.findElement(By.xpath(p.getProperty("TJbutton"))).click();
		   
		   driver.findElement(By.name(p.getProperty("TJEmail"))).sendKeys("manojtbsl2@gmail.com");
		   driver.findElement(By.name(p.getProperty("TJpassword"))).sendKeys("password");
		   driver.findElement(By.xpath(p.getProperty("TJSignIn"))).click();
		   System.out.println("Login Successful through TimesJObs");  	   
	   }

	
	@AfterMethod(enabled=false)
	public void teardown()
	{
		driver.close();
	}
	
	
	
}
