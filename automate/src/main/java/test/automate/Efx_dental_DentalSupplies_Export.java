package selenium_jenkins_testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Efx_dental_DentalSupplies_Export {

    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        
        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Open the webpage
        System.out.println("Opening the webpage...");
        driver.get("https://efficax-dental.ascend.com.sa/");
        
        // Wait for 10 seconds to allow the page to load fully
        System.out.println("Waiting for the page to load...");
        Thread.sleep(10000);
       
        // Maximize the browser window
        System.out.println("Maximizing the browser window...");
        driver.manage().window().maximize();
        
        // Entering email and password
        System.out.println("Entering email and password...");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rida.khan@ascend.com.sa");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("eod777");
        
        // Clicking on login button
        System.out.println("Clicking on the login button...");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(10000);
        
        // Clicking on menu items
        System.out.println("Clicking on menu items...");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[4]/ul[1]/li[1]")).click();
        Thread.sleep(10000);
        System.out.println("Clicking on ");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/ul[1]/li[1]/ul/div[2]/li[3]/a")).click();
        Thread.sleep(10000);
        
        // Clicking on export button
        System.out.println("Clicking on the export button...");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div/div[1]/div[2]/button[1]")).click();
        Thread.sleep(10000);
        
        // Close the browser
        System.out.println("Test completed. Closing the browser...");
        driver.quit();
    }  
        	
    }
