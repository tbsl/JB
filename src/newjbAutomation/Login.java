package newjbAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends jobbuzzBaseFunctions {
	
	
	//public static WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	
	
	@Test(enabled=false)
	public void emailRegister()
	{
		driver.get("http://jobbuzz.timesjobs.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='fixed']/div[2]/ul[1]/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='myModalSignup']/div/div/div[2]/div/div/div[1]/form/div/div[1]/div/div/span[1]/input")).sendKeys("manoj");
		driver.findElement(By.xpath("//*[@id='myModalSignup']/div/div/div[2]/div/div/div[1]/form/div/div[2]/div/div/span[1]/input")).sendKeys("tt12@gmail.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String validation_msg = driver.findElement(By.xpath("//*[@id='myModalSignup']/div/div/div[2]/div/div/div[1]/form/div/div[2]/div/div/div[2]/span[2]")).getText();
		if(validation_msg != null ||  validation_msg.length() > 0)
		{
			System.out.println(validation_msg);
			System.out.println("manoj kumar bansal");
			driver.findElement(By.xpath("//*[@id='myModalSignup']/div/div/div[2]/div/div/div[1]/form/div/div[2]/div/div/span[1]/input")).clear();
			driver.findElement(By.xpath("//*[@id='myModalSignup']/div/div/div[2]/div/div/div[1]/form/div/div[2]/div/div/span[1]/input")).sendKeys("tt125@gmail.com");
		}
		
		driver.findElement(By.xpath("//*[@id='myModalSignup']/div/div/div[2]/div/div/div[1]/form/div/div[3]/div/div/span[1]/input")).sendKeys("password");
		driver.findElement(By.xpath("//*[@name = 'password']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id='myModalSignup']/div/div/div[2]/div/div/div[1]/form/div/div[4]/div/input")).click();
				
	}
	
	
	@Test(enabled=false)
	public void emailRegister_1()
	{
		driver.get("http://jobbuzz.timesjobs.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='fixed']/div[2]/ul[1]/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='myModalSignup']/div/div/div[2]/div/div/div[1]/form/div/div[1]/div/div/span[1]/input")).sendKeys("manoj");
		driver.findElement(By.xpath("//*[@id='myModalSignup']/div/div/div[2]/div/div/div[1]/form/div/div[2]/div/div/span[1]/input")).sendKeys("tt120@gmail.com");
		/*driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String validation_msg = driver.findElement(By.xpath("//*[@id='myModalSignup']/div/div/div[2]/div/div/div[1]/form/div/div[2]/div/div/div[2]/span[2]")).getText();
		if(validation_msg != null ||  validation_msg.length() > 0)
		{
			System.out.println(validation_msg);
			System.out.println("manoj kumar bansal");
			driver.findElement(By.xpath("//*[@id='myModalSignup']/div/div/div[2]/div/div/div[1]/form/div/div[2]/div/div/span[1]/input")).sendKeys("tt125@gmail.com");
		}*/
		
		driver.findElement(By.xpath("//*[@id='myModalSignup']/div/div/div[2]/div/div/div[1]/form/div/div[3]/div/div/span[1]/input")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id='myModalSignup']/div/div/div[2]/div/div/div[1]/form/div/div[4]/div/input")).click();
				
	}
	
	
	@Test(enabled=false)
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
	
   @Test
   public void FBRegister() throws InterruptedException
   {
	   	driver.get("http://jobbuzz.timesjobs.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='fixed']/div[2]/ul[1]/li[2]/a")).click();
		driver.findElement(By.className("pageview")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myModalSignup']/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div[1]/div[1]/a")));
		
		driver.findElement(By.xpath("//*[@id='myModalSignup']/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div[1]/div[1]/a")).click();
		//driver.findElement(By.xpath("//*[@id='account-chooser-add-account']")).click();
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("manojtbsl3@gmail.com");
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("testtest@123");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
   }
	
   @Test(enabled=false)
   public void GplusRegister()
   {
	   driver.get("http://jobbuzz.timesjobs.com/");
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//*[@id='fixed']/div[2]/ul[1]/li[2]/a")).click();
	   driver.findElement(By.xpath("//*[@id='myModalSignup']/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/a/img")).click();
	   driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("manojtbsl3@gmail.com");
	   driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("testtest@123");
	   driver.findElement(By.xpath("//*[@id='signIn']")).click();
	    
   }

   //review landing home page
   @Test(enabled=false)
   public void reviewlanding()
   {
	   driver.get("http://jobbuzz.timesjobs.com/");
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//*[@id='navbar-collapse1']/ul/li[2]/a")).click();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   String actual_text = driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[1]/div[1]/h5")).getText();
	   String expected_text = "Write a Review for a company" ;
	  
	   if (actual_text.equals(expected_text) )
	   {
		   System.out.println("This is proper review landing page");
	   }
	   else
	   {
		   System.out.println("This is not proper review landing page");
	   }
	     
   }
	
   //review posting page
   @Test(enabled=false)
   public void reviewposting()
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
	   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[3]/form/div/div/div[1]/div[1]/div/div/div[2]/div")).click();
	   driver.findElement(By.xpath("//*[@id='postcard']/div[2]/div[2]/div[3]/form/div/div/div[1]/div[2]/div/div/div	2]/div")).click();
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
   
   
 //Review landing page sorting 
   @Test(enabled=false)
   public void reviewsort()
   {
	   driver.get("http://jobbuzz.timesjobs.com/");
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//*[@id='navbar-collapse1']/ul/li[2]/a")).click();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
	   //below method is also good for dropdown selection
	   //Select dropdown = new Select(driver.findElement(By.className("sortordersel")));
	   //dropdown.selectByVisibleText("rating");  
	      
	   WebElement dropdown = driver.findElement(By.className("sortordersel"));
	   List<WebElement> options = dropdown.findElements(By.tagName("option"));
	    for (WebElement option : options)
	    {	          
	    	if("rating".equals(option.getText()))
	    		option.click();	    	
	    }
	   
	   
	    
   }
}
