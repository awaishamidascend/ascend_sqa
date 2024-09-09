package test.automate;

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

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

public class formtest {
	
    public static void main(String[] args) throws InterruptedException, TimeoutException {
    	
        // Setting up ExtentReports for logging test execution
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("romeesa.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        test.log(Status.INFO, "Starting the test execution");

        // Setting up WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Opening the web application and logging in
        driver.get("https://efficax-obligation.ascend.com.sa/login?isQA=true");
        Thread.sleep(10000); // Using Thread.sleep for demonstration; prefer WebDriverWait in real scenarios

        // Login process
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("system@ascend.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("eod777");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        System.out.println("Login Success");
        String otp = "786786";
	   
	    Thread.sleep(5000);
        // Navigate to Forms and Self Assessment form
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Forms']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Forms']"))).click();

        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'الصيدليات')]"))).click();
        Thread.sleep(10000);

        // Click Add new form
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='Create']"))).click();
        Thread.sleep(10000);
        System.out.println("Clicked Add New Form");
        
        
     // Fill in Region
     // Find the dropdown element
        WebElement dropdown = driver.findElement(By.xpath("(//input[@id='rc_select_0'])[1]")); // Click the dropdown to open it
        dropdown.click();
        // Select the item "HAFAR"
        WebElement hafarOption = driver.findElement(By.xpath("//div[@title='HAFAR']")); hafarOption.click();
        
        
        
        //cluster 
        driver.findElement(By.xpath("//input[@id='rc_select_1']")).click();

        // Wait for the site dropdown to be clickable
        WebElement siteDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")));
        siteDropdown.click();
        Thread.sleep(5000);
        System.out.println("Second Dropdown Clicked");
       
        
        
     // Locate the dropdown element
        //WebElement dropdown1 = driver.findElement(By.xpath("//input[@id='rc_select_1']"));

        // Click to open the dropdown if needed
       // dropdown1.click();
      //  Thread.sleep(5000);
        // Select the option using sendKeys
        //dropdown1.sendKeys("Hafar Health Cluster");
        //WebElement hafarhealthclusterOption = driver.findElement(By.xpath("//div[@name='Hafar Health Cluster' and @class='ant-select-item ant-select-item-option' and @title='Hafar Health Cluster']"
        //	)); hafarhealthclusterOption.click();

        // site
        driver.findElement(By.xpath("//input[@id='rc_select_2']")).click();

        
        System.out.println("third Dropdown Clicked");
        
        Thread.sleep(7000);
        
        // Locate the element using the appropriate selector
        WebElement element = driver.findElement(By.xpath("//div[@class='ant-select-item-option-content' and contains(text(), '3610103006110009 - Al-Dawaa Pharmacy Ninety-Two')]"));

        // Perform the click action
        element.click();
        Thread.sleep(5000);
        
        //City name
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/input[1]")).sendKeys("test");

        //Get location
         driver.findElement(By.xpath("//p[normalize-space()='Get Location']")).click();
        //reason for visit  
         driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/span[1]/input[1]")).sendKeys("test");
        //Is the Institution available on the ground?
         
         driver.findElement(By.xpath("//input[@value='Yes']")).click();
         
         //The name of the owner of the company
         driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/input[1]")).sendKeys("test");
         
         //The full name of the institution
         driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]/input[1]")).sendKeys("test");
         
         //scroll
         WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[3]/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")));
 	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
         
         
          //Institution email
         driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[3]/div[2]/div[2]/div[1]/div[1]/span[1]/input[1]")).sendKeys("test@gmail.com");
         
         //Facility license number
         driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[3]/div[3]/div[2]/div[1]/div[1]/span[1]/input[1]")).sendKeys("123456");
         
         //scroll1
         WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ant-card ant-card-bordered ant-card-small ant-card-type-default dn-signature css-14mobv6']//div[@class='ant-card-body']")));
  	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
         //date
        System.out.println("Clicking on 1st Date Element");
        
        WebElement scrolling = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//input[contains(@class, 'date-picker-input') and contains(@placeholder, 'Select date')]"))));
  	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrolling);
        Thread.sleep(3000);

         driver.findElement(By.xpath("//input[contains(@class, 'date-picker-input') and contains(@placeholder, 'Select date')]")).click();
         
         System.out.println("Clicking on 2nd Date Element");
         driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[3]/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
         Thread.sleep(3000);
         System.out.println("Clicking on exact Date");

         driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[3]/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/span[1]")).click();
         //signature
         driver.findElement(By.xpath("//div[@class='signature-wrapper']//canvas")).click();
         
         //next button
         driver.findElement(By.xpath("//span[normalize-space()='Next step']")).click();
         //next button
         driver.findElement(By.xpath("//span[normalize-space()='Next step']")).click();
         
         //Is the department available?
         
         wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Is the department available?']")));

         driver.findElement(By.xpath("//input[contains(@value,'Yes')]")).click();
         
      // Step 1: Find all label elements and store in an array, excluding "Comply", "Not Comply", and "N/A"
         List<String> questions = new ArrayList<>();
         List<WebElement> labels = driver.findElements(By.xpath("//div[contains(@class, 'ant-formily-layout ant-form-vertical')]//label"));

         for (WebElement label : labels) {
             String questionText = label.getText().trim();
             
             // Exclude "Comply", "Not Comply", "N/A"
             if (!questionText.equalsIgnoreCase("Comply") && 
                 !questionText.equalsIgnoreCase("Not Comply") && 
                 !questionText.equalsIgnoreCase("N/A")) {
                 
                 // Add the question text to the questions array
                 questions.add(questionText);
             }
         }

         // Step 2: Loop through the questions array and select "Comply" for each question
         for (String question : questions) {
        	    try {
        	        WebElement label = driver.findElement(By.xpath("//label[text()='" + question + "']"));
        	        WebElement complyOption = label.findElement(By.xpath("following::div//input[@value='Comply']"));

        	        // Wait until the "Comply" button is clickable
        	        WebElement clickableComplyOption = wait.until(ExpectedConditions.elementToBeClickable(complyOption));
        	        clickableComplyOption.click();
        	        
        	    } catch (NoSuchElementException e) {
        	        System.out.println("Comply option not found for question: " + question);
        	    }
        	
                 }
         
}
    
}