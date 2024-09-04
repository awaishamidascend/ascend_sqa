package test.automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OperationCreate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();


		driver.get("https://nhcc.kakashi.app");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("khadija.yasin@ascend.com.sa");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Alpha@2040");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);

		System.out.println("Opening Organization Selection...");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement orgSelectContainer = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='select__input-container css-19bb58m']")));
		orgSelectContainer.click();
		System.out.println("Organization Selection Opened successfully.");

		// Wait for the dropdown to load
		Thread.sleep(2000);

		// Locate the element by its XPath and click it
		WebElement optionElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='select__option css-10wo9uf-option' and text()='Technical Support']")));
		optionElement.click();
		System.out.println("Clicked on the 'Technical Support' option");

		// Locate the element using XPath and click it
		WebElement continueButton = driver.findElement(By.xpath("//button[contains(@class, 'CustomButton') and text()='Continue']"));
		continueButton.click();

		Thread.sleep(7000);

		//click on Operation center
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(),'Operation Centers')]")).click();
		Thread.sleep(7000);
		System.out.println("Clicked on the operation cenbter");

		//create operation center click
		driver.findElement(By.xpath("(//span[contains(text(),'Create Operation Center')])[1]")).click();
		System.out.println("Clicked on the create operation");

		Thread.sleep(5000);

		//name operation center
		driver.findElement(By.xpath("//input[@id='orgName']")).sendKeys("New");
		Thread.sleep(5000);

		//select show fields

		System.out.println("Opening SHOW FIELDS");

		WebElement dropdownContainer = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]"));

		// Click on the dropdown container to expand it
		dropdownContainer.click();
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", orgSelectContainer1);

		System.out.println("SHOW FIELDS dropdown opened successfully.");

		// Wait for the dropdown to load
		Thread.sleep(2000);

		// Locate the element by its XPath and click it
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]")).click();
		System.out.println("Clicked on the Dropdown Options TEAMS");
	}

}
