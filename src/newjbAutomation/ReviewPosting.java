package newjbAutomation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReviewPosting extends jobbuzzBaseFunctions {
	
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
	   public void reviewposting() throws InterruptedException
	   {
		   driver.get("http://jobbuzz.timesjobs.com/");
		   driver.findElement(By.xpath("//*[@id='navbar-collapse1']/ul/li[2]/a")).click();
		   driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[1]/div[1]/div/a")).click();
		   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[1]/div[1]/a")).click();
		   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[2]/form/div/div/div[3]/div/div/span[1]/input")).sendKeys("fasttrack india pvt ltd");
		   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[2]/form/div/div/div[4]/div/div/span[1]/input")).sendKeys("new designation");
		   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[2]/form/div/div/div[5]/div/div/span[1]/input")).sendKeys("new designation");
		   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[2]/form/div/div/div[6]/div/a[1]")).click();
		   
		   Thread.sleep(4000);
		   									   
		   
		    driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[3]/form/div/div/div[1]/div[1]/div/div/div[2]/div")).click();
		   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[3]/form/div/div/div[1]/div[2]/div/div/div[2]/div")).click();
		   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[3]/form/div/div/div[1]/div[3]/div/div/div[2]/div")).click();
		   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[3]/form/div/div/div[1]/div[4]/div/div/div[2]/div")).click();
		   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[3]/form/div/div/div[2]/div/a[1]")).click();
		   
		   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[4]/form/div/div/div[2]/div/div[2]/div/span[1]/input")).sendKeys("123456");
		   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[4]/form/div/div/div[3]/div/div[2]/div[1]/div/span")).click();
		   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[4]/form/div/div/div[4]/div/a[1]")).click();
		   
		   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[5]/div/div/div[3]/div/a")).click();
		   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[6]/div/div/div[3]/div/a")).click();
		   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[7]/div/div/div[4]/div/a")).click();
		   
		   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[8]/form/div/div/div[1]/div/div/span[1]/input")).sendKeys("Give your review a headline manoj");
		   driver.findElement(By.xpath("//*[@id='labelpros']")).click();
		   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[8]/form/div/div/div[2]/div[1]/div/span[1]/ul/li[3]/span/input")).click();
		   driver.findElement(By.xpath("//*[@id='labelpros']")).click();
		   
		   driver.findElement(By.xpath("//*[@id='labelcons']")).click();
		   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[8]/form/div/div/div[3]/div[1]/div/span[1]/ul/li[2]/span/input")).click();
		   driver.findElement(By.xpath("//*[@id='labelcons']")).click();
		   
		   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[8]/form/div/div/div[4]/div/a[1]")).click();
		   
		   
		   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[9]/div/div/div[1]/div/textarea")).sendKeys("manoj kumar bansal");
		   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[9]/div/div/div[2]/div/textarea")).sendKeys("JB QC team");
		   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[9]/div/div/div[3]/div/a")).click();
		   
	   }
	   	
	
	@AfterMethod(enabled=false)
	public void teardown()
	{
		driver.close();
	}

}
