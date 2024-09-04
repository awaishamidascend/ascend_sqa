package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reset_Password {
	public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://moh717.ascend.com.sa/login");
        System.out.println("open web");
        Thread.sleep(5000);
        
        
        driver.findElement(By.xpath("//small[normalize-space()='Forgot Password?']")).click();
        System.out.println("forgot password page");
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rida.khan@ascend.com.sa");
        System.out.println("email entered");
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//button[normalize-space()='Send reset link']")).click();
        System.out.println("reset button link");
        Thread.sleep(5000);
        
        
	} }





