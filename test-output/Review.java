package newjbAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Review {
   
    public WebDriver driver=new FirefoxDriver();
   
    @Test(priority=1)
    public void search_Review_usingType() throws InterruptedException
    {
        driver.get("http://jobbuzz.timesjobs.com/discover/");
        driver.findElement(By.xpath("(//*[@class='anchorWrap'])[1]")).click();
        driver.findElement(By.xpath("//*[@class='form-control ng-pristine ng-valid']")).sendKeys("Times");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[@tabindex='-1'])[1]")).click();
        Assert.assertEquals(driver.getTitle(),"Times Business Solutions  Reviews and Ratings - Jobbuzz");
        driver.close();
    }

    @Test(priority=2)
    public void search_Review_usingCheckbox() throws InterruptedException
    {
        driver.get("http://jobbuzz.timesjobs.com/discover/");
        driver.findElement(By.xpath("(//*[@class='anchorWrap'])[1]")).click();
        driver.findElement(By.xpath("//*[@data-label='ICICI Bank Ltd']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@class='positionclose']")).click();
        Assert.assertEquals(driver.getTitle(),"ICICI Bank Ltd Reviews and Ratings - Jobbuzz");
        driver.close();
         
    }
   
   
   
    @Test(priority=3)
    public void Sorting_By_Recency() throws InterruptedException
    {
        driver.get("http://jobbuzz.timesjobs.com/discover/");
        driver.findElement(By.xpath("//*[@class='sortordersel ng-pristine ng-valid']")).click();
        driver.findElement(By.xpath("//*[@value='CNT_VOTE_UP']")).click();
        Thread.sleep(2000);
       
        Assert.assertEquals(driver.getTitle(),"Reviews and Ratings - Jobbuzz");
        driver.close();
         
    }
   

    @Test(priority=3)
    public void Sorting_By_Rating() throws InterruptedException
    {
        driver.get("http://jobbuzz.timesjobs.com/discover/");
        driver.findElement(By.xpath("//*[@class='sortordersel ng-pristine ng-valid']")).click();
        driver.findElement(By.xpath("//*[@value='OVERALL_RATING']")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(),"Reviews and Ratings - Jobbuzz");
        driver.close();
    }
   
    @Test(priority=4)
    public void Sorting_By_View() throws InterruptedException
    {
        driver.get("http://jobbuzz.timesjobs.com/discover/");
        driver.findElement(By.xpath("//*[@class='sortordersel ng-pristine ng-valid']")).click();
        driver.findElement(By.xpath("//*[@value='CNT_VIEW']")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(),"Reviews and Ratings - Jobbuzz");
        driver.close();
    }
   
    @Test(priority=5)
    public void Voteup_review() throws InterruptedException
    {
        System.out.println("In VoteUp");
        driver.get("http://jobbuzz.timesjobs.com/discover/");
        driver.findElement(By.xpath("(//*[@class='cus-icon cus-plike-white'])[1]")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(),"Reviews and Ratings - Jobbuzz");
        driver.close();
    }
   
   
    @Test(priority=6)
    public void Opening_Rating() throws InterruptedException
    {
        driver.get("http://jobbuzz.timesjobs.com/discover/");
        driver.findElement(By.xpath("(//*[@class='anchorWrap'])[2]")).click();
        Thread.sleep(2000);
        //Closing_Rating();
        Assert.assertEquals(driver.getTitle(),"Reviews and Ratings - Jobbuzz");
    }
   
    @Test(priority=7)
    public void Closing_Rating() throws InterruptedException
    {
        Opening_Rating();
        driver.findElement(By.xpath("(//*[@class='positionclose'])[2]")).click();
        driver.close();
    }
   
   
    @Test(priority=8)
    public void Rating_4TO5() throws InterruptedException
    {
        driver.get("http://jobbuzz.timesjobs.com/discover/");
        Opening_Rating();
        driver.findElement(By.xpath("(//*[@class='col-sm-3 hidden-xs'])[1]")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(),"Reviews and Ratings - Jobbuzz");
    }
   
    @Test(priority=9)
    public void Rating_3TO4() throws InterruptedException
    {
        driver.get("http://jobbuzz.timesjobs.com/discover/");
        Opening_Rating();
        driver.findElement(By.xpath("(//*[@class='hidden-xs col-sm-3'])[1]")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(),"Reviews and Ratings - Jobbuzz");
    }

   
    @Test(priority=10)
    public void Rating_2TO3() throws InterruptedException
    {
        driver.get("http://jobbuzz.timesjobs.com/discover/");
        Opening_Rating();
        driver.findElement(By.xpath("(//*[@class='hidden-xs col-sm-3'])[2]")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(),"Reviews and Ratings - Jobbuzz");
    }
   
    @Test(priority=11)
    public void Rating_1TO2() throws InterruptedException
    {
        driver.get("http://jobbuzz.timesjobs.com/discover/");
        Opening_Rating();
        driver.findElement(By.xpath("(//*[@class='hidden-xs col-sm-3'])[3]")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(),"Reviews and Ratings - Jobbuzz");
    }

   
    @Test(priority=12)
    public void Rating_0TO1() throws InterruptedException
    {
        driver.get("http://jobbuzz.timesjobs.com/discover/");
        Opening_Rating();
        driver.findElement(By.xpath("(//*[@class='hidden-xs col-sm-3'])[4]")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(),"Reviews and Ratings - Jobbuzz");
    }
   
   

   
}