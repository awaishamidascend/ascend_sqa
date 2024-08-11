package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgetPassword {

    public static void main(String[] args) throws InterruptedException {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); // Corrected type mismatch issue
        
        // Maximize the browser window
        driver.manage().window().maximize(); // Fixed the manage() method issue

        // Navigate to the specified URL
        driver.get("https://nhcc.ascend.com.sa/"); // Fixed the get() method issue
        Thread.sleep(5000); // Added a sleep to wait for the page to load
        
        // Navigate to the forget password page
        driver.findElement(By.xpath("//span[@class='for forget-pass']")).click(); // Fixed the xpath() method issue
        
        // Enter email address
        driver.findElement(By.xpath("//input[@placeholder='Admin@ascend.com.sa']")).sendKeys("test@test.com");
        
        // Click the submit button to reset the password
        driver.findElement(By.xpath("//button[normalize-space()='Reset Password']")).click();
        
        // Close the browser
        driver.quit(); // Close the browser after the test is complete
    }
}
