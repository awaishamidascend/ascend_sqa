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
public class compliancedashboard {
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
     for (int i = 1; i <= 51; i++) {
         // Construct the ID
         //String elementXpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]" + i;
         //System.out.println("ID Success");

         // Find the element by ID
         WebElement element = driver.findElement((By.cssSelector("a[id='pr_id_1_header_0'] span[class='p-tabview-title']" +i))); 

		// Perform any action on the element (e.g., click)
         element.click();
     }
}
}