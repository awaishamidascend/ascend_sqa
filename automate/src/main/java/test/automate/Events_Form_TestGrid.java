package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Events_Form_TestGrid {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://efficax-717.kakashi.app/");
        driver.manage().window().maximize();


        // Fill in email field
        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        emailField.sendKeys("dev-romeesa.ashfaq@ascend.com.sa");

        // Fill in password field
        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordField.sendKeys("eod777");

        // Click on Sign In button
        WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
        signInButton.click();

        // Wait for OTP field to be visible
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 1']"));
       
        // Fill in OTP fields
        String[] otpValues = {"7", "8", "6", "7", "8", "6"};
        for (int i = 0; i < otpValues.length; i++) {
            WebElement otpField = driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character " + (i + 1) + "']"));
            otpField.sendKeys(otpValues[i]);
        }

        // Click on Submit button
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();
        Thread.sleep(10000);
        //open event form
        driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary my-1 btn btn-outline-secondary')]")).click();
        Thread.sleep(10000);
        //driver.findElement(By.xpath("//*[@id=\"emergence\"]/div/div[1]/div/div/div[1]/div/div/div/div/div[1]/div[2]")).click();
        
        Actions actions = new Actions(driver);
        WebElement dropdownTrigger = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]"));
        dropdownTrigger.click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

        System.out.println("1st Dropdown Opened");
        Thread.sleep(3000);

        WebElement optionToSelect = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]"));
        optionToSelect.click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        System.out.println("Event is selected");
        Thread.sleep(5000);
        
        WebElement optionToSelect1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]"));
        optionToSelect1.click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        System.out.println("responsible department");
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/span[23]")).click();
        System.out.println("Date Selected");
        
        WebElement optionToSelect11 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]"));
        optionToSelect11.click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        System.out.println("Health directorate");
        Thread.sleep(10000);
        
        WebElement optionToSelect111 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]"));
        optionToSelect111.click();
        Thread.sleep(5000);
        actions.sendKeys(Keys.ENTER).perform();
        System.out.println("Health cluster");
        Thread.sleep(10000);
        
        
        // Find the input field element
        WebElement inputField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/textarea[1]"));

        // Enter text into the input field
        inputField.sendKeys("test");
        Thread.sleep(10000);
        
        // perform scroll
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        System.out.println("Performed Scroll");
        Thread.sleep(3000);

        
        //next step
        WebElement optionToSelect1111 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]"));
        optionToSelect1111.click();

        //Detection
        // scroll up
        Actions actions1 = new Actions(driver);

        // Scroll up (simulate pressing the Page Up key)
        actions1.sendKeys(Keys.PAGE_UP).perform();
        
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[2]/div[1]/span[25]")).click();
        System.out.println("Date Selected");
        
        //enter detection narrative
        WebElement inputField1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/textarea[1]"));

        // Enter text into the input field
        inputField1.sendKeys("test");
        
        
        WebElement optionToSelect111111 = driver.findElement(By.xpath(""));
        optionToSelect111111.click();
        actions1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        System.out.println("Detection bottleneck");
        Thread.sleep(5000);
        
        //enter detection enablers
        WebElement inputField11 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/textarea[1]"));

        // Enter text into the input field
        inputField11.sendKeys("test");
        
        
        
        
        
    }
}
