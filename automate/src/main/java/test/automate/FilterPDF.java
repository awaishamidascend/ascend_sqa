package test.automate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FilterPDF {
	public static void main(String[] args) throws InterruptedException {

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
	    System.out.println("print login button");
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
	    System.out.println("Login successfully");
	    Thread.sleep(5000);
	    //select form
	    //driver.findElement(By.xpath("")).click();
	    driver.findElement(By.xpath("//span[normalize-space()='Forms']")).click();
	     Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[@class='menu-item text-truncate'][normalize-space()='Pharmacies Self Assessment - Medicine Availability']")).click();
	    Thread.sleep(5000);
	    // apply date filter
	    driver.findElement(By.xpath("//input[@placeholder='Filter Date']")).click();
	    driver.findElement(By.xpath("//span[@aria-label='August 1, 2024']")).click();
	    driver.findElement(By.xpath("//span[@aria-label='August 6, 2024']")).click();
	    //Download pdf
	    driver.findElement(By.xpath("//div[@id='row-0']//div[contains(@class,'cursorPointer')]//*[name()='svg']")).click();
	    //search
	    driver.findElement(By.xpath("//input[contains(@placeholder,'Search in the list')]")).sendKeys("system user");
	    //single excel
	    driver.findElement(By.xpath("//div[@id='row-0']//div[@id='cell-8-undefined']//div//figure//*[name()='svg']")).click();
	    //submissions excel
	    driver.findElement(By.xpath("//span[@class='mt-1']//figure//*[name()='svg']//*[name()='path' and contains(@d,'M19.1723 2')]")).click();
	    
	    System.out.println("testcase run successfully");



}}
