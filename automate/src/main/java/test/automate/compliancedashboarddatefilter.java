package test.automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;


public class compliancedashboarddatefilter {
	

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
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Explicit wait

     Thread.sleep(5000);
     for (int i = 0; i <= 51; i++) {
     

         // Find the element by ID    
         driver.findElement(By.id("pr_id_1_header_" + i )).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//input[@placeholder='Select date']")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//span[@aria-label='August 1, 2024']")).click();
         driver.findElement(By.xpath("//span[@aria-label='August 6, 2024']")).click();
         System.out.println("Tab Selected" + i);
         
         
     }
}
}