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

public class CreateTicket {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
            System.out.println("Opening the application...");
            driver.get("https://nhcc.ascend.com.sa/login?isQA=true");
            driver.manage().window().maximize();
            System.out.println("Application opened.");
            
            Thread.sleep(5000);

            System.out.println("Entering email...");
            driver.findElement(By.xpath("//input[@id='email']")).sendKeys("awais.hamid@ascend.com.sa");
            System.out.println("Email entered.");

            System.out.println("Entering password...");
            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Alpha@2040");
            System.out.println("Password entered.");

            System.out.println("Clicking login button...");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(5000);
            System.out.println("Logged in successfully.");

            System.out.println("Opening Organization Selection...");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement orgSelectContainer = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='select__input-container css-19bb58m']")));
            orgSelectContainer.click();
            System.out.println("Organization Selection Opened successfully.");
            
            // Wait for the dropdown to load
            Thread.sleep(2000);
            
            // Locate the element by its XPath and click it
            WebElement optionElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='select__option css-10wo9uf-option' and text()='Technical Support']")));
            optionElement.click();
            System.out.println("Clicked on the 'Technical Support' option");
            
         // Locate the element using XPath and click it
            WebElement continueButton = driver.findElement(By.xpath("//button[contains(@class, 'CustomButton') and text()='Continue']"));
            continueButton.click();
            
            Thread.sleep(7000);
            
            // Selecting Tickets
            System.out.println("Selecting Tickets...");
            WebElement ticketsElement = driver.findElement(By.xpath("//span[text()='Tickets']"));
            ticketsElement.click();
            System.out.println("Tickets Selected...");
            Thread.sleep(2000);
            
            // Selecting Create Ticket
            System.out.println("Selecting Create Ticket...");
         // Locate the element using XPath and click it
            WebElement createTicketElement = driver.findElement(By.xpath("//span[contains(text(), 'Create Ticket')]"));
            createTicketElement.click();
            System.out.println("Create Ticket Selected...");
            Thread.sleep(2000);

            System.out.println("Entering subject...");
            driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("test subject");
            System.out.println("Subject entered.");

            Thread.sleep(2000);

            
            System.out.println("Entering description...");
            driver.findElement(By.xpath("//div[@class='fr-element fr-view fr-element-scroll-visible']//p")).sendKeys("test description");
            System.out.println("Description entered.");

            Thread.sleep(2000);

            
            System.out.println("Proceeding to the next page...");
            driver.findElement(By.xpath("//div[@id='General-Information']//button[contains(@type,'submit')][normalize-space()='Next']")).click();
            System.out.println("Proceeded to the next page.");

            Thread.sleep(2000);
            
         // Opening the Team Selector
            System.out.println("Opening the team selector...");
            WebElement teamSelectContainer = wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-5-input")));
            teamSelectContainer.click();
            System.out.println("Team selector opened.");

            // Wait for the options to load and be visible
            Thread.sleep(2000);

            // Selecting Dropdown Option
            System.out.println("Selecting option in dropdown...");
            WebElement dropdownOption = wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-5-option-0")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdownOption);
            Thread.sleep(500); // Wait a bit to ensure the element is visible
            dropdownOption.click();
            System.out.println("Dropdown option 'QA Automation' selected.");
            
            Thread.sleep(2000);

            
        }
    }

