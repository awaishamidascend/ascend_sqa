package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Template {

    WebDriver driver = null;

    @BeforeTest
    public void setUpTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void googleSearch() {
        // Go to google.com
        driver.get("https://google.com");
        // Enter text in search textbox
        driver.findElement(By.name("q")).sendKeys("Ascend Solutions");
        // Press Enter key
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
    }

    @AfterTest
    public void tearDownTest() {
        // Close browser
        driver.quit();
        System.out.println("Test Completed Successfully");
    }
}
