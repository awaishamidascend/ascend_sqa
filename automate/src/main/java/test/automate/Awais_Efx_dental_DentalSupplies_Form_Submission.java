package test.automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Awais_Efx_dental_DentalSupplies_Form_Submission {

    public static void main(String[] args) throws InterruptedException {

        // Initialize Extent Reports
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("rida_report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        ExtentTest test = extent.createTest("Equipment Form", "This is efficaX Dental Test case");

        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

            // Open the webpage
            test.pass("web page open");
            driver.get("https://dev-efficax-dental.kakashi.app/login");

            // Wait for 5 seconds to allow the page to load fully
            System.out.println("Waiting for the page to load...");
            Thread.sleep(5000);

            // Maximize the browser window
            System.out.println("Maximizing the browser window...");
            driver.manage().window().maximize();
            test.pass("maximizing window");

            // Entering email and password
            System.out.println("Entering email and password...");
            driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rida.khan@ascend.com.sa");
            test.pass("enter email");
            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("eod777");
            test.pass("enter password");

            // Clicking on login button
            System.out.println("Clicking on the login button...");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            test.pass("click login");
            Thread.sleep(5000);

            // Clicking on Dental supplies dropdown
            System.out.println("Clicking on the form selection dropdown...");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/ul[1]/li[1]")).click();
            Thread.sleep(2000);

            // Clicking on dental Supplies Form
            System.out.println("Clicking on the form selection dropdown...");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/ul[1]/li[1]/ul/div[2]/li[2]/a/span")).click();
            Thread.sleep(2000);

            // Clicking on Region Dropdown dropdown
            System.out.println("Clicking on the form selection dropdown...");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div")).click();
            Thread.sleep(2000);

            // Selecting region
            System.out.println("Select region...");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[1]")).click();
            Thread.sleep(2000);

            // Selecting PHCs dropdown
            System.out.println("Select PHC dropdown...");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div[2]/div[1]/div/div[2]/div")).click();
            Thread.sleep(2000);

            // Selecting PHCs value
            System.out.println("Select PHC...");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div[2]/div[1]/div[2]/div/div[3]")).click();
            Thread.sleep(2000);

            // Selecting level dropdown
            System.out.println("Click dropdown...");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div[4]/div[1]/div/div[2]/div")).click();
            Thread.sleep(2000);

            // Selecting level
            System.out.println("Select level...");
            WebElement optionToSelect111 = driver.findElement(By.xpath("//div[contains(text(), 'PHC Warehouse - Dental Service')]"));
            optionToSelect111.click();
            System.out.println("Level Selected...");
            Thread.sleep(2000);
            
         // Locate all input fields by common class name
            System.out.println("Select dropdown...");
            // Step 1: Select option "Piece" from the first dropdown


            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, Math.max(document.documentElement.scrollHeight, document.body.scrollHeight, document.documentElement.clientHeight));");

         // Wait for the dropdown input to be clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement dropdownInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'select__input-container')]//input[@id='react-select-5-input']")));

            // Click the dropdown input to activate it
            dropdownInput.click();

            // Type the desired option text into the input field
            dropdownInput.sendKeys("Piece");

            // Wait for the dropdown options to be visible and interactable
            WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='react-select-5-option-0']")));

            // Scroll the option into view
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", option);

            // Click on the option
            option.click();

            System.out.println("First Dropdown Selected...");
            Thread.sleep(2000);

         // Locate the input field of the second dropdown
            WebElement dropdownInput2 = driver.findElement(By.xpath("//input[@id='react-select-6-input']"));

            // Click to activate and open the dropdown
            dropdownInput2.click();

            // Type the desired option text into the input field
            dropdownInput2.sendKeys("Not Available");

            // Wait for the dropdown options to be visible and interactable
            WebElement option2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='react-select-6-input']")));

            // Scroll the option into view if needed
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", option2);

            // Click on the option to select it
            option2.click();
            System.out.println("Second Dropdown Selected...");





        } finally {
            // Close the browser
            driver.quit();
            extent.flush(); // Flush the extent report
        }
            
    }
    
    
}
