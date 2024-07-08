package test.automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

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
            WebElement optionToSelect111 = driver.findElement(By.xpath("//div[contains(text(), 'PHC Warehouse - Dental Service')]"));
            optionToSelect111.click();
            System.out.println("Level Selected...");
            Thread.sleep(2000);
            
            //select UOM dropdown
            System.out.println("Click UOM dropdown...");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div")).click();
            Thread.sleep(2000);
            
            //Select value of UOM 
            System.out.println("Select piece");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div[2]/div/div/div[1]")).click();
            Thread.sleep(2000);
            
            //select available dropdown
            System.out.println("Select deopdown arrow");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div[3]/div/div[1]/div/div[2]/div")).click();
            Thread.sleep(2000);
            
            //select available from dropdown
            System.out.println("Select available");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div[3]/div/div[1]/div[2]/div/div[1]")).click();
            Thread.sleep(2000);
            
            //input new stock received  
            System.out.println("Enter new stock received number");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div[6]/div/input[1]")).sendKeys("45");
            Thread.sleep(2000);
            
            //input daily consumption 
            System.out.println("Enter daily consumption");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div[7]/div/input[1]")).sendKeys("42");
            Thread.sleep(2000);
            
          //input stock on hand
            System.out.println("Enter stock on hand");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div[8]/div/input[1]")).sendKeys("3");
            Thread.sleep(2000);
            
           //row 2
            //select dropdown
            System.out.println("select dropdown arrow");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[3]/div/div[1]/div/div[2]/div")).click();
            Thread.sleep(2000);
            
            //select not available from dropdown
            System.out.println("select notavailable");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[3]/div/div[1]/div[2]/div/div[2]")).click();
            Thread.sleep(2000);  
            
          //input MAWARED number
            System.out.println("Enter MAWARED number");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[4]/div/input[1]")).sendKeys("75");
            Thread.sleep(2000);  
            
          //click date
            System.out.println("click date");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[5]/div/input[1]")).click();
            Thread.sleep(2000);  
            
            //select date
            System.out.println("select date");
            driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[9]")).click();
            Thread.sleep(2000); 
            
            //input new stock received 
            System.out.println("Enter new stocked received");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[6]/div/input[1]")).sendKeys("100");
            Thread.sleep(2000);  
            
            //input stock on hand number
            System.out.println("Enter stock on hand number");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[8]/div/input[1]")).sendKeys("135");
            Thread.sleep(2000);  
            
            
    }
    
    
}
