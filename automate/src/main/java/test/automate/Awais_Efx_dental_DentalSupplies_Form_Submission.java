package test.automate;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

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
        ExtentTest test = extent.createTest("Equipment Form", "This is EfficaX Dental Test case");

        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Open the webpage
            test.pass("Web page opened");
            driver.get("https://dev-efficax-dental.kakashi.app/");

            // Wait for 5 seconds to allow the page to load fully
            System.out.println("Waiting for the page to load...");
            Thread.sleep(5000);

            // Maximize the browser window
            System.out.println("Maximizing the browser window...");
            driver.manage().window().maximize();
            test.pass("Maximizing window");

            // Entering email and password
            System.out.println("Entering email and password...");
            driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rida.khan@ascend.com.sa");
            test.pass("Entered email");
            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("eod777");
            test.pass("Entered password");

            // Clicking on login button
            System.out.println("Clicking on the login button...");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            test.pass("Clicked login");
            Thread.sleep(5000);

            // Clicking on Dental supplies dropdown
            System.out.println("Clicking on the Dental supplies dropdown...");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/ul[1]/li[1]")).click();
            Thread.sleep(2000);

            // Clicking on dental Supplies Form
            System.out.println("Clicking on the dental Supplies Form...");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/ul[1]/li[1]/ul/div[2]/li[2]/a/span")).click();
            Thread.sleep(2000);

            // Clicking on Region Dropdown dropdown
            System.out.println("Clicking on the Region dropdown...");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div/div[1]/div/div[2]/div")).click();
            Thread.sleep(2000);

            // Selecting region
            System.out.println("Selecting region...");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[1]")).click();
            Thread.sleep(2000);

            // Selecting PHCs dropdown
            System.out.println("Selecting PHC dropdown...");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div[2]/div[1]/div/div[2]/div")).click();
            Thread.sleep(2000);

            // Selecting PHCs value
            System.out.println("Selecting PHC...");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div[2]/div[1]/div[2]/div/div[3]")).click();
            Thread.sleep(2000);

            // Selecting level dropdown
            System.out.println("Clicking Level dropdown...");
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[2]/div/div[4]/div[1]/div/div[2]/div")).click();
            Thread.sleep(2000);

            // Selecting level
            System.out.println("Selecting level...");
            WebElement optionToSelect111 = driver.findElement(By.xpath("//div[contains(text(), 'PHC Warehouse - Dental Service')]"));
            optionToSelect111.click();
            System.out.println("Level Selected...");
            Thread.sleep(2000);

            // Wait for rows to be visible
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            List<WebElement> rows = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@id, 'row-')]")));
            System.out.println("Total rows found: " + rows.size());

            // Iterate through each row and perform the required actions
            for (WebElement row : rows) {
                System.out.println("Processing row: " + row.getAttribute("id"));

                // Scroll to the row (if necessary)
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", row);
                Thread.sleep(500);

                // Find and interact with dropdowns in the row
                List<WebElement> dropdowns = row.findElements(By.xpath(".//input[contains(@id, 'react-select-')]"));
                for (WebElement dropdown : dropdowns) {
                    dropdown.sendKeys("Available");
                    dropdown.sendKeys(Keys.ENTER);
                    System.out.println("Selected 'Available' for dropdown: " + dropdown.getAttribute("id"));
                }

                // Find and interact with text fields in the row
                List<WebElement> textFields = row.findElements(By.xpath(".//input[contains(@id, 'amountLeft-amountLeft-')]"));
                String[] texts = {"100", "200", "300"};
                int textIndex = 0;
                for (WebElement textField : textFields) {
                    wait.until(ExpectedConditions.elementToBeClickable(textField)); // Ensure text field is clickable
                    if (textIndex < texts.length) {
                        textField.clear();
                        textField.sendKeys(texts[textIndex]);
                        System.out.println("Entered text '" + texts[textIndex] + "' in text field for row: " + row.getAttribute("id"));
                        textIndex++;
                    }
                }

                Thread.sleep(500);  // Wait to ensure action is completed before moving to next
            }

        } finally {
            // Close the browser
            extent.flush(); // Flush the extent report
            driver.quit();
        }
    }
}
