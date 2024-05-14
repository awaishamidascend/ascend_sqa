package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class apm_reports_view {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // start reporters
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("GraphicalTestReport.html");
    
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("efficonX Login", "A test case to test login of efficonX");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        // log(Status, details)
        test.log(Status.INFO, "Starting Test Case");
        
        driver.get("https://efficonx.com");
        test.pass("Opened website of efficonX");
        
        driver.findElement(By.id("username")).sendKeys("awais.hamid@ascend.com.sa");
        test.pass("Entered Email");

        
        driver.findElement(By.id("password")).sendKeys("eod777");
        test.pass("Entered Password");
        
        driver.findElement(By.className("btn")).click();
        test.pass("Pressed login button ");
        //TEst Case APM

     // calling flush writes everything to the log file
        extent.flush();
    }
        
    }