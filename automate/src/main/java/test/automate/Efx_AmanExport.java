package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Efx_AmanExport {
	public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://efficax-obligation.ascend.com.sa/login?isQA=true");
        driver.manage().window().maximize();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("system@ascend.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("eod777");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        String otp = "786786";
        // Find the OTP input field
        // Loop through each digit of the OTP and enter it into the input field
        for (int i = 0; i < otp.length(); i++) {
            char digit = otp.charAt(i);
            String digitAsString = Character.toString(digit);
            // Construct XPath for locating each box of the OTP input field
            String xpath = "//input[@aria-label='Please enter OTP character " + (i + 1) + "']";
            WebElement otpBox = driver.findElement(By.xpath(xpath));
            otpBox.sendKeys(digitAsString);
        }
        //OTP Login Button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//img)[8]")).click();

    }}
