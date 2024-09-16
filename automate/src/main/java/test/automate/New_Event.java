package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import io.github.bonigarcia.wdm.WebDriverManager;

public class New_Event {
	public static void main(String[] args) throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2)); // Explicit wait
        
     // Maximize the browser window 
        System.out.println("Maximizing the browser window...");
        driver.manage().window().maximize();
        
        
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
        Thread.sleep(2000);
        
        //role selection
        driver.findElement(By.xpath("//div[@class='select__indicator select__dropdown-indicator css-qj08tm-indicatorContainer']")).click();
        System.out.println("dropdown click");

        //select engineer role
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(@class, 'select__option') and contains(@class, 'css-6ie4tr-option') and text()='Engineer']")).click();
        System.out.println("role select");  

        Thread.sleep(3000);
        
        //submit button
        driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
        System.out.println("submit");

        Thread.sleep(5000);
        
      //New Event button
        driver.findElement(By.xpath("//p[normalize-space()='New Event']")).click();
        System.out.println("New Event");

        Thread.sleep(3000);
        
      //New Event Type dropdown
        driver.findElement(By.xpath("(//div[contains(@class,'select__indicator select__dropdown-indicator css-qj08tm-indicatorContainer')])[2]")).click();
        System.out.println("dropdown click");
        
      //New Event Type value select
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/form/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div[1]/div/div/div/div[2]/div/div[2]")).click();
        System.out.println("value selected");
        Thread.sleep(1000);
        
        //event dropdown
        driver.findElement(By.xpath("//*[@id=\"emergence\"]/div/div[1]/div/div/div[2]/div/div/div/div[1]/div[2]/div")).click();
        System.out.println("2nd dropdown clicked");
        Thread.sleep(1000);
        
        
      //event selected
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/form/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/input")).click();
        System.out.println("slect event");
        Thread.sleep(1000);
        
      //Responsible Department dropdown
        driver.findElement(By.xpath("//*[@id=\"emergence\"]/div/div[1]/div/div/div[3]/div/div/div/div[1]/div[2]/div")).click();
        System.out.println("dropdown clicked");
        Thread.sleep(1000);
      
      //Responsible Department value
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/form/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div[3]/div/div/div/div[2]/div/div[2]")).click();
        System.out.println("value selected 3rd dropdown");
        Thread.sleep(1000);
 
        
		WebElement date = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder='Date'])[1]")));
        System.out.println("Detected Calender Box");
        date.click();
		WebElement dateElement = driver.findElement(By.xpath("(//span[@aria-label='September 12, 2024'][normalize-space()='12'])[1]"));
		System.out.println("Detected date");
		dateElement.click();
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", dateElement);
		Thread.sleep(500);
		

		WebElement check = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='select__input-container css-ackcql'])[5]")));
        check.click();
        
        Thread.sleep(1000);
	     //Health Directorate dropdown
        WebElement healthDirectorateDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='select__value-container css-1d8n9bt'])[2]")));
        healthDirectorateDropdown.click();

        System.out.println("dropdown clicked");
        
        // Locate the input field inside the dropdown and enter the search term
        WebElement dropdownInput = driver.findElement(By.xpath("(//div[@class='select__value-container css-1d8n9bt'])[2]"));
        dropdownInput.sendKeys("Qassim Health Directorate");

        // Wait for the option to be visible and then click on the desired option
        WebElement qassimOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Qassim Health Directorate']")));
        qassimOption.click();
        Thread.sleep(1000);
        
        
	}}
