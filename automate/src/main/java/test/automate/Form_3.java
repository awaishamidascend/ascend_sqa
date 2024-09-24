package test.automate;
import java.time.Duration;
import java.util.List;
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

public class Form_3{

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
		driver.get("https://dev-efficax-obligation.kakashi.app/login?isQA=true");
		Thread.sleep(10000); // Using Thread.sleep for demonstration; prefer WebDriverWait in real scenarios

		// Login process
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("system@ascend.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("eod777");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		System.out.println("Login Success");
		@SuppressWarnings("unused")
		String otp = "786786";

		Thread.sleep(5000);
		// Navigate to Forms and Self Assessment form
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Forms']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Forms']"))).click();

		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'العيادات المتنقلة الكبيرة')]"))).click();
		Thread.sleep(10000);

		// Click Add new form
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[normalize-space()='Create']"))).click();
		Thread.sleep(10000);
		System.out.println("Clicked Add New Form");


		// Fill in Region
		// Find the dropdown element
		WebElement dropdown = driver.findElement(By.xpath("(//input[@id='rc_select_0'])[1]")); // Click the dropdown to open it
		dropdown.click();
		Thread.sleep(3000);

		// Select the item "HAFAR"
		WebElement hafarOption = driver.findElement(By.xpath("//div[@title='HAFAR']")); hafarOption.click();

		Thread.sleep(5000);

		//cluster 
		driver.findElement(By.xpath("//input[@id='rc_select_1']")).click();

		// Wait for the site dropdown to be clickable
		WebElement siteDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")));
		siteDropdown.click();

		Thread.sleep(5000);

		System.out.println("Second Dropdown Clicked");

		// Locate the dropdown element
		//WebElement dropdown1 = driver.findElement(By.xpath("//input[@id='rc_select_1']"));

		// Click to open the dropdown if needed
		// dropdown1.click();
		//  Thread.sleep(5000);
		// Select the option using sendKeys
		//dropdown1.sendKeys("Hafar Health Cluster");
		//WebElement hafarhealthclusterOption = driver.findElement(By.xpath("//div[@name='Hafar Health Cluster' and @class='ant-select-item ant-select-item-option' and @title='Hafar Health Cluster']"
		//	)); hafarhealthclusterOption.click();

		// site

		WebElement dropdown1 = driver.findElement(By.xpath("//input[@id='rc_select_2']"));
		dropdown1.click();
		Thread.sleep(5000);

		
		System.out.println("Site Dropdown Clicked");

		Thread.sleep(5000);

		// Locate the dropdown option
		WebElement dropdownOption = driver.findElement(By.xpath("//div[@title='3610102004910001 - Medical skin care clinic - عيادة رعاية الجلد الطبية']"));

		// Click the dropdown option using JavaScript Executor
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", dropdownOption);

		System.out.println("Site Selected");
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

		// Locate the parent container of the labels
		WebElement parentContainer = driver.findElement(By.xpath("//div[contains(@class, 'ant-formily-layout ant-form-vertical')]"));

		// Find all label elements within the parent container
		List<WebElement> labels = parentContainer.findElements(By.xpath(".//label"));

		// Iterate over the list of labels and select the "Comply" option for each question
		for (WebElement label : labels) {
			String labelText = label.getText();

			// Check if the label contains 'Comply', 'Not Comply', or 'N/A' and skip these labels
			if (!(labelText.contains("Comply") || labelText.contains("Not Comply") || labelText.contains("N/A"))) {
				System.out.println("Question: " + labelText);

				// Locate the corresponding "Comply" radio button for this question
				// Assuming the "Comply" radio button is the next sibling of the label
				WebElement complyOption = label.findElement(By.xpath(".//following::input[@value='Comply'][1]"));
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0, arguments[0].getBoundingClientRect().top + window.pageYOffset - (window.innerHeight / 2 - arguments[0].offsetHeight / 2));",complyOption);
				Thread.sleep(2000);

				// Click the "Comply" option
				complyOption.click();
				System.out.println("Selected 'Comply' for: " + labelText);
			}
		}

		// Next step
		driver.findElement(By.xpath("//span[normalize-space()='Next step']")).click();

		//Is the department available?

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Is the department available?']")));

		driver.findElement(By.xpath("//input[contains(@value,'Yes')]")).click();

		// Locate the parent container of the labels
		WebElement parentContainer1 = driver.findElement(By.xpath("//div[contains(@class, 'ant-formily-layout ant-form-vertical')]"));

		// Find all label elements within the parent container
		List<WebElement> labels1 = parentContainer1.findElements(By.xpath(".//label"));

		// Iterate over the list of labels and select the "Comply" option for each question
		for (WebElement label : labels1) {
			String labelText = label.getText();

			// Check if the label contains 'Comply', 'Not Comply', or 'N/A' and skip these labels
			if (!(labelText.contains("Comply") || labelText.contains("Not Comply") || labelText.contains("N/A"))) {
				System.out.println("Question: " + labelText);

				// Locate the corresponding "Comply" radio button for this question
				// Assuming the "Comply" radio button is the next sibling of the label
				WebElement complyOption = label.findElement(By.xpath(".//following::input[@value='Comply'][1]"));
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0, arguments[0].getBoundingClientRect().top + window.pageYOffset - (window.innerHeight / 2 - arguments[0].offsetHeight / 2));",complyOption);
				Thread.sleep(2000);

				// Click the "Comply" option
				complyOption.click();
				System.out.println("Selected 'Comply' for: " + labelText);
			}
		}

		// Next step
		driver.findElement(By.xpath("//span[normalize-space()='Next step']")).click();


		//Step 4

		JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
		jsExecutor1.executeScript("window.scrollTo(0, 0);");
		Thread.sleep(2000);

		System.out.println("Scrolled to Top");

		
		//note
		driver.findElement(By.xpath("//textarea[@class='ant-input css-14mobv6']")).sendKeys("test");
		//scroll

		WebElement element11 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]/input[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element11);


		//Delegated Person Information
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/input[1]")).sendKeys("test");

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]/input[1]")).sendKeys("852111");

		//issue date

		WebElement scrolling1 = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//input[contains(@class, 'date-picker-input') and contains(@placeholder, 'Select date')]"))));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrolling1);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[contains(@class, 'date-picker-input') and contains(@placeholder, 'Select date')]")).click();
		//scroll 2
		WebElement element111 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[5]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/canvas[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element111);

		//issue place
		driver.findElement(By.xpath("//span[@class='ant-input-affix-wrapper ant-input-affix-wrapper-focused css-14mobv6']//input[@type='text']")).sendKeys("test");
		driver.findElement(By.xpath("//span[@class='ant-input-affix-wrapper ant-input-affix-wrapper-focused css-14mobv6']//input[@type='text']")).sendKeys("test");

		//signature
		driver.findElement(By.xpath("//div[@class='signature-wrapper']//canvas")).click();

		// submit form

		driver.findElement(By.xpath("//button[@class='ant-btn css-14mobv6 ant-btn-primary submitButton']")).click();

	}

}


