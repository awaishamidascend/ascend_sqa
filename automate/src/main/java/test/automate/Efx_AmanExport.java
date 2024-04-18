import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Efx_AmanExport {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        driver.get("https://efficax-obligation.ascend.com.sa/login?isQA=true");
        
        Thread.sleep(10000);
        
        // Find and fill in the email and password fields
        driver.findElement(By.xpath("//input[@placeholder='Email']"))
              .sendKeys("system@ascend.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']"))
              .sendKeys("eod777");
        
        // Click on the login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        Thread.sleep(5000);
        
        String otp = "786786";
        
        // Find the OTP input field and enter OTP
        for (int i = 0; i < otp.length(); i++) {
            char digit = otp.charAt(i);
            String digitAsString = Character.toString(digit);
            String xpath = "//input[@aria-label='Please enter OTP character " + (i + 1) + "']";
            WebElement otpBox = driver.findElement(By.xpath(xpath));
            otpBox.sendKeys(digitAsString);
        }
        
        // Click on the OTP login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        Thread.sleep(5000);
        
        // Perform click action on the desired element (e.g., export button)
        driver.findElement(By.xpath("(//img)[8]")).click();
        
        // Close the WebDriver instance
        driver.quit();
    }
}
