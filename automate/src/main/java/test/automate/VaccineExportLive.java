package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VaccineExportLive {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://nhcc.ascend.com.sa");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@user.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Khadija@123");
        Thread.sleep(50000);
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(10000);
        //click on Tickets
        driver.findElement(By.xpath("//span[@class='menu-title text-truncate']//span[contains(text(),'Tickets')]")).click();
        
        //go to ALLTICKETS
        driver.findElement(By.xpath("//span[contains(text(),'All Tickets')]")).click();
        Thread.sleep(50000);
        
        //Export
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/button[1]/figure[1]/*[name()='svg'][1]")).click();
        Thread.sleep(50000);
        
        //Export completed 
        driver.findElement(By.xpath("//button[normalize-space()='Copy']")).click();
        
        
        System.out.println("Test completed. Closing the browser...");

		driver.quit();
	}
	}


