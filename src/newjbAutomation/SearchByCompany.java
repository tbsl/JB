package newjbAutomation;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchByCompany extends jobbuzzBaseFunctions{

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
	public void searchcompany() throws InterruptedException
	{
		driver.get(p.getProperty("jB_URL"));
	    WebElement search = driver.findElement(By.id(p.getProperty("Search_field")));
	    search.sendKeys("tata");
	    
//	    Actions builder=new Actions(driver);
	//    builder.moveToElement(search.findElement(By.xpath("//*[@id='typeahead-00U-3437-option-3']/a"))).click().build().perform();
	   //List<WebElement> auto_sugg=driver.findElements(By.xpath(".//*[@class='dropdown-menu ng-isolate-scope']"));
	   
	    //driver.findElement(By.xpath("(.//*[@class='dropdown-menu ng-isolate-scope']/li/a/strong)[3]")).click();
	    driver.findElement(By.xpath(p.getProperty("autosuggestion"))).click();
	   // driver.findElement(By.xpath("//*[@class='dropdown-menu ng-isolate-scope']/li/a)[9]")).click();
	    
	    /*driver.findElement(By.id("compamySearchTextH")).sendKeys(Keys.ARROW_DOWN);
	    driver.findElement(By.id("compamySearchTextH")).sendKeys(Keys.ARROW_DOWN);*/
	    
	    
	    
	    String CompanyName = driver.findElement(By.xpath(p.getProperty("company_page"))).getText();
	    
	    System.out.println("company search is succesful for " + CompanyName);
	}
	
	
	
	@AfterMethod(enabled=false)
	public void teardown()
	{
		driver.close();
	}
	
	
}
