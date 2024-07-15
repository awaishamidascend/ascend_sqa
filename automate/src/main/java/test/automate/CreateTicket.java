package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateTicket {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        System.out.println("Opening the application...");
        driver.get("https://nhcc.kakashi.app/");
        driver.manage().window().maximize();
        System.out.println("Application opened.");
        
        System.out.println("Entering email...");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("user@test.com");
        System.out.println("Email entered.");

        System.out.println("Entering password...");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Khadija@123");
        System.out.println("Password entered.");

        System.out.println("Clicking login button...");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        System.out.println("Logged in successfully.");

        System.out.println("Navigating to Tickets...");
        driver.findElement(By.xpath("//span[@class='menu-title text-truncate']//span[contains(text(),'Tickets')]")).click();
        System.out.println("Clicked on Tickets.");

        System.out.println("Navigating to Create Ticket...");
        driver.findElement(By.xpath("//span[contains(text(),'Create Ticket')]")).click();
        Thread.sleep(5000);
        System.out.println("Clicked on Create Ticket.");

        System.out.println("Entering subject...");
        driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("test subject");
        System.out.println("Subject entered.");

        System.out.println("Entering description...");
        driver.findElement(By.xpath("//div[@class='fr-element fr-view fr-element-scroll-visible']//p")).sendKeys("test description");
        System.out.println("Description entered.");

        System.out.println("Proceeding to the next page...");
        driver.findElement(By.xpath("//div[@id='General-Information']//button[contains(@type,'submit')][normalize-space()='Next']")).click();
        System.out.println("Proceeded to the next page.");

        System.out.println("Selecting team...");
        driver.findElement(By.xpath("//div[@id='Additional-Information']//div[contains(@class,'row')]//div[1]//div[1]//label[1]")).click();
        System.out.println("Team selected.");

        System.out.println("Selecting option in dropdown...");
        String option = "t";
        WebElement dropdown = driver.findElement(By.xpath("//select/option[contains(text(), '" + option + "')]"));
        dropdown.click();
        System.out.println("Dropdown option selected.");

        System.out.println("Test completed. Closing the browser...");
        driver.quit();
        System.out.println("Browser closed.");
    }
}
s