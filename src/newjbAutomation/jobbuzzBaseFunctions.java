package newjbAutomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class jobbuzzBaseFunctions {

	
	public static WebDriver driver=null;
	public static Properties  p=null;
	public static Properties  c=null;
	public static Xls_Reader  x=null;
	
	public static void startup() throws IOException
	{
		FileInputStream  Orfile=new FileInputStream(System.getProperty("user.dir")+"\\src\\OR.properties");
		p=new Properties();
		p.load(Orfile);
		
		//FileInputStream  configfile=new FileInputStream(System.getProperty("user.dir")+"\\src\\CONFIG.properties");
		c=new Properties();
		//c.load(configfile);
		
		//x =new Xls_Reader("D:\\ReportGeneration\\excel\\sanity.xls");
		//x = new Xls_Reader(System.getProperty("user.dir")+"//src//utilitypackage//login_automation.xls");		
		
	    System.out.println(p.getProperty("browserName"));
		
		/*if(c.getProperty("browserName").equals("Mozilla"))
		{
			driver=new FirefoxDriver();
		}
		else if(p.getProperty("browserName").equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}*/
		
		if(true)
		{
			System.out.println("Launching browser");
			driver=new FirefoxDriver();
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
			//driver=new ChromeDriver();
	
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}


}
