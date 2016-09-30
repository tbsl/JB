package newjbAutomation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class searchfunctionality extends jobbuzzBaseFunctions {
	

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
		   driver.findElement(By.xpath("//*[@id='navbar-collapse1']/ul/li[2]/a")).click();
		   driver.findElement(By.xpath("//*[@id='navbar-collapse1']/ul/li[7]/a/img")).click();
		   driver.findElement(By.xpath("//*[@id='compamySearchText']")).sendKeys("HCL PERIPHERALS");
		  
		   Thread.sleep(1000);
		   
		   driver.findElement(By.xpath("//*[@id='searchForm']/div/div/div[1]/div/div/div")).click();
		   driver.navigate().back();
		   
		   //driver.findElement(By.xpath("//*[@id='typeahead-00W-4818-option-0']/a/strong")).sendKeys("");
		 
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
		  
		   driver.findElement(By.xpath("//*[@id='navbar-collapse1']/ul/li[2]/a")).click();
		   driver.findElement(By.xpath("//*[@id='navbar-collapse1']/ul/li[7]/a/img")).click();
		   driver.findElement(By.xpath("//*[@id='searchForm']/div/ul/li[2]/a")).click();
		   driver.findElement(By.xpath("//*[@id='interviewsearchText']")).sendKeys("java");
	
		   
		   driver.findElement(By.xpath("//*[@id='searchForm']/div/div/div[2]/div/div/div/input")).click();
		   driver.navigate().back();
		   
		   //driver.findElement(By.xpath("//*[@id='typeahead-00W-4818-option-0']/a/strong")).sendKeys("");
		 
	   }
	

//	@Test
//	   public void GoogleplusLogin2() throws InterruptedException
//	   
//	{
//		   driver.get(p.getProperty("jB_URL"));
//		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		   driver.findElement(By.className(p.getProperty("login"))).click();
//		   driver.findElement(By.xpath(p.getProperty("Gplusbutton"))).click();
//		   
//		   driver.findElement(By.xpath(p.getProperty("GplusEmail"))).sendKeys("manojtbsl3@gmail.com");
//		   driver.findElement(By.xpath(p.getProperty("GplusNextButton"))).click();
//		   driver.findElement(By.xpath(p.getProperty("Gpluspassword"))).sendKeys("testtest@123");
//		   driver.findElement(By.xpath(p.getProperty("GplusSubmit"))).click();
//		  
//		   driver.findElement(By.xpath("//*[@id='navbar-collapse1']/ul/li[2]/a")).click();
//		   driver.findElement(By.xpath("//*[@id='navbar-collapse1']/ul/li[7]/a/img")).click();
//		   driver.findElement(By.xpath("//*[@id='searchForm']/div/ul/li[3]/a")).click();
//		   driver.findElement(By.xpath("//*[@id='interviewsearchText']")).sendKeys("java developer");
//	
//		   
//		   driver.findElement(By.xpath("//*[@id='searchForm']/div/div/div[2]/div/div/div/input")).click();
//		   driver.navigate().back();
//		   
//		   //driver.findElement(By.xpath("//*[@id='typeahead-00W-4818-option-0']/a/strong")).sendKeys("");
//		 
//		   
//		   
//	   }


	@Test
	   public void GoogleplusLogin3() throws InterruptedException
	   
	{
		   driver.get(p.getProperty("jB_URL"));
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.findElement(By.className(p.getProperty("login"))).click();
		   driver.findElement(By.xpath(p.getProperty("Gplusbutton"))).click();
		   
		   driver.findElement(By.xpath(p.getProperty("GplusEmail"))).sendKeys("manojtbsl3@gmail.com");
		   driver.findElement(By.xpath(p.getProperty("GplusNextButton"))).click();
		   driver.findElement(By.xpath(p.getProperty("Gpluspassword"))).sendKeys("testtest@123");
		   driver.findElement(By.xpath(p.getProperty("GplusSubmit"))).click();
		  
		   driver.findElement(By.xpath("//*[@id='navbar-collapse1']/ul/li[2]/a")).click();
		   driver.findElement(By.xpath("//*[@id='navbar-collapse1']/ul/li[7]/a/img")).click();
		   driver.findElement(By.xpath("//*[@id='searchForm']/div/ul/li[3]/a")).click();
		   driver.findElement(By.xpath("//*[@id='jobsSearchText']")).sendKeys("core java");
	
		   
		   driver.findElement(By.xpath("//*[@id='searchForm']/div/div/div[3]/div/div/div/input")).click();
		   driver.navigate().back();








	}
	
	
	@Test
	   public void GoogleplusLogin4() throws InterruptedException
	   
	{
		   driver.get(p.getProperty("jB_URL"));
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.findElement(By.className(p.getProperty("login"))).click();
		   driver.findElement(By.xpath(p.getProperty("Gplusbutton"))).click();
		   
		   driver.findElement(By.xpath(p.getProperty("GplusEmail"))).sendKeys("manojtbsl3@gmail.com");
		   driver.findElement(By.xpath(p.getProperty("GplusNextButton"))).click();
		   driver.findElement(By.xpath(p.getProperty("Gpluspassword"))).sendKeys("testtest@123");
		   driver.findElement(By.xpath(p.getProperty("GplusSubmit"))).click();
		  
		   driver.findElement(By.xpath("//*[@id='navbar-collapse1']/ul/li[2]/a")).click();
		   driver.findElement(By.xpath("//*[@id='navbar-collapse1']/ul/li[7]/a/img")).click();
		   driver.findElement(By.xpath("//*[@id='searchForm']/div/ul/li[4]/a")).click();
		   driver.findElement(By.xpath("//*[@id='jobsSalaryText']")).sendKeys("icici bank ltd");
	
		   
		   driver.findElement(By.xpath("//*[@id='searchForm']/div/div/div[4]/div/div/div/input")).click();
		   driver.navigate().back();





}
	
}


