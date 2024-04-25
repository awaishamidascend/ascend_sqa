package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Efx_dental1_Login {

    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        // Open the webpage
        driver.get("https://efficax-dental.ascend.com.sa/");
        
        // Wait for 10 seconds to allow the page to load fully
            Thread.sleep(10000);
       
        // Maximize the browser window
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rida.khan@ascend.com.sa");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("eod777");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//span[normalize-space()='Dental Supplies']")).click();
        
        // Close the browser
        driver.quit();
        //rida test
        
    }
}
