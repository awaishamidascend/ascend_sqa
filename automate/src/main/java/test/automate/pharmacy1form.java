package test.automate;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;


public class pharmacy1form {
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
     driver.manage().window().maximize();
     
     driver.get("https://dev-efficax-obligation.kakashi.app/login");
     
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
     Thread.sleep(8000);
   //click form
 	
     driver.findElement(By.xpath("//span[normalize-space()='Forms']")).click();
     Thread.sleep(5000);
   //click self assessment form
     driver.findElement(By.xpath("//span[contains(@class,'menu-item text-truncate')][normalize-space()='Pharmacies Self Assessment - Medicine Availability']")).click();
     Thread.sleep(5000);
   // click add new form
     driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
     Thread.sleep(8000);
     System.out.println("form");

     //region
     WebElement region = driver.findElement(By.id("react-select-6-input"));
     region.click();
     region.sendKeys("QASSIM");
     region.sendKeys(Keys.ENTER);
     System.out.println("Selected Region");
     
     
     
//     driver.findElement(By.id("react-select-6-input")).click();
//     driver.findElement(By.id("react-select-6-option-4")).click();
     //sites
     driver.findElement(By.id("react-select-7-live-region")).click();
     driver.findElement(By.id("react-select-7-option-4")).click();
     
     driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/input[1]")).sendKeys("test");
     driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/input[1]")).sendKeys("test");
     driver.findElement(By.xpath("//input[@placeholder='District Name']")).sendKeys("test");
     driver.findElement(By.xpath("//span[normalize-space()='Get Location']")).click();


	}
}
