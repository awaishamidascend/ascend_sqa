package test.automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameworkSelenium_Template {
	
	public static void main(String[] args) {


    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
	
     driver.get("www.google.com");
     
}
}