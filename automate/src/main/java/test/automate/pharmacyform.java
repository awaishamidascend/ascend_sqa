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

public class pharmacyform {
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
	
	//click form
	
     driver.findElement(By.xpath("//span[normalize-space()='Forms']")).click();
     Thread.sleep(5000);
//click self assessment form
     driver.findElement(By.xpath("//span[contains(@class,'menu-item text-truncate')][normalize-space()='Pharmacies Self Assessment - Medicine Availability']")).click();
     Thread.sleep(5000);
// click add new form
     driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
     Thread.sleep(8000);
//select region
     driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
     driver.findElement(By.xpath("//div[contains(@class,'select__value-container select__value-container--has-value css-1d8n9bt')]//div[contains(@class,'select__input-container css-ackcql')]")).click();
  // select site   
     driver.findElement(By.xpath("//div[contains(@class,'select__control select__control--is-focused select__control--menu-is-open css-1u57jws-control')]//div[contains(@class,'select__input-container css-ackcql')]")).click();
     driver.findElement(By.xpath("//div[contains(@class,'select__control select__control--is-focused select__control--menu-is-open css-1u57jws-control')]//div[contains(@class,'select__input-container css-ackcql')]")).click();
     
     
  //City,district and street name    
     driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/input[1]")).sendKeys("test");
     driver.findElement(By.xpath("//input[@placeholder='Street name']")).sendKeys("TEST");
     driver.findElement(By.xpath("//input[@placeholder='District Name']")).sendKeys("TEST");
// Get location
     driver.findElement(By.xpath("//span[normalize-space()='Get Location']")).click();
//click next     
     driver.findElement(By.xpath("//button[contains(@class,'waves-effect round btn btn btn-primary')]")).click();
// add medicine     
     driver.findElement(By.xpath("//div[@class='select__control select__control--is-focused select__control--menu-is-open css-1pahdxg-control']//div[@class='select__value-container select__value-container--has-value css-1d8n9bt']")).click();
     driver.findElement(By.xpath("//div[@id='general_medicine']//input[@value='Yes']")).click();
     driver.findElement(By.xpath("//input[@placeholder='Comments']")).sendKeys("TEST");
     driver.findElement(By.xpath("//input[@placeholder='Enter Quantity']")).sendKeys("12");
// next button
     driver.findElement(By.xpath("//button[@class='waves-effect round btn btn btn-primary']")).click();
// Respiratory medicines    
     driver.findElement(By.xpath("//div[@class='select__value-container css-1d8n9bt']//div[@class='select__input-container css-ackcql']")).click();
     driver.findElement(By.xpath("//div[@class='select__control select__control--is-focused select__control--menu-is-open css-1pahdxg-control']//div[@class='select__input-container css-ackcql']")).click();
     driver.findElement(By.xpath("//div[@id='respiratory_medicine']//input[@value='Yes']")).click();
     driver.findElement(By.xpath("//div[@id='respiratory_medicine']//input[@placeholder='Comments']")).sendKeys("TEST");
     driver.findElement(By.xpath("//div[@id='respiratory_medicine']//input[@placeholder='Enter Quantity']")).sendKeys("12");
     // click next
     driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
     
     //Additional remarks
     driver.findElement(By.xpath("//input[@placeholder='john doe']")).sendKeys("test");
     driver.findElement(By.xpath("//div[@class='card-body']//canvas")).click();
     driver.findElement(By.xpath("//input[@placeholder='Delegated Person']")).sendKeys("test");
     driver.findElement(By.xpath("//input[@placeholder='Id Number']")).sendKeys("test12");
     //Select date
     driver.findElement(By.xpath("//input[@class='form-control flatpickr-input active']")).click();
     driver.findElement(By.xpath("//span[@aria-label='July 31, 2024']")).click();

     driver.findElement(By.xpath("//input[@placeholder='Issue Place']")).sendKeys("test");
     driver.findElement(By.xpath("//input[@placeholder='Position']")).sendKeys("test");
     driver.findElement(By.xpath("//body/div[@id='root']/div[@class='wrapper vertical-layout navbar-sticky footer-static vertical-menu-modern menu-expanded']/div[@class='app-content content overflow-hidden']/div[@class='container-xxl p-0 mt-2 animate__animated animate__fadeInLeft']/div[@class='row']/div[@class='col']/div/div[@class='bs-stepper linear']/div[@class='bs-stepper-content']/div[@id='additionalRemarks']/div[@class='row']/div[@class='col-sm-12 col-md-6']/div[@class='signature']/canvas[1]")).click();
     
     
     //review
     driver.findElement(By.xpath("//button[@class='waves-effect round btn btn btn-primary']")).click();
     //submit
     driver.findElement(By.xpath("//button[@type='submit']")).click();
    


     
     
  // Close the WebDriver instance
     driver.quit();
     extent.flush();
	
	
	
	
	}	

}
