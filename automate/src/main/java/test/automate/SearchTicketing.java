package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTicketing {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://nhcc.kakashi.app/login");
        driver.manage().window().maximize();

        
        
//Test
        
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("user@test.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Khadija@123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(10000);
        
        //click on Tickets
      
        driver.findElement(By.xpath("//span[@class='menu-title text-truncate']//span[contains(text(),'Tickets')]")).click();
        Thread.sleep(50000);


        
        
        //click on AllTicket
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/ul[1]/li[2]/ul[1]/div[1]/li[2]/a[1]/span[1]/span[1]")).click();
        
        //click on Search and add text to seacrhbar
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("test");
        
        Thread.sleep(10000);
        
        
        
        Thread.sleep(50000);
        
        
        
        System.out.println("Test completed. Closing the browser...");

		driver.quit();
	}

}
	


