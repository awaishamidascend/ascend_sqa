package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dashboard {

    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Open the webpage
        driver.get("https://nhcc.kakashi.app/login");
        driver.manage().window().maximize();

        // Enter login credentials
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("user@test.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Khadija@123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(50000);

        System.out.println("Login Successful");
        
        WebElement boxA = driver.findElement(By.xpath("//a[normalize-space()='Team View']"));
        
        
        Actions actions = new Actions (driver);
        actions.moveToElement (boxA);
        actions.build().perform();
        System.out.println("Bottom of page");
    }
}
