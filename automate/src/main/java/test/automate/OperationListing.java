package test.automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OperationListing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
     
        driver.get("https://nhcc.ascend.com.sa/");
	}

}
