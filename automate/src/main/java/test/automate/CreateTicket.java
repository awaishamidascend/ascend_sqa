package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateTicket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://nhcc.ascend.com.sa");
        
        driver.manage().window().maximize();

     
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("khadija.yasin@ascend.com.sa");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Ascend@2040");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
		
		
        //click on Tickets
      driver.findElement(By.xpath("//span[@class='menu-title text-truncate']//span[contains(text(),'Tickets')]")).click();
      
      //create ticket
      driver.findElement(By.xpath("//span[contains(text(),'Create Ticket')]")).click();
      Thread.sleep(5000);

      //add subject
        driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("test subject");

      
      //add description
        driver.findElement(By.xpath("//div[@class='fr-element fr-view fr-element-scroll-visible']//p")).sendKeys("test description");
      
        //Next page
        driver.findElement(By.xpath("//div[@id='General-Information']//button[contains(@type,'submit')][normalize-space()='Next']")).click();
     
        // select team
     
        driver.findElement(By.xpath("//div[@id='Additional-Information']//div[contains(@class,'row')]//div[1]//div[1]//label[1]")).click();

        String option = "t";

        WebElement dropdown = driver.findElement(By.xpath("//select/option[contains(text(), '" + option + "')]"));

        dropdown.click();

        System.out.println("clicked");
        
       System.out.println("Test completed. Closing the browser...");

     // Close the browser
        driver.quit();
	}

	}


