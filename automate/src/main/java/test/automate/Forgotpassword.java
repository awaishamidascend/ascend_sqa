package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Forgotpassword {
	WebDriverManager.chromedriver.setup();
    WebDriver driver = new ChromeDriver();
    
    // Maximize the browser window
    driver.manage().window().maximize();
    driver.get("https://efficax-obligation.ascend.com.sa/login?isQA=true");
    
    Thread.sleep(10000);
    
    driver.findElement(By.xpath("//p[@class='my-2']")).click();
    
    driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("system@ascend.com");
    
    driver.findElement(By.xpath("//button[@type='submit']")).click();

    driver.get("https://eur05.safelinks.protection.outlook.com/?url=https%3A%2F%2Fefficax-obligation.ascend.com.sa%2Freset-password%2FtEJDIFoAzG7vmkbHs6Xh6oShZjyAofwkRhAYlNJAgs71L4qBFiT1uvIjxLxQ0Gxz%2Fromeesa.ashfaq%40ascend.com.sa&data=05%7C02%7Cromeesa.ashfaq%40ascend.com.sa%7C604aabb39e734dfe57b908dcb54629de%7Cab77ed4a848647c58ba99c0241bed745%7C1%7C0%7C638584560158351890%7CUnknown%7CTWFpbGZsb3d8eyJWIjoiMC4wLjAwMDAiLCJQIjoiV2luMzIiLCJBTiI6Ik1haWwiLCJXVCI6Mn0%3D%7C0%7C%7C%7C&sdata=4WTrIfIs9V7frE9QqIN5N%2BEoJ%2BI%2Bz8jVluAAL%2FgZwnM%3D&reserved=0");
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("eod777");
    driver.findElement(By.xpath("//button[@type='submit']")).click();

}
}