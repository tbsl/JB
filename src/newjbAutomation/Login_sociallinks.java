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
public class Login_sociallinks {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();	
		driver.manage().window().maximize();		
		driver.navigate().to("http://jobbuzz.timesjobs.com");		
		driver.manage().timeouts().implicitlyWait(75L, TimeUnit.SECONDS);		
		driver.getTitle();		
		System.out.println(driver.getTitle());	
		
		

		WebElement login=driver.findElement(By.xpath("//*[@id='fixed']/div[2]/ul[1]/li[1]/a")); 
		login.click();
		
		WebElement login1 = driver.findElement(By.id("//*[@id='myModallogin']/div/div/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div[1]/a/img"));
		login1.click();
		Thread.sleep(1000);
		
		WebElement login3=driver.findElement(By.id("//*[@id='reauthEmail']"));
		login3.sendKeys("diveshpremchandani@gmail.com");
		login3=driver.findElement(By.id("//*[@id='Passwd']"));
		login3.sendKeys("divesh@567");
		login3= driver.findElement(By.id("//*[@id='signIn']"));
		login3.click();
		
		
      }

}
		
		/*WebElement login2=driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/div/div[2]/div/form/div[2]/div[1]/input"));
		login2.sendKeys("divesh.cooldude@gmail.com");
		login2=driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/div/div[2]/div/form/div[2]/div[2]/input"));
		login2.sendKeys("notymforluv");
		
        login2 = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/div/div[2]/div/form/div[2]/div[4]/div[1]/label/input"));	
		login2.click();
		
	    System.out.println(driver.getTitle());
	    
	    WebElement login2= driver.findElement()*/
		

