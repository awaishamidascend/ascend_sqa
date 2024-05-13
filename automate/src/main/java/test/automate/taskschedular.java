package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class taskschedular {


    public static void main(String[] args) throws Throwable {
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

     
    
  
    driver.findElement(By.xpath("//span[@class='menu-item text-truncate'][normalize-space()='Schedule Task Form']")).click();
    driver.findElement(By.xpath("//p[normalize-space()='Add Schedule']")).click();
    driver.findElement(By.xpath("//div[contains(@class,'select__control select__control--is-focused css-1u57jws-control')]//div[contains(@class,'select__input-container css-ackcql')]")).click();
    driver.findElement(By.xpath("//div[contains(@class,'select__control select__control--is-focused select__control--menu-is-open css-1u57jws-control')]//div[contains(@class,'select__input-container css-ackcql')]")).click();
    driver.findElement(By.xpath("//div[contains(@class,'select__value-container css-1d8n9bt')]//div[contains(@class,'select__input-container css-ackcql')]")).click();
    driver.findElement(By.xpath("//div[contains(@class,'select__control select__control--is-focused select__control--menu-is-open css-1u57jws-control')]//div[contains(@class,'select__input-container css-ackcql')]")).click();
    driver.findElement(By.xpath("//div[contains(@class,'select__value-container css-1d8n9bt')]//div[contains(@class,'select__input-container css-ackcql')]")).click();
    driver.findElement(By.xpath("//div[contains(@class,'select__control select__control--is-focused select__control--menu-is-open css-1u57jws-control')]//div[contains(@class,'select__input-container css-ackcql')]")).click();
    //select inspector
    driver.findElement(By.xpath("//div[contains(@class,'select__control select__control--is-focused css-1u57jws-control')]//div[contains(@class,'select__input-container css-ackcql')]")).click();
    driver.findElement(By.xpath("//div[contains(@class,'select__control select__control--is-focused select__control--menu-is-open css-1u57jws-control')]//div[contains(@class,'select__input-container css-ackcql')]")).click();
    //select steps
    driver.findElement(By.xpath("//div[contains(@class,'select__value-container select__value-container--is-multi css-1d8n9bt')]//div[contains(@class,'select__input-container css-ackcql')]")).click();
    driver.findElement(By.xpath("//div[@class='select__value-container select__value-container--is-multi select__value-container--has-value css-1hwfws3']//div[@class='select__input-container css-ackcql']")).click();
    //review
    driver.findElement(By.xpath("//span[normalize-space()='Review']")).click();
    //submit
    driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
    //driver.findElement(By.xpath("")).click();
    //driver.findElement(By.xpath("")).click();
    //driver.findElement(By.xpath("")).click();
    //driver.findElement(By.xpath("")).click();

    
        } finally {
            // Close the WebDriver instance
            driver.quit();
}
}
}

