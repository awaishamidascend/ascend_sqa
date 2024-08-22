package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dental_Supplies_Listing_Search {
	  public static void main(String[] args) throws InterruptedException {

	        // Initialize Extent Reports
	        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("rida_report.html");
	        ExtentReports extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        ExtentTest test = extent.createTest("Supplies Form", "This is efficaX Dental Test case");

	        // Setup WebDriver
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Open the webpage
	            test.pass("Web page opened");
	            driver.get("https://dev-efficax-dental.kakashi.app/");

	            // Wait for 5 seconds to allow the page to load fully
	            System.out.println("Waiting for the page to load...");
	            Thread.sleep(5000);

	            // Maximize the browser window
	            System.out.println("Maximizing the browser window...");
	            driver.manage().window().maximize();
	            test.pass("Maximizing window");

	            // Entering email and password
	            System.out.println("Entering email and password...");
	            driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rida.khan@ascend.com.sa");
	            test.pass("Entered email");
	            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("eod777");
	            test.pass("Entered password");

	            // Clicking on login button
	            System.out.println("Clicking on the login button...");
	            driver.findElement(By.xpath("//button[@type='submit']")).click();
	            test.pass("Clicked login");
	            Thread.sleep(5000);

	            // Clicking on Dental supplies dropdown
	            System.out.println("Clicking on the Dental supplies dropdown...");
	            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/ul[1]/li[1]")).click();
	            Thread.sleep(2000);
	            
	            //Clicking on dental supplies listing
	            System.out.println("Clicking on the Dental supplies listing...");
	            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/ul[1]/li[1]/ul/div[2]/li[3]/a/span")).click();
	            Thread.sleep(2000);
	            
	            //Search Rida
	            System.out.println("Entering email and password...");
	            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div/div[1]/div[2]/div/input")).sendKeys("rida");
	           
	            
	            
	        } finally {
				// Close the browser
				//extent.flush(); // Flush the extent report
				//driver.quit();
			}
		}
	}
	        
	  


