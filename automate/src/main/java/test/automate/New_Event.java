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
        
        System.out.println("Ab Login hogya");

        
      //New Event button
        driver.findElement(By.xpath("//p[normalize-space()='New Event']")).click();
        System.out.println("New Event");

        Thread.sleep(3000);
        
     // Click on the dropdown to expand it
        driver.findElement(By.xpath("//div[@class='mb-1 col-sm-12 col-md-6']//div[@class='select__value-container select__value-container--has-value css-1d8n9bt']//div[@class='select__input-container css-ackcql']")).click();
        System.out.println("Dropdown clicked");

        // Wait for the option to be visible
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement environmentalEventOption = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'select__option') and text()='Environmental event']")));
        System.out.println("Option found");

        // Click the option
        environmentalEventOption.click();
        System.out.println("Environmental event option selected");
        
        //event dropdown
        driver.findElement(By.xpath("(//div[@aria-hidden='true'])[4]")).click();
        System.out.println("2nd dropdown clicked");
        Thread.sleep(1000); 
      //event selected
        driver.findElement(By.xpath("//input[@id='check' and @name='check' and @type='checkbox']")).click();
        System.out.println("slect event");
        Thread.sleep(1000);
        
      //Responsible Department dropdown
        driver.findElement(By.xpath("//label[text()='Responsible Department*']/following-sibling::div[contains(@class, 'select')]//div[contains(@class, 'select__indicator') and contains(@class, 'select__dropdown-indicator') and contains(@class, 'css-qj08tm-indicatorContainer')]")).click();
        System.out.println("Responsible Department dropdown clicked");
        Thread.sleep(1000);
      
      //Responsible Department value
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/form/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div[3]/div/div/div/div[2]/div/div[2]")).click();
        System.out.println("value selected 3rd dropdown");
        Thread.sleep(1000);
 
        
		WebElement date = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder='Date'])[1]")));
        System.out.println("Detected Calender Box");
        date.click();
		WebElement dateElement = driver.findElement(By.xpath("(//span[@aria-label='September 12, 2024'][normalize-space()='12'])[1]"));
		System.out.println("Detected date");
		dateElement.click();
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", dateElement);
		Thread.sleep(2000);
		

		WebElement healthdropdown = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='select__input-container css-ackcql'])[5]")));
		healthdropdown.click();
	     //Health Directorate dropdown

        System.out.println("dropdown clicked");
        
        Thread.sleep(3000);

        
        WebElement qassimHealthOption = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Qassim Health Directorate']")));
        qassimHealthOption.click();
        System.out.println("Entered Dropdown value");

        Thread.sleep(1000);
        
      //Health cluster dropdown
        WebElement healthcluster = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Health Cluster')]/following-sibling::div//input[@class='select__input']")));
        healthcluster.click();
        System.out.println("health cluster dropdown clicked");
        
        Thread.sleep(1000);

        
        WebElement healthclusterselection = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/form/div/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/input")));
        healthclusterselection.click();
        System.out.println("c3 cluster value selected");

        Thread.sleep(1000);
        
      //Association with certain facility dropdown
        WebElement Associationfacility = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/form/div/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div[3]/div/div/div/div[1]/div[2]/div")));
        Associationfacility.click();
        System.out.println("Associationfacility dropdown clicked");
        Thread.sleep(1000);   
        WebElement Nonhealthfacility = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/form/div/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div[3]/div/div/div/div[2]/div/div[2]/div/div/input")));
        Nonhealthfacility.click();
        System.out.println("Non health facility selected");

        Thread.sleep(1000);
        
      //Type of Non-health facility dropdown
        WebElement TypeofNonfacility = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/form/div/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div[4]/div/div/div/div/div[2]/div")));
        TypeofNonfacility.click();
        System.out.println("Type of Non facility dropdown clicked");
        
        Thread.sleep(1000);

        
        WebElement TypeSelected = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/form/div/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div[4]/div/div/div/div[2]/div/div")));
        TypeSelected.click();
        System.out.println("Non health facility type selected");

        Thread.sleep(1000);
        
        
        //name of Non-health facility
        driver.findElement(By.xpath("(//input[@placeholder='Text'])[1]")).sendKeys("rida");
        System.out.println("text 1");
        Thread.sleep(1000);
        
        //Emergence Narrative
        driver.findElement(By.xpath("(//textarea[@placeholder='Narrative'])[1]")).sendKeys("emergency");
        System.out.println("text 2");
        Thread.sleep(1000);
        
      //address
        WebElement address = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder='Address'])[1]")));       
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", address);
        address.sendKeys("johar town");
        System.out.println("text 3 ");
        
      //next button/page 2
        WebElement nextpage2 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button' and contains(@class, 'next-btn')]/span[text()='Next']")));
        System.out.println("next button detected");      
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nextpage2);
	    nextpage2.click();
	    
        //page 2 
        //Date of detection*
        WebElement datedetection = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder='yyyy-mm-dd | 24:45'])[1]")));
        System.out.println("Detected Calender Box");
        datedetection.click();
		WebElement datePick = driver.findElement(By.xpath("//div[@class='flatpickr-calendar hasTime animate open arrowTop']//div[@class='flatpickr-days']"));
		System.out.println("Detected date");
		datePick.click();
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", dateElement);
		Thread.sleep(2000);
		
		//Detection Narrative
        driver.findElement(By.xpath("//textarea[@placeholder='Type Here']")).sendKeys("Narrative");
        System.out.println("text enetered (2) ");
        //push
        //comment 
		
	}}


