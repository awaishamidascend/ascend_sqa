package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class taskschedular {

    public static void main(String[] args) {
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

            Thread.sleep(5000);

            String otp = "786786";

            for (int i = 0; i < otp.length(); i++) {
                char digit = otp.charAt(i);
                String digitAsString = Character.toString(digit);
                String xpath = "//input[@aria-label='Please enter OTP character " + (i + 1) + "']";
                WebElement otpBox = driver.findElement(By.xpath(xpath));
                otpBox.sendKeys(digitAsString);
            }

            driver.findElement(By.xpath("//button[@type='submit']")).click();

            Thread.sleep(10000);

            driver.findElement(By.xpath("(//span[@class='menu-item text-truncate'][normalize-space()='Schedule Task Form'])[1]")).click();
            Thread.sleep(5000);

            driver.findElement(By.xpath("//p[normalize-space()='Add Schedule']")).click();
            // Add more actions here... 

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
