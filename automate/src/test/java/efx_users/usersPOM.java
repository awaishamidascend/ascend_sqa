package efx_users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class usersPOM extends WebDriver.webdriverSetup {

    public static void previous() {

        driver.findElement(By.xpath("//div[@class='weekContainer']//div[1]//*[name()='svg']")).click();

    }


    public static void timesheets() {

        driver.findElement(By.xpath("(//span[normalize-space()='Timesheets'])[1]")).click();

    }
}

