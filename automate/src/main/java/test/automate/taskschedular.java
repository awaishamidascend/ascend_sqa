package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class taskschedular {



    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();

            driver.get("https://efficax-obligation.ascend.com.sa/login?isQA=true");

            Thread.sleep(10000);

            driver.findElement(By.xpath("//input[@placeholder='Email']"))
                    .sendKeys("system@ascend.com");
            driver.findElement(By.xpath("//input[@placeholder='Password']"))
                    .sendKeys("eod777");

            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(10000);
            
            driver.findElement(By.xpath("//span[contains(text(),'Schedule Task Form')]")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("//p[normalize-space()='Add Schedule']")).click();
            Thread.sleep(5000);
            
            
            Actions actions = new Actions(driver);
            //Click on Select Form
            WebElement dropdownTrigger = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]"));
            // Click on the dropdown trigger to open the dropdown
            dropdownTrigger.click();
            System.out.println("1st Dropdown Opened");
            Thread.sleep(3000);
            
         // Find and click on the specific option you want to select
            WebElement optionToSelect = driver.findElement(By.xpath("//div[contains(text(), 'Medical Drugs')]"));
            
            optionToSelect.click();
            System.out.println("Option Selected medical Drugs");

            
            
   //driver.findElement(By.xpath("(//div[@class='select__value-container css-1d8n9bt'])[1]")).click();
   //Thread.sleep(1000);
  // System.out.println("Clicked on First Dropdown");
   // select visit form
   // actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

  
   
   
   Thread.sleep(5000);

  // click region tab
  
    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]")).click();
    Thread.sleep(1000);
    //select region from dropdown
   actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

   Thread.sleep(5000);
   
  //click sites
   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]")).click();
  Thread.sleep(6000);
   actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

  // Select date
  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[6]/input[1]")).click();
  //select inspector
  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[8]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
  actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

//scroll down
  JavascriptExecutor js = (JavascriptExecutor) driver;

  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//select steps
  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[8]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]")).click();
  WebElement optionToSelect1 = driver.findElement(By.xpath("select__input-container css-ackcql"));
  
  optionToSelect1.click();
  //driver.findElement(By.xpath("")).click();
   //review
   driver.findElement(By.xpath("//span[normalize-space()='Review']")).click();
 //submit
 driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
//    //driver.findElement(By.xpath("")).click();
//    //driver.findElement(By.xpath("")).click();
//    //driver.findElement(By.xpath("")).click();
//    //driver.findElement(By.xpath("")).click();

            
            
       } 
        finally {
           // Close the WebDriver instance
         // driver.quit();
        }
    
}
}

