package test.automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OperationExport {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
     
      
        driver.get("https://nhcc.kakashi.app");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("khadija.yasin@ascend.com.sa");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Alpha@2040");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(10000);
        
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

        //click on Operation center
        Thread.sleep(10000);
        driver.findElement(By.xpath("//span[contains(text(),'Operation Centers')]")).click();
        Thread.sleep(7000);
      
        driver.findElement(By.xpath("//span[contains(text(),'Operation Center List')]")).click();
        
        System.out.println("operation center listing");
        
        //operation cemter export click
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[@class='text']")).click();
        Thread.sleep(10000);

        
	}

}
