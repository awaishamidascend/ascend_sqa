package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTicket {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
       
        WebDriver driver = new ChromeDriver(options);


        driver.get("https://nhcc.kakashi.app");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("user@test.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Khadija@123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(10000);

        //click on Tickets
        Thread.sleep(10000);
        driver.findElement(By.xpath("//span[@class='menu-title text-truncate']//span[contains(text(),'Tickets')]")).click();

        //click on Myticket
        Thread.sleep(10000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/ul[1]/li[2]/ul[1]/div[1]/li[3]/a[1]/span[1]/span[1]")).click();
        Thread.sleep(50000);
        System.out.println("Test completed. Closing the browser...");

        driver.quit();
    }
}
