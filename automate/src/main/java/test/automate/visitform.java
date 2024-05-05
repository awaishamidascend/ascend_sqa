package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class visitform {
	
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    
    // Maximize the browser window
    driver.manage().window().maximize();
    
    driver.get("https://dev-efficax-obligation.kakashi.app/login");
    
    Thread.sleep(10000);
    
    // Find and fill in the email and password fields
    driver.findElement(By.xpath("//input[@placeholder='Email']"))
          .sendKeys("system@ascend.com");
    driver.findElement(By.xpath("//input[@placeholder='Password']"))
          .sendKeys("eod777");
    
    // Click on the login button
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    
    Thread.sleep(5000);
    
    String otp = "786786";
    
    // Find the OTP input field and enter OTP
    for (int i = 0; i < otp.length(); i++) {
        char digit = otp.charAt(i);
        String digitAsString = Character.toString(digit);
        String xpath = "//input[@aria-label='Please enter OTP character " + (i + 1) + "']";
        WebElement otpBox = driver.findElement(By.xpath(xpath));
        otpBox.sendKeys(digitAsString);
    }
    
    // Click on the OTP login button
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    
    Thread.sleep(5000);
    // click visit form
	
    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[4]/a[1]")).click();
    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/ul[1]/div[2]/p[1]/li[1]/a[1]/span[2]")).click();
    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/p[1]")).click();
	//select region
    driver.findElement(By.xpath("//div[contains(@class,'select__control select__control--is-focused css-1u57jws-control')]//div[contains(@class,'select__input-container css-ackcql')]")).click();
    //city
    driver.findElement(By.xpath("//input[@placeholder='City']")).sendkeys("test");
    //street name
    driver.findElement(By.xpath("//input[@placeholder='Street name']")).sendkeys("test");
    //district name
    driver.findElement(By.xpath("//input[@placeholder='District Name']")).sendkeys("test");
   //email
    driver.findElement(By.xpath("//input[@placeholder='Institution email']")).sendkeys("test@gmail.com");
    //facility number
    driver.findElement(By.xpath("//input[@placeholder='Facility license number']")).sendkeys("15623");
    
    
    driver.findElement(By.xpath("")).sendkeys("test");
    
    // next button
    driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
    //pharmacy workers
    driver.findElement(By.xpath("//div[@id='pharmacy_workers']//div[2]//input[3]")).click();
    driver.findElement(By.xpath("//div[@id='pharmacy_workers']//div[3]//input[3]")).click();

    //B Standards
    driver.findElement(By.xpath("//div[@id='b_standards']//div[2]//input[3]")).click();
    driver.findElement(By.xpath("//div[@id='b_standards']//div[3]//input[3]")).click();
    driver.findElement(By.xpath("//div[4]//input[3]")).click();
    driver.findElement(By.xpath("//div[5]//input[3]")).click();
    driver.findElement(By.xpath("//div[6]//input[3]")).click();
    driver.findElement(By.xpath("//div[7]//input[3]")).click();
    driver.findElement(By.xpath("//div[8]//input[3]")).click();
    driver.findElement(By.xpath("//div[9]//input[3]")).click();
    driver.findElement(By.xpath("//div[11]//input[3]")).click();
    driver.findElement(By.xpath("//div[12]//input[3]")).click();
    driver.findElement(By.xpath("//div[12]//input[3]")).click();
    driver.findElement(By.xpath("//div[13]//input[3]")).click();
    driver.findElement(By.xpath("//div[14]//input[3]")).click();
    
    //next button
    driver.findElement(By.xpath("//button[@class='waves-effect round btn btn btn-primary']")).click();
    
// Additional remarks
    driver.findElement(By.xpath("//textarea[@placeholder='Note']")).sendkeys("15623");
    driver.findElement(By.xpath("//input[@placeholder='john doe']")).sendkeys("15623");
    driver.findElement(By.xpath("//div[@id='additionalRemarks']//div//div[@class='card']//canvas")).sendkeys("15623");
    driver.findElement(By.xpath("//input[@placeholder='Delegated Person']")).sendkeys("15623");
    driver.findElement(By.xpath("//input[@placeholder='Id Number']")).sendkeys("15623");
    driver.findElement(By.xpath("//input[@placeholder='Issue Place']")).sendkeys("15623");
    driver.findElement(By.xpath("//input[@placeholder='Position']")).sendkeys("15623");
    driver.findElement(By.xpath("//input[@placeholder='Position']")).sendkeys("15623");
    driver.findElement(By.xpath("//body/div[@id='root']/div[@class='wrapper vertical-layout navbar-sticky footer-static vertical-menu-modern menu-expanded']/div[@class='app-content content overflow-hidden']/div[@class='container-xxl p-0 mt-2 animate__animated animate__fadeInLeft']/div[@class='row']/div[@class='col']/div/div[@class='bs-stepper linear']/div[@class='bs-stepper-content']/div[@id='additionalRemarks']/div/div[@class='row']/div[@class='row']/div[@class='col-sm-12 col-md-6']/div[@class='signature']/canvas[1]")).sendkeys("15623");

	
}

}
