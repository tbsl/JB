package newjbAutomation;

import java.io.IOException;

import org.openqa.selenium.By;


import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Interviewposting extends jobbuzzBaseFunctions{
	
	@BeforeMethod
	public void setup()
	{
		try {
			jobbuzzBaseFunctions.startup();
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*//driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
		
	}
	
	@Test
	public void interviewpost()
	{
		
		driver.get(p.getProperty("jB_URL"));
		driver.findElement(By.xpath("//*[@id='navbar-collapse1']/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id='Intestep1']/div[2]/a")).click();
		driver.findElement(By.name("question")).sendKeys("what is automation");
		driver.findElement(By.name("skillName")).sendKeys("selenium");
		driver.findElement(By.className("addintskill")).click();
		driver.findElement(By.xpath("//*[@id='questionInfo']/div/div[6]/div[2]/a[1]")).click();
		
		driver.findElement(By.name("company")).sendKeys("Hcl Technologies Ltd");
		driver.findElement(By.name("role")).sendKeys("System Engineer");
		driver.findElement(By.id("submitinterview")).click();
		
		//String popup = driver.getWindowHandle();
		//driver.switchTo();
		
		driver.findElement(By.name("userId")).sendKeys("manojtbsl2@gmail.com");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id='editDetail']/div/div[5]/div/input[2]")).click();
		
		driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[1]/div[3]/div/div/div/div/div/a")).click();
		driver.findElement(By.name("jobTitle")).sendKeys("product manager");
		driver.findElement(By.name("interviewLocation")).sendKeys("jaipur");
		driver.findElement(By.linkText("TELL US HOW DIFFICULT IT WAS?")).click();
		driver.findElement(By.linkText("WHEN WAS IT STARTED?")).click();
		driver.findElement(By.linkText("TELL US WHAT IT INVOLVED?")).click();
		driver.findElement(By.linkText("DID YOU RECIEVE AN OFFER?")).click();
		driver.findElement(By.linkText("RATE ON OVERALL EXPERIENCE")).click();
		driver.findElement(By.xpath("//*[@id='interviewprocessdone']")).click();
		String Successmsg = driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[2]/div[7]/div/div/div/div/div/div")).getText();
		
		System.out.println(Successmsg);
	
	}
	
	
	
	
	@AfterMethod(enabled=false)
	public void teardown()
	{
		driver.close();
	}
	

}
