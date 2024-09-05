package test.automate;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

        driver.get("https://nhcc.kakashi.app");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("khadija.yasin@ascend.com.sa");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Alpha@2040");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);

        System.out.println("Opening Organization Selection...");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement orgSelectContainer = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='select__input-container css-19bb58m']")));
        orgSelectContainer.click();
        System.out.println("Organization Selection Opened successfully.");

        Thread.sleep(2000);

        WebElement optionElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='select__option css-10wo9uf-option' and text()='Technical Support']")));
        optionElement.click();
        System.out.println("Clicked on the 'Technical Support' option");

        WebElement continueButton = driver.findElement(By.xpath("//button[contains(@class, 'CustomButton') and text()='Continue']"));
        continueButton.click();

        //Opening Operation Centers
        Thread.sleep(10000);
        driver.findElement(By.xpath("//span[contains(text(),'Operation Centers')]")).click();
        Thread.sleep(5000);
        System.out.println("Clicked on the Operation Centers");

        //Creating New Operation Center
        driver.findElement(By.xpath("(//span[contains(text(),'Create Operation Center')])[1]")).click();
        System.out.println("Clicked on the create operation");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//input[@id='orgName']")).sendKeys("New");
        Thread.sleep(5000);

        System.out.println("Opening SHOW FIELDS dropdown");

        WebElement dropdownContainer = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]"));
        dropdownContainer.click();
        System.out.println("SHOW FIELDS dropdown opened successfully.");

        Thread.sleep(2000);
        
        //Opening dropdown to add 1st Field
        WebElement first = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")));
        first.click();
        System.out.println("Clicked on the Dropdown for the 1st Time");
        
        //Adding 1st Field
        Thread.sleep(2000);
        WebElement firstdrop = driver.findElement(By.xpath("//div[contains(@class, 'select__option css-10wo9uf-option') and text()='Subject']"));
        firstdrop.click();
        System.out.println("Entered 1st Field");

        Thread.sleep(2000);
        
        //Opening dropdown to add 2nd Field
        WebElement second = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")));
        second.click();
        System.out.println("Clicked on the Dropdown for the 2nd Time");
        
        //Adding 2nd Field
        Thread.sleep(2000);
        WebElement seconddrop = driver.findElement(By.xpath("//div[contains(@class, 'select__option css-10wo9uf-option') and text()='Teams']"));
        seconddrop.click();
        System.out.println("Entered 2nd Field");

        
        //Opening dropdown to add 3rd Field
        Thread.sleep(2000);
        WebElement third = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]"));
        third.click();
        System.out.println("Clicked on the Dropdown for the 3rd Time");

        Thread.sleep(2000);
        
        WebElement drop2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'select__option css-10wo9uf-option') and text()='Attachment']")));
        drop2.click();
        System.out.println("Entered 3rd Field");
    }
}
 