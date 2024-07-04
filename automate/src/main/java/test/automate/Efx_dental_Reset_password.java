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

public class Efx_dental_Reset_password {
	 public static void main(String[] args) throws InterruptedException {
		 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("rida_report.html");
	    	
  	   // create ExtentReports and attach reporter(s)
       ExtentReports extent = new ExtentReports();
       extent.attachReporter(htmlReporter);
       
       // creates a toggle for the given test, adds all log events under it    
       ExtentTest test = extent.createTest("Forgot Password", "This is efficaX Dental Test case");
		 
	        // Setup WebDriver
	        WebDriverManager.chromedriver().setup();
	        
	     // log(Status, details)
	        test.log(Status.INFO, "reset password page open)");
	        
	        // Create a new instance of ChromeDriver
	        WebDriver driver = new ChromeDriver();
	        
	        // Open the webpage
	        driver.get("https://efficax-dental.ascend.com.sa/");
	        
	        // Wait for 10 seconds to allow the page to load fully
	            Thread.sleep(10000);
	       
	        // Maximize the browser window
	        driver.manage().window().maximize();
	        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[1]/div[2]/div/div/form/div/div[4]/div/div[2]/a")); element.click();
	        test.pass("fotgot password buttton");
	        
	        Thread.sleep(10000);
	        
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div/div/div/form/div/div[2]/div/input")).sendKeys("rida.khan@ascend.com.sa");
	        test.pass("email input");
	        
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div/div/div/form/div/button[1]")).click();
	        test.pass("submitting");
	        Thread.sleep(10000);
	        
	        // Close the browser
	        driver.quit();
	        //rida test
	        // calling flush writes everything to the log file
	        extent.flush();
	        		
	 }
}
