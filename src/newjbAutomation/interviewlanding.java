package newjbAutomation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class interviewlanding extends jobbuzzBaseFunctions {
	

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
   public void GoogleplusLogin() throws InterruptedException
	   {
		   driver.get(p.getProperty("jB_URL"));
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.findElement(By.className(p.getProperty("login"))).click();
		   driver.findElement(By.xpath(p.getProperty("Gplusbutton"))).click();
		   
		   driver.findElement(By.xpath(p.getProperty("GplusEmail"))).sendKeys("manojtbsl3@gmail.com");
		   driver.findElement(By.xpath(p.getProperty("GplusNextButton"))).click();
		   driver.findElement(By.xpath(p.getProperty("Gpluspassword"))).sendKeys("testtest@123");
		   driver.findElement(By.xpath(p.getProperty("GplusSubmit"))).click();
		   Thread.sleep(1000);
		   
		  

		   
		   driver.findElement(By.xpath("//*[@id='navbar-collapse1']/ul/li[5]/a")).click();
		   driver.findElement(By.xpath("//*[@id='navbar-collapse1Wrap']/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]/div/select")).click();
		   driver.findElement(By.xpath("//*[@id='navbar-collapse1Wrap']/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]/div/select/option[3]")).click();
	   driver.findElement(By.xpath("//*[@id='navbar-collapse1Wrap']/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]/div/select/option[2]")).click();
	   driver.findElement(By.xpath("//*[@id='navbar-collapse1Wrap']/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]/div/select/option[1]")).click();
		   driver.findElement(By.xpath("//*[@id='interviewquesSection']/div[2]/div[2]/div[1]/ul/li[1]/a/img")).click();
		   driver.findElement(By.xpath("//*[@id='interviewquesSection']/div[2]/div[2]/div[2]/div[1]/a")).click();
		   driver.navigate().back();
		   driver.findElement(By.xpath("//*[@id='navbar-collapse1']/ul/li[5]/a")).click();
		   driver.findElement(By.xpath("//*[@id='interviewquesSection']/div[2]/div[2]/div[3]/h3/a")).click(); 
		 
		     
		 }
	
	
	@AfterMethod(enabled=false)
	public void teardown()
	{
		driver.close();
	}

	@Test
	   public void GoogleplusLogin1() throws InterruptedException
	   {
		   driver.get(p.getProperty("jB_URL"));
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.findElement(By.className(p.getProperty("login"))).click();
		   driver.findElement(By.xpath(p.getProperty("Gplusbutton"))).click();
		   
		   driver.findElement(By.xpath(p.getProperty("GplusEmail"))).sendKeys("manojtbsl3@gmail.com");
		   driver.findElement(By.xpath(p.getProperty("GplusNextButton"))).click();
		   driver.findElement(By.xpath(p.getProperty("Gpluspassword"))).sendKeys("testtest@123");
		   driver.findElement(By.xpath(p.getProperty("GplusSubmit"))).click();
		   Thread.sleep(1000);
		   
		  
		  
		   
		   driver.findElement(By.xpath("//*[@id='navbar-collapse1']/ul/li[5]/a")).click();
		   driver.findElement(By.xpath("//*[@id='navbar-collapse1Wrap']/div/div/div/div/div[2]/div[1]/div[1]/div/div[2]/div/a")).click();
		   driver.findElement(By.xpath("//*[@id='navbar-collapse1Wrap']/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div[2]/div[1]/div[4]/div/img")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//*[@id='navbar-collapse1Wrap']/div/div/div/div/div[2]/div[1]/div[1]/div/div[3]/div/a")).click();
		   driver.findElement(By.xpath("//*[@id='navbar-collapse1Wrap']/div/div/div/div/div[2]/div[1]/div[3]/div[2]/div/div[2]/div[1]/div[1]/div/img")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//*[@id='navbar-collapse1Wrap']/div/div/div/div/div[2]/div[1]/div[1]/div/div[4]/div/a")).click();
		   driver.findElement(By.xpath("//*[@id='navbar-collapse1Wrap']/div/div/div/div/div[2]/div[1]/div[3]/div[3]/div/div[2]/div[1]/div[4]/div/img")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//*[@id='navbar-collapse1Wrap']/div/div/div/div/div[2]/div[1]/div[3]/div[3]/div/div[2]/a")).click();
		 
		 
}

}
