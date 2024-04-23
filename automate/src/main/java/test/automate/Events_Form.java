package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager; // Import WebDriverManager

public class Events_Form {
    public static void main(String[] args) {
        
        // Initialize ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Navigate to the web page
        driver.get("https://efficax-717.kakashi.app/");

        // Fill in email field
        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        emailField.sendKeys("dev-romeesa.ashfaq@ascend.com.sa");

        // Fill in password field
        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordField.sendKeys("eod777");

        // Click on Sign In button
        WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
        signInButton.click();

        // Fill in OTP fields
        String[] otpValues = {"7", "8", "6", "7", "8", "6"};
        for (int i = 0; i < otpValues.length; i++) {
            WebElement otpField = driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character " + (i + 1) + "']"));
            otpField.sendKeys(otpValues[i]);
        }

        // Click on Submit button
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();

        // Perform other actions as needed...

        // Close the browser
        driver.quit();
    }
}
