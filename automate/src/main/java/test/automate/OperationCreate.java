package test.automate;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OperationCreate {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Increased wait time to 20 seconds

        driver.get("https://nhcc.kakashi.app");
        driver.manage().window().maximize();

        // Login
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("khadija.yasin@ascend.com.sa");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Alpha@2040");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);

        // Extra wait to ensure page is fully loaded
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='select__input-container css-19bb58m'])[1]")));

        // Organization Selection
        WebElement orgSelectContainer = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='select__input-container css-19bb58m'])[1]")));
        orgSelectContainer.click();  // Click the dropdown
        
        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'select__option') and text()='Technical Support']")));
        option.click();  // Select the option
        
        WebElement continueButton = driver.findElement(By.xpath("//button[contains(@class, 'CustomButton') and text()='Continue']"));
        continueButton.click();

        // Opening Operation Centers
        Thread.sleep(10000);
        driver.findElement(By.xpath("//span[contains(text(),'Operation Centers')]")).click();
        Thread.sleep(5000);

        // Creating New Operation Center
        driver.findElement(By.xpath("(//span[contains(text(),'Create Operation Center')])[1]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//input[@id='orgName']")).sendKeys("New");

        // Opening and Selecting Dropdown Fields (Opening the dropdown each time)
        for (String field : new String[]{"Priority", "Teams", "Attachment"}) {
            WebElement dropdownContainer = driver.findElement(By.xpath("(//div[@class='select__input-container css-19bb58m'])[2]"));
            dropdownContainer.click();  // Click the dropdown
            WebElement fieldOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'select__option') and text()='" + field + "']")));
            fieldOption.click();  // Select the option
            Thread.sleep(2000);
        }

        // Close the browser
        driver.quit();
    }
}
