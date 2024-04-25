package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Clock;



public class Events_Form_TestGrid {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://efficax-717.kakashi.app/");
        driver.manage().window().maximize();
        
        // Fill in email field
        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        emailField.sendKeys("dev-romeesa.ashfaq@ascend.com.sa");

        // Fill in password field
        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordField.sendKeys("eod777");

        // Click on Sign In button
        WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
        signInButton.click();

        String otp = "786786";
        // Find the OTP input field
        //WebElement otpInput = driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 1']"));
        // Loop through each digit of the OTP and enter it into the input field
        for (int i = 0; i < otp.length(); i++) {
            char digit = otp.charAt(i);
            String digitAsString = Character.toString(digit);
            // Construct XPath for locating each box of the OTP input field
            String xpath = "//input[@aria-label='Please enter OTP character " + (i + 1) + "']";
            WebElement otpBox = driver.findElement(By.xpath(xpath));
            otpBox.sendKeys(digitAsString);
        }
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary my-1 btn btn-outline-secondary')]")).click();
        Thread.sleep(1000);
        
        // Wait for the button to be clickable
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary my-1 btn btn-outline-secondary')]")).click();
        
        // Wait for the dropdown to be clickable
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='select__control select__control--is-focused select__control--menu-is-open css-1u57jws-control']//div[@class='select__input-container css-ackcql']")).click();
        
        // Select "Environmental event" from the dropdown menu
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[text()='Environmental event']")).click();
        
        // Rest of your code...
    } 
}
