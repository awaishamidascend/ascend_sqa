package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Efx_dental_Login {

    public static void main(String[] args) throws InterruptedException {
    	
    	 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("rida_report.html");
    	
    	   // create ExtentReports and attach reporter(s)
         ExtentReports extent = new ExtentReports();
         extent.attachReporter(htmlReporter);
         
         // creates a toggle for the given test, adds all log events under it    
         ExtentTest test = extent.createTest("Login Test Case", "This is efficaX Dental Test case");
    	 
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        // log(Status, details)
        test.log(Status.INFO, "First we need to login to the site)");

      
        
        // Open the webpage
        driver.get("https://efficax-dental.ascend.com.sa/");
        test.pass("Pass");

        
        
        // Wait for 10 seconds to allow the page to load fully
            Thread.sleep(10000);
       
        // Maximize the browser window
        driver.manage().window().maximize();
        test.pass("Maximizing windows");

        
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rida.khan@ascend.com.sa");
        test.pass("input email");

        
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("eod777");
        test.pass("input password");

        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//span[normalize-space()='Dental Supplies']")).click();
        
        // Close the browser
        driver.quit();
        //rida test
        // calling flush writes everything to the log file
        extent.flush();
    }
}
