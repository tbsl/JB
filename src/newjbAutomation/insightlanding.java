package newjbAutomation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class insightlanding extends jobbuzzBaseFunctions {
	

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
	   public void GoogleplusLogin5() throws InterruptedException
	   {
	   driver.get(p.getProperty("jB_URL"));
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.findElement(By.className(p.getProperty("login"))).click();
	   driver.findElement(By.xpath(p.getProperty("Gplusbutton"))).click();
   
   driver.findElement(By.xpath(p.getProperty("GplusEmail"))).sendKeys("manojtbsl3@gmail.com");
   driver.findElement(By.xpath(p.getProperty("GplusNextButton"))).click();
   driver.findElement(By.xpath(p.getProperty("Gpluspassword"))).sendKeys("testtest@123");
   driver.findElement(By.xpath(p.getProperty("GplusSubmit"))).click();
   driver.findElement(By.xpath("//*[@id='navbar-collapse1']/ul/li[6]/a")).click();
   driver.findElement(By.xpath("//*[@id='insightpage']/div[1]/div[2]/div[3]/h4/a/strong")).click();
   
   
   
 //*[@id='navbar-collapse1']/ul/li[6]/a
	   }	  
	
	
	@AfterMethod(enabled=false)
	public void teardown()
	{
		driver.close();
	}




@Test
public void GoogleplusLogin6() throws InterruptedException
{
	{
driver.get(p.getProperty("jB_URL"));
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.findElement(By.className(p.getProperty("login"))).click();
driver.findElement(By.xpath(p.getProperty("Gplusbutton"))).click();

driver.findElement(By.xpath(p.getProperty("GplusEmail"))).sendKeys("manojtbsl3@gmail.com");
driver.findElement(By.xpath(p.getProperty("GplusNextButton"))).click();
driver.findElement(By.xpath(p.getProperty("Gpluspassword"))).sendKeys("testtest@123");
driver.findElement(By.xpath(p.getProperty("GplusSubmit"))).click();
driver.findElement(By.xpath("//*[@id='navbar-collapse1']/ul/li[6]/a")).click();
driver.findElement(By.xpath("//*[@id='insightpage']/div[1]/div[2]/div[2]/div[1]/a")).click();

}
}
}