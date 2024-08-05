package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class pharmacy1form {
    public static void main(String[] args) throws InterruptedException {
        // Setting up ExtentReports for logging test execution
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("romeesa.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        test.log(Status.INFO, "Starting the test execution");

        // Setting up WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Opening the web application and logging in
        driver.get("https://dev-efficax-obligation.kakashi.app/login");
        Thread.sleep(10000); // Using Thread.sleep for demonstration; prefer WebDriverWait in real scenarios

        // Login process
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("system@ascend.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("eod777");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        System.out.println("Login Success");

        // Navigate to Forms and Self Assessment form
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Forms']"))).click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class,'menu-item text-truncate')][normalize-space()='Pharmacies Self Assessment - Medicine Availability']"))).click();
        Thread.sleep(5000);

        // Click Add new form
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='Add New Form']"))).click();
        Thread.sleep(8000);
        System.out.println("Clicked Add New Form");
     // Fill in Region
        WebElement regionDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.react-select.css-b62m3t-container")));
        regionDropdown.click();
        Thread.sleep(2000);

        // Input the value and press Enter to select it
        WebElement dropdownInput = driver.findElement(By.cssSelector("div.select__input-container input.select__input"));
        dropdownInput.sendKeys("QASSIM");
        Thread.sleep(1000); // Adjust timing as needed
        dropdownInput.sendKeys(Keys.ENTER);

        System.out.println("Selected Region: QASSIM");

        // Wait for the site dropdown to be clickable
        WebElement siteDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")));
        //siteDropdown.click();
        Thread.sleep(2000);

        // Input the value and press Enter to select it
        siteDropdown.sendKeys("6300027951 - Kiwan Medical Company - شركة كيوان الطبية");
        Thread.sleep(1000); // Adjust timing as needed
        siteDropdown.sendKeys(Keys.ENTER);

        System.out.println("Selected Site: 6300027951 - Kiwan Medical Company - شركة كيوان الطبية");

        /*
        driver.findElement(By.xpath("//input[@placeholder='Field1']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@placeholder='Field2']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@placeholder='District Name']")).sendKeys("test");
        driver.findElement(By.xpath("//span[normalize-space()='Get Location']")).click();
        */

        // Logging test completion
        test.log(Status.INFO, "Test completed successfully");
        // Ending the test and closing the WebDriver
     
    }
}
