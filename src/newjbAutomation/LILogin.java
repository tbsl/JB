package newjbAutomation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LILogin extends jobbuzzBaseFunctions{
	

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
	public void LIRegister()
	{
		driver.get("http://jobbuzz.timesjobs.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='fixed']/div[2]/ul[1]/li[2]/a")).click();
		//driver.findElement(By.xpath(p.getProperty("register_xpath"))).click();
		driver.findElement(By.xpath("//*[@id='myModalSignup']/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div[1]/a/img")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='session_key-oauthAuthorizeForm']")).sendKeys("manojtbsl3@gmail.com");
		driver.findElement(By.xpath("//*[@id='session_password-oauthAuthorizeForm']")).sendKeys("testtest@123");
		driver.findElement(By.xpath("//*[@id='body']/div/form/div[2]/ul/li[1]/input")).click();			
	}
	
	
	@AfterMethod(enabled=false)
	public void teardown()
	{
		driver.close();
	}
	
	

}
