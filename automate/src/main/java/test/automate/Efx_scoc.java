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

    public static void main(String[] args) {
    	
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); // Maximizing the browser window

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://efficax-ssr.kakashi.app/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement emailInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Email']")));

        emailInput.sendKeys("awais.hamid@ascend.com.sa");

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement passwordInput = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Password']")));

        passwordInput.sendKeys("eod777");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement indicatorElement = driver.findElement(By.cssSelector(".select__indicator.select__dropdown-indicator.css-tlfecz-indicatorContainer"));

        indicatorElement.click();
        
    }
}
