package test.automate;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class decibel {
	
	
	
	
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Open the webpage
        System.out.println("Opening the webpage...");
        driver.get("https://bpo.mydecibel.com/login.aspx");
        
        // Wait for 10 seconds to allow the page to load fully
        System.out.println("Waiting for the page to load...");
        Thread.sleep(5000);
       
        // Maximize the browser window 
        System.out.println("Maximizing the browser window...");
        driver.manage().window().maximize();
        
        // Entering email and password
        System.out.println("Entering email and password...");
        driver.findElement(By.xpath("//*[@id=\"tb_UserId\"]")).sendKeys("rida.khan@ascend.com.sa");
        driver.findElement(By.xpath("//*[@id=\"tb_Password\"]")).sendKeys("Alpha@76");
        driver.findElement(By.xpath("//*[@id=\"pb_SignIn\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"cardlist_MyDashboard\"]/div[1]/div/ul/li/a/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"span_MenuName\"]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_pb_PunchTimeIn\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"navBar_Rp_Navigation_Rp_Nav2_0_Rp_Nav3_0_aLink_0\"]/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_pb_PunchTimeIn\"]")).click();
        
        
        
    }
    
}