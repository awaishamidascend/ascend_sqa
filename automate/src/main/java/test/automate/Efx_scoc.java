package test.automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Efx_scoc {

    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriverManager to manage the WebDriver binaries
        WebDriverManager.chromedriver().setup();
        
        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximizing the browser window
        driver.manage().window().maximize();

        // Setting timeouts for WebDriver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        // Navigating to the login page
        driver.get("https://efficax-ssr.kakashi.app/login");

        // Creating WebDriverWait instance with timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Waiting for email input field to be clickable
        WebElement emailInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Email']")));

        // Entering email
        emailInput.sendKeys("awais.hamid@ascend.com.sa");

        // Creating another WebDriverWait instance with timeout
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Waiting for password input field to be clickable
        WebElement passwordInput = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Password']")));

        // Entering password
        passwordInput.sendKeys("eod777");

        // Clicking on the submit button
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Finding and clicking on an element using CSS selector
        WebElement indicatorElement = driver.findElement(By.cssSelector(".select__indicator.select__dropdown-indicator.css-tlfecz-indicatorContainer"));
        indicatorElement.click();
        
        Thread.sleep(5000);

        // Closing the browser
        driver.quit();
    }
}
