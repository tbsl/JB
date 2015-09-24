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
public class Jobbuzz_google_login {

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
		
		//WebElement login1 = driver.findElement(By.xpath("//*[@id='myModalSignup']/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/a/img"));
		//WebElement login1 = driver.findElement(By.xpath("//img[contains(@alt,'Gmail login']"));
		driver.findElement(By.xpath("//a[contains(@href,'http://jobbuzz.timesjobs.com/jobbuzz/google-login.html')]/img")).click();
		Thread.sleep(1000);
		

		WebElement login2=driver.findElement(By.id("//*[@id='Email']"));
		login2.sendKeys("diveshpremchandani@gmail.com");
		login2=driver.findElement(By.id("//*[@id='Passwd']"));
		login2.sendKeys("divesh@567");
		login2= driver.findElement(By.id("//*[@id='signIn']"));
		login2.click();
		
	}

}
