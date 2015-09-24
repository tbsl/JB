/**
 * 
 */
package z_Jobbuzz_Automation_script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * @author Divesh Premchandani
 *
 */
public class Jobbuzz_signin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();	
		driver.manage().window().maximize();		
		driver.navigate().to("http://jobbuzz.timesjobs.com");		
		driver.manage().timeouts().implicitlyWait(75L, TimeUnit.SECONDS);		
		driver.getTitle();		
		System.out.println(driver.getTitle());	
		
		

		WebElement login=driver.findElement(By.xpath("//*[@id='fixed']/div[2]/ul[1]/li[1]/a"));
		login.click();
		
		WebElement login1 = driver.findElement(By.xpath("//*[@id='editDetail']/div/div[2]/div/div/span[1]/input"));
		
		login1.sendKeys("davidirish@rediffmail.com");
		login1 = driver.findElement(By.xpath("//*[@id='editDetail']/div/div[3]/div/div/span[1]/input"));	
		login1.sendKeys("Welcome@123");		
	    login1 = driver.findElement(By.xpath("//*[@id='editDetail']/div/div[4]/div/input[2]"));	
		login1.click();
		
	    System.out.println(driver.getTitle());		
				

		}

}
