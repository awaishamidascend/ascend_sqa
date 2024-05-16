package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class taskschedular {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();

            driver.get("https://efficax-obligation.ascend.com.sa/login?isQA=true");
            Thread.sleep(10000);

            driver.findElement(By.xpath("//input[@placeholder='Email']"))
                    .sendKeys("system@ascend.com");
            driver.findElement(By.xpath("//input[@placeholder='Password']"))
                    .sendKeys("eod777");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(10000);
            
            driver.findElement(By.xpath("//span[contains(text(),'Schedule Task Form')]")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("//p[normalize-space()='Add Schedule']")).click();
            Thread.sleep(5000);
            
            Actions actions = new Actions(driver);
            WebElement dropdownTrigger = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]"));
            dropdownTrigger.click();
            System.out.println("1st Dropdown Opened");
            Thread.sleep(3000);
            
            WebElement optionToSelect = driver.findElement(By.xpath("//div[contains(text(), 'Medical Drugs')]"));
            optionToSelect.click();
            System.out.println("Option Selected medical Drugs");

            Thread.sleep(5000);
            
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]")).click();
            Thread.sleep(1000);
            System.out.println("Clicked Region");

            
            actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
            Thread.sleep(5000);
            System.out.println("Select Region");
            
            
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]")).click();
            Thread.sleep(6000);
            System.out.println("Click Site");

            
            actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
            System.out.println("Select Site");

            
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[6]/input[1]")).click();
            System.out.println("Date Selected");

            
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[8]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
            System.out.println("Inspector Dropdown Opened");

            actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
            System.out.println("Inspector Selected");
            

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            System.out.println("Performed Scroll");
            Thread.sleep(3000);
            
            WebElement dropdownTrigger1 = driver.findElement(By.xpath("(//div[@class='select__input-container css-ackcql'])[5]"));
            dropdownTrigger1.click();
            System.out.println("Last Dropdown Opened");
            Thread.sleep(3000);
            
            WebElement optionToSelect1 = driver.findElement(By.xpath("//div[contains(text(), 'الكوادر')]"));
            optionToSelect1.click();
            System.out.println("Option Selected الكوادر");

            driver.findElement(By.xpath("//span[normalize-space()='Review']")).click();
            driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
            
        } finally {
            // Close the WebDriver instance
        }
    }
}
