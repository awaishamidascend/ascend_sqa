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

public class Efx_Aman {
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
        
        driver.get("https://ascend.com.sa/");
        
        
        test.pass("email success");
        

        
        
        extent.flush();
    }
}