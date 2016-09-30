package newjbAutomation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class companynavigation extends jobbuzzBaseFunctions {
	

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
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[1]/div[1]/div/div[1]/div[2]/a")).click();
	   driver.findElement(By.xpath("//*[@id='companypage']/div[2]/div/div/div[3]/div[2]/div[2]/div/div/div[1]/a")).click();
		   
		   driver.navigate().back();
		   driver.findElement(By.xpath("//*[@id='companypage']/div[2]/div/div/div[3]/div[2]/div[2]/div/div/div[2]/a")).click();
		   driver.navigate().back();
		   driver.findElement(By.xpath("//*[@id='companypage']/div[2]/div/div/div[3]/div[2]/div[2]/div/div/div[3]/a")).click();
	   driver.navigate().back();
		   driver.findElement(By.xpath("//*[@id='companypage']/div[2]/div/div/div[3]/div[2]/div[2]/div/div/div[4]/a")).click();
	   driver.navigate().back();
	   driver.findElement(By.xpath("//*[@id='companypage']/div[2]/div/div/div[1]/input[1]")).click();
	   }
		   //driver.navigate().back();
	
		   //driver.findElement(By.xpath("//*[@id='companypage']/div[2]/div/div/div[1]/input[1]")).click();
		   //driver.findElement(By.xpath("//*[@id='searchForm']/div/div/div[1]/div/div/div")).click();
		   //driver.navigate().back();
		   
		   //driver.findElement(By.xpath("//*[@id='typeahead-00W-4818-option-0']/a/strong")).sendKeys("");
		 
	  
	
	
	@AfterMethod(enabled=false)
	public void teardown()
	{
		driver.close();
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
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[1]/div[1]/div/div[1]/div[2]/a")).click();
		   driver.findElement(By.xpath("//*[@id='companypage']/div[5]/div/div/div/a[2]")).click();
		   Thread.sleep(20000);
		   //driver.findElement(By.xpath("//*[@id='navbar-collapse1Wrap']/div/div/div[1]/div[2]/div/div/div/section/div/div[2]/div/select")).click();
//		   select review=new select (driver.findElement(By.xpath("//*[@id='navbar-collapse1Wrap']/div/div/div[1]/div[2]/div/div/div/section/div/div[2]/div/select")));
//		   review.SelectByVisibleText("I am curoious to know about the work culture at your company");
//		   review.selectByIndex(2);
		   System.out.println("ashish");
		   driver.findElement(By.xpath(".//*[@id='navbar-collapse1Wrap']/div/div/div[1]/div[2]/div/div/div/section/div/ul/li[3]/span[1]/span")).click();
	       System.out.println();
		   
}
}
	