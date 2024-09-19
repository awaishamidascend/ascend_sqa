package test.automate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Test_Forms_Automation {

		

	

		    public static void main(String[] args) throws Throwable {
		        // Set path to ChromeDriver executable
		        System.setProperty("WebDriverManager.chromedriver().setup();", "WebDriver driver = new ChromeDriver();");

		        // Initialize ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the webpage
		        driver.get("https://dev-efficax-obligation.kakashi.app/login");
		        Thread.sleep(10000);
			    
			    // Find and fill in the email and password fields
			    driver.findElement(By.xpath("//input[@placeholder='Email']"))
			          .sendKeys("system@ascend.com");
			    driver.findElement(By.xpath("//input[@placeholder='Password']"))
			          .sendKeys("eod777");
			    
			    // Click on the login button
			    driver.findElement(By.xpath("//button[@type='submit']")).click();
			    
			    // Click on the form button
			     
			    driver.findElement(By.xpath("//body/div[@id='root']/div[contains(@class,'wrapper vertical-layout navbar-sticky footer-static vertical-menu-modern menu-expanded')]/div[contains(@class,'main-menu menu-fixed menu-accordion menu-shadow expanded menu-light')]/div[contains(@class,'scrollbar-container ps')]/ul[contains(@class,'navigation')]/li[6]/a[1]")).click();

		        // Define options for each dropdown
		        String[][] optionsList = {
		            {"Option 1", "Option 2", "Option 3"},
		            {"Sub-option 1", "Sub-option 2", "Sub-option 3"}
		        };

		        // Select consecutive dropdowns
		        for (String[] options : optionsList) {
		            selectDropdown(driver, options);
		        }

		        // Close the browser
		        driver.quit();
		    }

		    public static void selectDropdown(WebDriver driver, String[] options) {
		        // Find the dropdown element
		        WebElement dropdownElement = driver.findElement(By.xpath("//select"));

		        // Create a Select object
		        Select dropdown = new Select(dropdownElement);

		        // Select options from the dropdown
		        for (String option : options) {
		            dropdown.selectByVisibleText(option);
		        }
		    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
