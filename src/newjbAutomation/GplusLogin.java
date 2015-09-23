package newjbAutomation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GplusLogin extends jobbuzzBaseFunctions {
	

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
	   public void GoogleplusLogin()
	   {
		   driver.get(p.getProperty("jB_URL"));
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.findElement(By.className(p.getProperty("login"))).click();
		   driver.findElement(By.xpath(p.getProperty("Gplusbutton"))).click();
		   
		   driver.findElement(By.xpath(p.getProperty("GplusEmail"))).sendKeys("manojtbsl3@gmail.com");
		   driver.findElement(By.xpath(p.getProperty("GplusNextButton"))).click();
		   driver.findElement(By.xpath(p.getProperty("Gpluspassword"))).sendKeys("testtest@123");
		   driver.findElement(By.xpath(p.getProperty("GplusSubmit"))).click();
		   System.out.println("Login Successful through GooglePlus");  
		   
	   }
	
	
	@AfterMethod(enabled=false)
	public void teardown()
	{
		driver.close();
	}
	

}
