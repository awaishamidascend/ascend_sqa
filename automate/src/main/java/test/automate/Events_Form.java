package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Events_Form {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

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

        // Wait for OTP field to be visible
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 1']"));
       
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
