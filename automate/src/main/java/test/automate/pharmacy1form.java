package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class pharmacy1form {
    public static void main(String[] args) throws InterruptedException {
        // Setting up ExtentReports for logging test execution
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("romeesa.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        test.log(Status.INFO, "Starting the test execution");

        // Setting up WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Opening the web application and logging in
        driver.get("https://dev-efficax-obligation.kakashi.app/login");
        Thread.sleep(10000); // Using Thread.sleep for demonstration; prefer WebDriverWait in real scenarios

        // Login process
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("system@ascend.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("eod777");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        System.out.println("Login Success");
        String otp = "786786";
	   
	    Thread.sleep(5000);
        // Navigate to Forms and Self Assessment form
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Forms']"))).click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class,'menu-item text-truncate')][normalize-space()='Pharmacies Self Assessment - Medicine Availability']"))).click();
        Thread.sleep(5000);

        // Click Add new form
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='Add New Form']"))).click();
        Thread.sleep(8000);
        System.out.println("Clicked Add New Form");
     // Fill in Region
        WebElement regionDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.react-select.css-b62m3t-container")));
        regionDropdown.click();
        Thread.sleep(2000);

        // Input the value and press Enter to select it
        WebElement dropdownInput = driver.findElement(By.cssSelector("div.select__input-container input.select__input"));
        dropdownInput.sendKeys("QASSIM");
        Thread.sleep(1000); // Adjust timing as needed
        dropdownInput.sendKeys(Keys.ENTER);

        System.out.println("Selected Region: QASSIM");

        // Wait for the site dropdown to be clickable
        WebElement siteDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]")));
        siteDropdown.click();
        Thread.sleep(5000);
        System.out.println("Second Dropdown Clicked");

        WebElement DropdownSelection = wait.until(ExpectedConditions.elementToBeClickable( By.xpath("//div[@id='react-select-5-option-1' and contains(@class, 'select__option')]")));
        DropdownSelection.click();
        
        driver.findElement(By.xpath("(//input[@placeholder='City'])[1]")).sendKeys("Lahore");
        driver.findElement(By.xpath("(//input[@placeholder='Street name'])[1]")).sendKeys("E7");
        driver.findElement(By.xpath("(//input[@placeholder='District Name'])[1]")).sendKeys("Lahorei");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[normalize-space()='Get Location'])[1]")).click();
        Thread.sleep(2000);

        System.out.println("EOD");
        // Logging test completion
        test.log(Status.INFO, "Test completed successfully");
        // Ending the test and closing the WebDriver
        driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-10-option-4"))).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//div[@class='select__control select__control--is-focused select__control--menu-is-open css-1pahdxg-control']//div[@class='select__input-container css-ackcql']")).click();
        driver.findElement(By.xpath("//div[@id='general_medicine']//input[@value='Yes']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Comments']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@placeholder='Enter Quantity']")).sendKeys("12");
        driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
        
       //respiratory medicine
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='select__value-container css-1d8n9bt']//div[@class='select__input-container css-ackcql']")).click();
        Thread.sleep(4000);
        WebElement DropdownIssue = wait.until(ExpectedConditions.elementToBeClickable( By.xpath("//div[@id='react-select-11-option-4' and contains(@class, 'select__option')]")));
        DropdownIssue.click();
        Thread.sleep(4000);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='respiratory_medicine']//input[@value='Yes']")).click();
        driver.findElement(By.xpath("//div[@id='respiratory_medicine']//input[@placeholder='Comments']")).sendKeys("test");
        driver.findElement(By.xpath("//div[@id='respiratory_medicine']//input[@placeholder='Enter Quantity']")).sendKeys("12");
        driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
        // additional remarks
        driver.findElement(By.xpath("//input[@placeholder='john doe']")).sendKeys("test");
        driver.findElement(By.xpath("//div[@class='card-body']//canvas")).click();
        //Delegated Person
        driver.findElement(By.xpath("//input[@placeholder='Delegated Person']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@placeholder='Id Number']")).sendKeys("456");
        //scroll
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Id Number']")));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    
	    
	    
	    // Locate the calendar input field using its class name or another selector
        WebElement calendarField = driver.findElement(By.xpath("//input[@class='form-control flatpickr-input' and @placeholdertext='Select Date in Hijri']"));

        // Use JavaScript to click on the calendar input field
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", calendarField);
        
        
		System.out.println("Date Row clicked");
		
		Thread.sleep(2000);
		
		
		WebElement dateElement = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[1]/span[25]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", dateElement);
		System.out.println("Date Entered");
        
        
        
        
        
        
        driver.findElement(By.xpath("//input[@placeholder='Issue Place']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@placeholder='Position']")).sendKeys("test");
        //Sign 2
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[8]/div[1]/canvas[1]")).click();
        //Click review
        driver.findElement(By.xpath("//span[normalize-space()='Review']")).click();
        driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();


    


     
    }
}
