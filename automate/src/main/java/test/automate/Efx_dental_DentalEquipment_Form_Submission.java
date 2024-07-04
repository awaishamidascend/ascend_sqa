package test.automate;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Efx_dental_DentalEquipment_Form_Submission {

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
        driver.get("https://efficax-dental.ascend.com.sa/");
        
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
        
        //Clicking on Dental supplies menu
        System.out.println("Clicking on menu items...");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[4]/ul[1]/li[2]")).click();
        test.pass("clicking on menu");
        Thread.sleep(5000);
        System.out.println("Clicking on form");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/ul[1]/li[2]/ul[1]/div[2]/li[1]/a[1]/span[1]")).click();
        test.pass("clicking on form");
        System.out.println("Clicking on select region");
        
        Thread.sleep(5000);
        
        // Find the dropdown element
        WebElement dropdown = driver.findElement(By.className("css-8mmkcg"));
        test.pass("dropdown");

        // Click on the dropdown to open it
        dropdown.click();
        System.out.println("Opened Dropdown");
        //select region
        System.out.println("Selecting Region");               
        driver.findElement(By.xpath("//*[@id=\"react-select-2-option-1\"]")).click(); 
        Thread.sleep(5000);
        
        //Click on PHCs dropdown
        driver.findElement(By.xpath("//*[@id=\"hospital\"]/div/div[2]/div")).click();
        Thread.sleep(3000);
        //select PHc
        System.out.println("Select PHC");
        driver.findElement(By.xpath("//*[@id=\"react-select-3-option-2\"]")).click();
        Thread.sleep(5000);
        
        //Select status dropdown
        System.out.println("click dropdown of status");
        driver.findElement(By.xpath("//*[@id=\"cell-2-undefined\"]/div/div[1]/div/div[2]/div")).click();
        Thread.sleep(2000);
        //select available from dropdown
        System.out.println("Available seleced");
        driver.findElement(By.xpath("//*[@id=\"react-select-4-option-0\"]")).click();
        Thread.sleep(3000);
               
        //click equipment dropdown
        System.out.println("open quipment dropdown");
        driver.findElement(By.xpath("//*[@id=\"cell-3-undefined\"]/div/div/div/div[2]/div")).click();
        Thread.sleep(3000);
        //select number from dropdown
        System.out.println("select equipment number");
        driver.findElement(By.xpath("//*[@id=\"react-select-5-option-45\"]")).click();
        Thread.sleep(3000);       
        
        //select working dropdown
        System.out.println("open working dropdown");
        driver.findElement(By.xpath("//*[@id=\"cell-4-undefined\"]/div/div[1]/div/div[2]/div")).click();
        Thread.sleep(3000);
        //select value of working
        driver.findElement(By.xpath("//*[@id=\"react-select-6-option-33\"]")).click();
        Thread.sleep(3000);
        
        //select frequent dropdown
        System.out.println("open working dropdown");
        driver.findElement(By.xpath("//*[@id=\"cell-6-undefined\"]/div/div[1]/div/div[2]/div")).click();
        Thread.sleep(3000);
        //select value of frequent from dropdown
        System.out.println("open working dropdown");
        driver.findElement(By.xpath("//*[@id=\"react-select-7-option-17\"]")).click();
        Thread.sleep(3000);
        
        //Row 2
        //select status dropdown (2)
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div")).click();
        Thread.sleep(2000);
        //select available from dropdown
        System.out.println("Available seleced");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div[1]")).click();
        Thread.sleep(3000);
        
      //click equipment dropdown (2)
        System.out.println("open quipment dropdown");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div[3]/div/div[1]/div/div[2]/div")).click();
        Thread.sleep(3000);
        //select number from dropdown
        System.out.println("select equipment number");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div[3]/div/div[1]/div[2]/div/div[50]")).click();
        Thread.sleep(3000);       
        
        //select working dropdown (2)
        System.out.println("open working dropdown");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div[4]/div/div[1]/div/div[2]/div")).click();
        Thread.sleep(3000);
        //select value of working
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div[4]/div/div[1]/div[2]/div/div[37]")).click();
        Thread.sleep(3000);
        
        //select frequent dropdown(2)
        System.out.println("open working dropdown");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div[6]/div/div[1]/div/div[2]/div")).click();
        Thread.sleep(3000);
        //select value of frequent from dropdown
        System.out.println("open working dropdown");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div[6]/div/div[1]/div[2]/div/div[15]")).click();
        Thread.sleep(3000);
        
        
        //Row 3
        //Select status dropdown
        System.out.println("click dropdown of status");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/div/div[2]/div")).click();
        Thread.sleep(2000);
        //select Not available from dropdown
        System.out.println("Not Available seleced");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[3]/div[2]/div/div[1]/div[2]/div/div[2]")).click();
        Thread.sleep(3000);
         
        //Row 4
        //Select status dropdown (4)
        System.out.println("click dropdown of status");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[4]/div[2]/div/div[1]/div/div[2]/div")).click();
        Thread.sleep(2000);
        //select available from dropdown
        System.out.println("Available seleced");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[4]/div[2]/div/div[1]/div[2]/div/div[1]")).click();
        Thread.sleep(3000);
        
      //click equipment dropdown (4)
        System.out.println("open quipment dropdown");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[4]/div[3]/div/div[1]/div/div[2]/div")).click();
        Thread.sleep(3000);
        //select number from dropdown
        System.out.println("select equipment number");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[4]/div[3]/div/div[1]/div[2]/div/div[9]")).click();
        Thread.sleep(3000);       
        
        //select working dropdown (4)
        System.out.println("open working dropdown");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[4]/div[4]/div/div[1]/div/div[2]/div")).click();
        Thread.sleep(3000);
        //select value of working
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[4]/div[4]/div/div[1]/div[2]/div/div[8]")).click();
        Thread.sleep(3000);
        
        //select frequent dropdown(4)
        System.out.println("open working dropdown");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[4]/div[6]/div/div[1]/div/div[2]/div")).click();
        Thread.sleep(3000);
        //select value of frequent from dropdown
        System.out.println("open working dropdown");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[4]/div[6]/div/div[1]/div[2]/div/div[7]")).click();
        Thread.sleep(3000);
        
        
       //Row 5
        //Select status dropdown (5)
        System.out.println("click dropdown of status");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[5]/div[2]/div/div[1]/div/div[2]/div")).click();
        Thread.sleep(2000);
        //select available from dropdown
        System.out.println("Available seleced");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[5]/div[2]/div/div[1]/div[2]/div/div[1]")).click();
        Thread.sleep(3000);
        
      //click equipment dropdown (5)
        System.out.println("open quipment dropdown");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[5]/div[3]/div/div[1]/div/div[2]/div")).click();
        Thread.sleep(3000);
        //select number from dropdown
        System.out.println("select equipment number");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[5]/div[3]/div/div[1]/div[2]/div/div[18]")).click();
        Thread.sleep(3000);       
        
        //select working dropdown (5)
        System.out.println("open working dropdown");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[5]/div[4]/div/div[1]/div/div[2]/div")).click();
        Thread.sleep(3000);
        //select value of working
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[5]/div[4]/div/div[1]/div[2]/div/div[15]")).click();
        Thread.sleep(3000);
        
        //select frequent dropdown(5)
        System.out.println("open working dropdown");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[5]/div[6]/div/div[1]/div/div[2]/div")).click();
        Thread.sleep(3000);
        //select value of frequent from dropdown
        System.out.println("open working dropdown");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[5]/div[6]/div/div[1]/div[2]/div/div[11]")).click();
        Thread.sleep(3000);
        
        //Row 6
      //Select status dropdown (6)
        System.out.println("click dropdown of status");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[6]/div[2]/div/div[1]/div/div[2]/div")).click();
        Thread.sleep(2000);
        //select Not available from dropdown
        System.out.println("Not Available seleced");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[6]/div[2]/div/div[1]/div[2]/div/div[2]")).click();
        Thread.sleep(3000);
        
        //Row 7
        //Select status dropdown (6)
        System.out.println("click dropdown of status");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[7]/div[2]/div/div[1]/div/div[2]/div")).click();
        Thread.sleep(2000);
        //select Not available from dropdown
        System.out.println("Not Available seleced");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/div/div/div/div[2]/div[7]/div[2]/div/div[1]/div[2]/div/div[2]")).click();
        Thread.sleep(3000);
        
        //Click Submit
        System.out.println("click Submit");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div/div[2]/div[2]/div/button")).click();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //loop
        
     // Define the number of rows you want to fill
//        int numRows = 7;
//
//        for (int i = 0; i < numRows; i++) {
//            // Construct XPath for each row based on the index
//			String rowXPath = "//*[@id='row-" + i + "']";
//			System.out.println("Text of the element: " + rowXPath);
//			
//			//Select status dropdown
//			System.out.println("click dropdown of status NEWWWWW" + i);
//			driver.findElement(By.xpath(rowXPath+"//*[@id=\"cell-2-undefined\"]/div/div[1]/div/div[2]/div")).click();
//			Thread.sleep(1000);
//			//select available from dropdown
//			System.out.println("Available seleced");
//			driver.findElement(By.xpath("//*[@id=\"react-select-4-option-0\"]")).click();
//		    Thread.sleep(1000);
//			    
//		    //click equipment dropdown
//			System.out.println("open quipment dropdown" + " " + i);
//		    driver.findElement(By.xpath(rowXPath+"//*[@id=\"cell-3-undefined\"]/div/div/div/div[2]/div")).click();
//		    Thread.sleep(1000);
//		    //select number from dropdown
//		    System.out.println("select equipment number");
//		    driver.findElement(By.xpath("//*[@id=\"react-select-5-option-45\"]")).click();
//		    Thread.sleep(1000); 
//			  
//			    //select working dropdown
//			System.out.println("open working dropdown");
//			driver.findElement(By.xpath(rowXPath+"//*[@id=\"cell-4-undefined\"]/div/div[1]/div/div[2]/div")).click();
//			Thread.sleep(1000);
//			//select value of working
//			driver.findElement(By.xpath("//*[@id=\"react-select-6-option-33\"]")).click();
//			Thread.sleep(1000);
//			
//			//select frequent dropdown
//			System.out.println("open working dropdown");
//			driver.findElement(By.xpath(rowXPath+"//*[@id=\"cell-6-undefined\"]/div/div[1]/div/div[2]/div")).click();
//			Thread.sleep(1000);
//			//select value of frequent from dropdown
//			System.out.println("open working dropdown");
//			driver.findElement(By.xpath("//*[@id=\"react-select-7-option-17\"]")).click();
//			Thread.sleep(1000);
//
//        }
        

    }    
}

