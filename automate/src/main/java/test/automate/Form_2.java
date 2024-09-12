package test.automate;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class Form_2 {

	public static void main(String[] args) throws InterruptedException, TimeoutException {

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
		driver.get("https://efficax-obligation.ascend.com.sa/login?isQA=true");
		Thread.sleep(10000); // Using Thread.sleep for demonstration; prefer WebDriverWait in real scenarios

		// Login process
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("awais.hamid@ascend.com.sa");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("eod777");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		System.out.println("Login Success");
		String otp = "786786";

		Thread.sleep(7000);
		// Navigate to Forms and Self Assessment form
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Forms']"))).click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Forms']"))).click();

		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'المركز الصحي المناوب')]"))).click();
		Thread.sleep(5000);

		// Clicking Add new form
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='Create']"))).click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='Create']"))).click();

		Thread.sleep(5000);
		System.out.println("Clicked Add New Form");


		//Clicking "Region" dropdown 
		WebElement dropdown = driver.findElement(By.xpath("(//input[@id='rc_select_0'])[1]")); // Click the dropdown to open it
		dropdown.click();

		//Clicking item in "Region" dropdown 
		WebElement hafarOption = driver.findElement(By.xpath("//div[@title='HAFAR']")); hafarOption.click();

		Thread.sleep(5000);


		//Clicking "Cluster" dropdown 
		driver.findElement(By.xpath("//input[@id='rc_select_1']")).click();
		Thread.sleep(3000);

		//Clicking items in "Cluster" dropdown
		WebElement siteDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(),'Hafar Health Cluster')])[1]")));
		//siteDropdown.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", siteDropdown);

		Thread.sleep(5000);
		System.out.println("Second Dropdown Clicked");



		//Clicking "Site" dropdown
		driver.findElement(By.xpath("//input[@id='rc_select_2']")).click();
		System.out.println("third Dropdown Clicked");

		Thread.sleep(5000);

		//Clicking items in "Site" dropdown
		WebElement element = driver.findElement(By.xpath("//div[@class='ant-select-item-option-content' and text()='N/A - السليمانية']"));

		// Perform the click action
		element.click();
		Thread.sleep(5000);

		//City name
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/input[1]")).sendKeys("test");

		//Get location
		driver.findElement(By.xpath("//p[normalize-space()='Get Location']")).click();
		//reason for visit  
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/span[1]/input[1]")).sendKeys("test");
		//Is the Institution available on the ground?

		driver.findElement(By.xpath("//input[@value='Yes']")).click();

		//The name of the owner of the company
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/input[1]")).sendKeys("test");

		//The full name of the institution
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]/input[1]")).sendKeys("test");

		//scroll
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[3]/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);


		//Institution email
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[3]/div[2]/div[2]/div[1]/div[1]/span[1]/input[1]")).sendKeys("test@gmail.com");

		//Facility license number
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[3]/div[3]/div[2]/div[1]/div[1]/span[1]/input[1]")).sendKeys("123456");

		//scroll1
		WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ant-card ant-card-bordered ant-card-small ant-card-type-default dn-signature css-14mobv6']//div[@class='ant-card-body']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
		//date
		System.out.println("Clicking on 1st Date Element");

		WebElement scrolling = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//input[contains(@class, 'date-picker-input') and contains(@placeholder, 'Select date')]"))));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrolling);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[contains(@class, 'date-picker-input') and contains(@placeholder, 'Select date')]")).click();

		System.out.println("Clicking on 2nd Date Element");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[3]/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(3000);
		System.out.println("Clicking on exact Date");

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[3]/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[4]/span[1]")).click();
		//signature
		driver.findElement(By.xpath("//div[@class='signature-wrapper']//canvas")).click();

		//next button
		driver.findElement(By.xpath("//span[normalize-space()='Next step']")).click();
		//next button
		driver.findElement(By.xpath("//span[normalize-space()='Next step']")).click();

		//Is the department available?

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Is the department available?']")));

		driver.findElement(By.xpath("//input[contains(@value,'Yes')]")).click();

		// Check if element is present using JavaScript
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Boolean isElementPresent = (Boolean) js.executeScript("return document.evaluate(\"//span[contains(text(), '1')]\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue != null;");
		System.out.println("Element found: " + isElementPresent);

		// Explicit wait for the element to be visible
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement questionElement = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), '1')]")));

		// Click the corresponding "Comply" option
		WebElement complyOption = driver.findElement(By.xpath("//span[contains(text(), '1')]/following::label[.//span[text()='Comply']]/input[@type='radio']"));
		complyOption.click();



	}

}
