package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Export717 {
	public static void main(String[] args) throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://efficax-717.kakashi.app/login");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rida.khan@ascend.com.sa");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("eod777");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(10000);
        String otp = "786786";
        // Find the OTP input field
        //WebElement otpInput = driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 1']"));
        // Loop through each digit of the OTP and enter it into the input field
        for (int i = 0; i < otp.length(); i++) {
            char digit = otp.charAt(i);
            String digitAsString = Character.toString(digit);
            // Construct XPath for locating each box of the OTP input field
            String xpath = "//input[@aria-label='Please enter OTP character " + (i + 1) + "']";
            WebElement otpBox = driver.findElement(By.xpath(xpath));
            otpBox.sendKeys(digitAsString);
        }
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(10000);
        
        //role selection
        driver.findElement(By.xpath("//div[@class='select__indicator select__dropdown-indicator css-qj08tm-indicatorContainer']")).click();
        System.out.println("dropdown click");

        //select admin role
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[2]/div[2]/div/div/form/div/div[3]/div/div/div[2]/div/div[2]")).click();
        System.out.println("role select");

        Thread.sleep(1000);
        

        //submit button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div[2]/div[2]/div/div/form/div/button")).click();
        System.out.println("submit");

        Thread.sleep(1000);
        //export button
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div/div[2]/button[2]")).click();
        System.out.println("export");

	}
}