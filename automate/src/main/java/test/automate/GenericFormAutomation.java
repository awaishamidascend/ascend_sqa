package test.automate;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

public class GenericFormAutomation {

    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to the login page
        driver.get("https://efficax-obligation.ascend.com.sa/login?isQA=true");
        Thread.sleep(10000); // Wait for the page to load
        
        // Find and fill in the email and password fields
        driver.findElement(By.xpath("//input[@placeholder='Email']"))
              .sendKeys("system@ascend.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']"))
              .sendKeys("eod777");

        // Click on the login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000); // Wait for login to complete

        Thread.sleep(3000);
        // Navigate to Forms and Self Assessment form
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Forms']"))).click();

        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Forms']"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class,'menu-item text-truncate')][normalize-space()='Pharmacies Self Assessment - Medicine Availability']"))).click();
        Thread.sleep(3000);

        // Click Add new form
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='Add New Form']"))).click();
        Thread.sleep(3000);
        System.out.println("Clicked Add New Form");
        Thread.sleep(3000); // Wait for the form page to load

        // Automate the forms
        automateForms(driver);

        // Close the browser
        driver.quit();
    }

    public static void automateForms(WebDriver driver) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Handle form elements dynamically
        for (int page = 1; page <= 4; page++) { // Adjust according to the number of pages
            List<WebElement> elements = driver.findElements(By.xpath("//*[self::input or self::select or self::textarea or @role='combobox' or @role='radiogroup' or @role='listbox']"));

            for (WebElement element : elements) {
                wait.until(ExpectedConditions.elementToBeClickable(element)); // Wait until the element is clickable

                String tagName = element.getTagName();
                js.executeScript("arguments[0].scrollIntoView(true);", element); // Scroll element into view

                if (tagName.equals("input")) {
                    String type = element.getAttribute("type");
                    switch (type) {
                        case "text":
                        case "search":
                            element.sendKeys("Sample Text");
                            break;
                        case "radio":
                        case "checkbox":
                            if (!element.isSelected()) {
                                element.click();
                            }
                            break;
                        default:
                            System.out.println("Unhandled input type: " + type);
                    }
                } else if (tagName.equals("select")) {
                    Select dropdown = new Select(element);
                    dropdown.selectByIndex(1); // Handle dropdowns
                } else if (tagName.equals("textarea")) {
                    element.sendKeys("Sample Text");
                } else if (element.getAttribute("role").equals("combobox")) {
                    element.click();
                    WebElement dropdownOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='listbox']//div[@role='option']")));
                    dropdownOption.click();
                } else {
                    System.out.println("Unknown element type: " + tagName);
                }
            }

            // Click "Next" to go to the next page if applicable
            // driver.findElement(By.xpath("//button[text()='Next']")).click();
            Thread.sleep(2000); // Wait for the next page to load
        }
    }
}