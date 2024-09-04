package test.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.Random;
public class random {
	        // Setup WebDriver (make sure to set the correct path to your WebDriver executable)
	        WebDriver driver = new ChromeDriver();
	        
	        // Navigate to the page
	        //driver.get("https://efficax-obligation.ascend.com.sa/login?isQA=true");

	        // Locate elements to select from (example: list of options in a dropdown)
	        List<WebElement> options = driver.findElements(By.cssSelector("div[class='select__control select__control--is-focused css-1u57jws-control'] div[class='select__input-container css-ackcql']"));

	        // Create a Random object
	        Random random = new Random();

	        // Generate a random index within the range of options list
	        int randomIndex = random.nextInt(options.size());

	        // Select the element at the random index
	        WebElement selectedElement = options.get(randomIndex);
	        //selectedElement.click();

	        // Optional: Print the text of the selected element
	        //system.out.println("Selected element: " + selectedElement.getText());

	        // Close the browser
	        //driver.quit();
	    }
	


