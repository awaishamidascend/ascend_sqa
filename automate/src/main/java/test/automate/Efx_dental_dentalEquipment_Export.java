package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Efx_dental_dentalEquipment_Export {

    public static void main(String[] args) throws InterruptedException {
    	 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("rida_report.html");
     	
  	   // create ExtentReports and attach reporter(s)
       ExtentReports extent = new ExtentReports();
       extent.attachReporter(htmlReporter);
       
       // creates a toggle for the given test, adds all log events under it    
       ExtentTest test = extent.createTest("Equipment Export", "This is efficaX Dental Test case");
       
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
     // log(Status, details)
        test.log(Status.INFO, "export form listing)");

        
        // Open the webpage
        System.out.println("Opening the webpage...");
        driver.get("https://efficax-dental.ascend.com.sa/");
        test.pass("openng webpage");
        
        // Wait for 10 seconds to allow the page to load fully
        System.out.println("Waiting for the page to load...");
        Thread.sleep(10000);
       
        // Maximize the browser window
        System.out.println("Maximizing the browser window...");
        driver.manage().window().maximize();
        test.pass("max window");
        
        // Entering email and password
        System.out.println("Entering email and password...");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rida.khan@ascend.com.sa");
        test.pass("enter email");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("eod777");
        test.pass("enter password");
        
        // Clicking on login button
        System.out.println("Clicking on the login button...");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        test.pass("login success");
        Thread.sleep(10000);
        //Clicking on Dental supplies menu
        System.out.println("Clicking on menu items...");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[4]/ul[1]/li[2]")).click();
        test.pass("click menu");
        Thread.sleep(10000);
        //click on submission listing
        System.out.println("Clicking on submission listing...");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[4]/ul[1]/li[2]/ul/div[2]/li[2]/a/span")).click();
        test.pass("Click listing");
        Thread.sleep(10000);
        
        // Clicking on export button
        System.out.println("Clicking on the export button...");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div/div[1]/div[2]/button[1]")).click();
        test.pass("clicking export");
        Thread.sleep(10000);
        
     // Close the browser
        System.out.println("Test completed. Closing the browser...");
        driver.quit(); 
        // calling flush writes everything to the log file
        extent.flush();
    }
    
}
        