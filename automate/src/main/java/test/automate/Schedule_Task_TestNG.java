package test.automate;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Schedule_Task_TestNG {

    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // Open the webpage
        System.out.println("Opening the webpage...");
        driver.get("https://efficax-dental.ascend.com.sa/");
        // Wait for 10 seconds to allow the page to load fully
        System.out.println("Waiting for the page to load...");
        Thread.sleep(5000);
        // Maximize the browser window
        System.out.println("Maximizing the browser window...");
        driver.manage().window().maximize();
        // Entering email and password
        System.out.println("Entering email and password...");
        driver.findElement(By.xpath("//input[@placeholder='Email']"))
                .sendKeys("rida.khan@ascend.com.sa");
        driver.findElement(By.xpath("//input[@placeholder='Password']"))
                .sendKeys("eod777");
        // Clicking on login button
        System.out.println("Clicking on the login button...");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        // Clicking on Dental supplies menu
        System.out.println("Clicking on menu items...");
        driver.findElement(By.xpath(
                "//*[@id=\"root\"]/div[1]/div[1]/div[4]/ul[1]/li[2]"))
                .click();
        Thread.sleep(5000);
        System.out.println("Clicking on form");
        driver.findElement(By.xpath(
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/ul[1]/li[2]/ul[1]/div[2]/li[1]/a[1]/span[1]"))
                .click();
        System.out.println("Clicking on select region");
        Thread.sleep(5000);
        
        // Find the dropdown element
     // Find the dropdown element using a different selector strategy
        WebElement dropdown = driver.findElement(By.xpath("//div[@class='select__input-container css-ackcql']"));
        
        // Initialize Select object
        Select selectObject = new Select(dropdown);
        // Get all available options
        List<WebElement> allOptions = selectObject.getOptions();
        // Print all options
        for (WebElement option : allOptions) {
            System.out.println(option.getText());
        }
    }
}
