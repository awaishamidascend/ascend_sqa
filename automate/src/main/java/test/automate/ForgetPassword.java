package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgetPassword {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://nhcc.ascend.com.sa/");
        Thread.sleep(5000);
        
        //fprget password page 
        driver.findElement(By.xpath("//span[@class='for forget-pass']")).click();
        
        //enter email 
        driver.findElement(By.xpath("//input[@placeholder='Admin@ascend.com.sa']")).sendKeys("test@test.com");
        //submit
        driver.findElement(By.xpath("//button[normalize-space()='Reset Password']")).click();
	}


}
