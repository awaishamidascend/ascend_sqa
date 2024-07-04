package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Efx_dental_DentalSupplies_Form_Submission {
	
	 public static void main(String[] args) throws InterruptedException {
	    	
	    	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("rida_report.html");
	    	
	 	   // create ExtentReports and attach reporter(s)
	      ExtentReports extent = new ExtentReports();
	      extent.attachReporter(htmlReporter);
	      
	      // creates a toggle for the given test, adds all log events under it    
	      ExtentTest test = extent.createTest("Equipment Form", "This is efficaX Dental Test case");
	      
	        // Setup WebDriver
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();

	        // Open the webpage
	        test.pass("web page open");
	        driver.get("https://dev-efficax-dental.kakashi.app/login");
	        
	        // Wait for 10 seconds to allow the page to load fully
	        System.out.println("Waiting for the page to load...");
	        Thread.sleep(5000);
	       
	        // Maximize the browser window 
	        System.out.println("Maximizing the browser window...");
	        driver.manage().window().maximize();
	        test.pass("maximizing window");
	        
	        // Entering email and password
	        System.out.println("Entering email and password...");
	        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rida.khan@ascend.com.sa");
	        test.pass("enter email");
	        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("eod777");
	        test.pass("enter password");
	        
	        // Clicking on login button
	        System.out.println("Clicking on the login button...");
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        test.pass("click login");
	        Thread.sleep(5000);
	        
	        //Clicking on Dental supplies dropdown
	        System.out.println("Clicking on the form selection dropdown...");
	        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/ul[1]/li[1]")).click();
	        Thread.sleep(2000);
	        
	        //clicking on dental Supplies Form
	        System.out.println("Clicking on the form selection dropdown...");
	        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/ul[1]/li[1]/ul/div[2]/li[2]/a/span")).click();
	        Thread.sleep(2000);
	        
	        //Clicking on Region Dropdown dropdown
	        System.out.println("Clicking on the form selection dropdown...");
	        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div")).click();
	        Thread.sleep(2000);
	        
	        //selecting region
	        System.out.println("select region...");
	        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[1]")).click();
	        Thread.sleep(2000);
	        
	        //selecting PHCs dropdown
	        System.out.println("select PHC dropdown...");
	        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div[2]/div[1]/div/div[2]/div")).click();
	        Thread.sleep(2000);
	        
	        //Selecting PHCs value
	        System.out.println("select PHC...");
	        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div[2]/div[1]/div[2]/div/div[3]")).click();
	        Thread.sleep(2000);
	        
	        //Selecting level dropdown
	        System.out.println("click dropdown...");
	        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div[4]/div[1]/div/div[2]/div")).click();
	        Thread.sleep(2000); 
	        
	      //Selecting level 
	        System.out.println("select level...");
	        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div[4]/div[1]/div[2]/div/div")).click();
	        Thread.sleep(2000); 
	        
	        
}
	 
}
