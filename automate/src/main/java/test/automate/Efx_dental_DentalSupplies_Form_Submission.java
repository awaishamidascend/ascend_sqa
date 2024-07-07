package test.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Efx_dental_DentalSupplies_Form_Submission {
	
    public static void main(String[] args) throws InterruptedException {
    	
        // Initialize Extent Reports
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("rida_report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        ExtentTest test = extent.createTest("Equipment Form", "This is efficaX Dental Test case");
      
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Open the webpage
            test.pass("web page open");
            driver.get("https://dev-efficax-dental.kakashi.app/login");
        
            // Wait for 5 seconds to allow the page to load fully
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
        
            // Clicking on Dental supplies dropdown
            System.out.println("Clicking on the form selection dropdown...");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/ul[1]/li[1]")).click();
            Thread.sleep(2000);
        
            // Clicking on dental Supplies Form
            System.out.println("Clicking on the form selection dropdown...");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/ul[1]/li[1]/ul/div[2]/li[2]/a/span")).click();
            Thread.sleep(2000);
        
            // Clicking on Region Dropdown dropdown
            System.out.println("Clicking on the form selection dropdown...");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div")).click();
            Thread.sleep(2000);
        
            // Selecting region
            System.out.println("Select region...");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[1]")).click();
            Thread.sleep(2000);
        
            // Selecting PHCs dropdown
            System.out.println("Select PHC dropdown...");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div[2]/div[1]/div/div[2]/div")).click();
            Thread.sleep(2000);
        
            // Selecting PHCs value
            System.out.println("Select PHC...");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div[2]/div[1]/div[2]/div/div[3]")).click();
            Thread.sleep(2000);
        
            // Selecting level dropdown
            System.out.println("Click dropdown...");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div[4]/div[1]/div/div[2]/div")).click();
            Thread.sleep(2000); 
        
            // Selecting level 
            System.out.println("Select level...");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div[4]/div[1]/div[2]/div/div")).click();
            Thread.sleep(2000); 
        
            // Locate all dropdowns by class name
            List<WebElement> dropdowns = driver.findElements(By.className("select__input-container css-ackcql"));
            System.out.println("Select dropdown...");

            // Loop through each dropdown and select values
            for (int i = 0; i < dropdowns.size(); i++) {
                Select select = new Select(dropdowns.get(i));
                select.selectByIndex(i + 1); // Example: selecting different index for each dropdown
            }

            // Submit the form
            driver.findElement(By.id("submit-button")).click();
            test.pass("Form submitted successfully");
            
        } finally {
            // Write the report to the file
            extent.flush();
        }
    }
}
