package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NHCC_Live {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://nhcc.ascend.com.sa");

        // Find the email and password fields and enter the credentials
        WebElement emailField = driver.findElement(By.cssSelector("#email"));
        emailField.sendKeys("test@test.com");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Khadija@123");
        
        try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Find the login button and click it
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
        loginButton.click();

        // Wait for a few seconds to see the result
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
	}