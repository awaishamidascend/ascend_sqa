package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSuccessful {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://nhcc.kakashi.app/login");
     
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("user@test.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Khadija@123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(50000);
		
	}

}
