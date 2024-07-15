package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Efx_Aman_UsersExport {
    public static void main(String[] args) throws InterruptedException {
ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("romeesa.html");
    	
    	// create ExtentReports and attach reporter(s)
         ExtentReports extent = new ExtentReports();
         extent.attachReporter(htmlReporter);
         ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
         // log(Status, details)
         test.log(Status.INFO, "Start log");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        driver.get("https://efficax-obligation.ascend.com.sa/login?isQA=true");
        
        Thread.sleep(10000);
        
        // Find and fill in the email and password fields
        driver.findElement(By.xpath("//input[@placeholder='Email']"))
              .sendKeys("system@ascend.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']"))
              .sendKeys("eod777");
        
        // Click on the login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        Thread.sleep(5000);
        
        System.out.println("Login Success");

        Thread.sleep(5000);

        
   
        
        // Perform click action on the desired element (e.g., export button)
        driver.findElement(By.xpath("//span[normalize-space()='Forms']")).click();
        System.out.println("Clicked on Forms");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//span[contains(@class,'menu-item text-truncate')][contains(text(),'المستشفيات العامة')]")).click();
        System.out.println("clicked on المستشفيات العامة ");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//div[contains(@class,'icon')]//figure//*[name()='svg']")).click();
        System.out.println("Export successfully");

        Thread.sleep(5000);

        // Close the WebDriver instance
        driver.quit();
        extent.flush();
    }
}
