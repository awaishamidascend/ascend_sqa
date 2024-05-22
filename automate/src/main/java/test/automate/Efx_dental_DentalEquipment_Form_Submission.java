package test.automate;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Efx_dental_DentalEquipment_Form_Submission {

    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Open the webpage
        System.out.println("Opening the webpage...");
        driver.get("https://efficax-dental.ascend.com.sa/");
        
        // Wait for 10 seconds to allow the page to load fully
        System.out.println("Waiting for the page to load...");
        Thread.sleep(5000);
       
        // Maximize the browser window 
        System.out.println("Maximizing the browser window...");
        driver.manage().window().maximize();
        
        // Entering email and password
        System.out.println("Entering email and password...");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rida.khan@ascend.com.sa");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("eod777");
        
        // Clicking on login button
        System.out.println("Clicking on the login button...");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        
        //Clicking on Dental supplies menu
        System.out.println("Clicking on menu items...");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[4]/ul[1]/li[2]")).click();
        Thread.sleep(5000);
        System.out.println("Clicking on form");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/ul[1]/li[2]/ul[1]/div[2]/li[1]/a[1]/span[1]")).click();
        System.out.println("Clicking on select region");
        
        Thread.sleep(5000);
        
     // Find the dropdown element
        WebElement dropdown = driver.findElement(By.className("css-8mmkcg"));

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
//        System.out.println("click dropdown of status");
//        driver.findElement(By.xpath("//*[@id=\"cell-2-undefined\"]/div/div[1]/div/div[2]/div")).click();
//        Thread.sleep(2000);
//        //select available from dropdown
//        System.out.println("Available seleced");
//        driver.findElement(By.xpath("//*[@id=\"react-select-4-option-0\"]")).click();
//        Thread.sleep(3000);
//               
//        //click equipment dropdown
//        System.out.println("open quipment dropdown");
//        driver.findElement(By.xpath("//*[@id=\"cell-3-undefined\"]/div/div/div/div[2]/div")).click();
//        Thread.sleep(3000);
//        //select number from dropdown
//        System.out.println("select equipment number");
//        driver.findElement(By.xpath("//*[@id=\"react-select-5-option-45\"]")).click();
//        Thread.sleep(3000);       
//        
//        //select working dropdown
//        System.out.println("open working dropdown");
//        driver.findElement(By.xpath("//*[@id=\"cell-4-undefined\"]/div/div[1]/div/div[2]/div")).click();
//        Thread.sleep(3000);
//        //select value of working
//        driver.findElement(By.xpath("//*[@id=\"react-select-6-option-33\"]")).click();
//        Thread.sleep(3000);
//        
//        //select frequent dropdown
//        System.out.println("open working dropdown");
//        driver.findElement(By.xpath("//*[@id=\"cell-6-undefined\"]/div/div[1]/div/div[2]/div")).click();
//        Thread.sleep(3000);
//        //select value of frequent from dropdown
//        System.out.println("open working dropdown");
//        driver.findElement(By.xpath("//*[@id=\"react-select-7-option-17\"]")).click();
//        Thread.sleep(3000);
        
        //Row 2
        //select status dropdown 
//        driver.findElement(By.xpath("//*[@id=\"cell-2-undefined\"]/div/div[1]/div/div[2]/div")).click();
//        Thread.sleep(2000);
//        //select available from dropdown
//        System.out.println("Available seleced");
//        driver.findElement(By.xpath("//*[@id=\"react-select-4-option-0\"]")).click();
//        Thread.sleep(3000);
     
        //loop
        
     // Define the number of rows you want to fill
        int numRows = 7;

        for (int i = 0; i < numRows; i++) {
            // Construct XPath for each row based on the index
			String rowXPath = "//*[@id='row-" + i + "']";
			System.out.println("Text of the element: " + rowXPath);
			
			//Select status dropdown
			System.out.println("click dropdown of status NEWWWWW" + i);
			driver.findElement(By.xpath(rowXPath+"//*[@id=\"cell-2-undefined\"]/div/div[1]/div/div[2]/div")).click();
			Thread.sleep(1000);
			//select available from dropdown
			System.out.println("Available seleced");
			driver.findElement(By.xpath("//*[@id=\"react-select-4-option-0\"]")).click();
		    Thread.sleep(1000);
			    
		    //click equipment dropdown
			System.out.println("open quipment dropdown" + " " + i);
		    driver.findElement(By.xpath(rowXPath+"//*[@id=\"cell-3-undefined\"]/div/div/div/div[2]/div")).click();
		    Thread.sleep(1000);
		    //select number from dropdown
		    System.out.println("select equipment number");
		    driver.findElement(By.xpath("//*[@id=\"react-select-5-option-45\"]")).click();
		    Thread.sleep(1000); 
			  
			    //select working dropdown
			System.out.println("open working dropdown");
			driver.findElement(By.xpath(rowXPath+"//*[@id=\"cell-4-undefined\"]/div/div[1]/div/div[2]/div")).click();
			Thread.sleep(1000);
			//select value of working
			driver.findElement(By.xpath("//*[@id=\"react-select-6-option-33\"]")).click();
			Thread.sleep(1000);
			
			//select frequent dropdown
			System.out.println("open working dropdown");
			driver.findElement(By.xpath(rowXPath+"//*[@id=\"cell-6-undefined\"]/div/div[1]/div/div[2]/div")).click();
			Thread.sleep(1000);
			//select value of frequent from dropdown
			System.out.println("open working dropdown");
			driver.findElement(By.xpath("//*[@id=\"react-select-7-option-17\"]")).click();
			Thread.sleep(1000);

        }
        

    }    
}

