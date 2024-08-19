package test.automate;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
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

import freemarker.core.ParseException;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

public class create_user_json {

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

        // Open the web application and wait until the email field is visible
        driver.get("https://efficax-obligation.ascend.com.sa/login?isQA=true");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait for the email input field to be visible and then proceed with the login
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Email']")));
        emailField.sendKeys("username");

        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordField.sendKeys("password");

        WebElement submitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
        submitButton.click();

        System.out.println("Login Success");

        // Click on the OTP login button (if needed)
        // driver.findElement(By.xpath("//button[@type='submit']")).click();
        // System.out.println("Login successfully");
        
	    Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Settings')]"))).click();
        System.out.println("Clicked Setting");
        
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Settings')]"))).click();
        System.out.println("Clicked Setting Again");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='menu-item text-truncate'][normalize-space()='Users'])[1]"))).click();
        System.out.println("Users");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("add"))).click();
        System.out.println("Clicked Add button");

        // Making User
     // Wait for the 'Add User' form to be visible and interact with the 'nameMulti' input
        WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='nameMulti'])[1]")));
        nameField.sendKeys("Awais Hamid");

        driver.findElement(By.xpath("//input[@placeholder='email@email.com']")).sendKeys("awais@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("eod777");
        
     // Click the dropdown to reveal the options
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-2-input")));
        dropdown.click();

        // Optional: Add a short sleep to ensure the dropdown options are loaded
        Thread.sleep(2000);

        // Adjusted XPath based on your actual dropdown structure
        WebElement firstOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'select__menu')]//div[contains(@class, 'select__option')][1]")));
        firstOption.click();
        
        WebElement phoneField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputmask")));
        phoneField.clear();  // Clear any existing text
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('inputmask').value='6564646';");


    }

public void readWriteJSON() throws InterruptedException, IOException, ParseException, org.json.simple.parser.ParseException {
JSONParser jsonParser = new JSONParser();
try  {
FileReader reader = new FileReader("new_user.json");
//Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONArray usersList = (JSONArray) obj;
            System.out.println(usersList); //This prints the entire json file
            for(int i=0;i<usersList.size();i++) {
            JSONObject users = (JSONObject) usersList.get(i);
            System.out.println(users);//This prints every block - one json object
            JSONObject user = (JSONObject) users.get("users");
            System.out.println(user); //This prints each data in the block
            String username = (String) user.get("username");
            String password = (String) user.get("password");
            String result = login(username,password);
            user.put("result", result);

            //Write JSON file
                try (FileWriter file = new FileWriter("Testdata1.json")) {
                    file.append(usersList.toJSONString());
                    file.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            System.out.println(user);
             }
         } catch (FileNotFoundException e) {
e.printStackTrace();

         }
}

private String login(String username, String password) {
	// TODO Auto-generated method stub
	return null;
}
}

//        String otp = "786786";
//	    
//	    // Find the OTP input field and enter OTP
//	   for (int i = 0; i < otp.length(); i++) {
//	        char digit = otp.charAt(i);
//	        String digitAsString = Character.toString(digit);
//	        String xpath = "//input[@aria-label='Please enter OTP character " + (i + 1) + "']";
//	        WebElement otpBox = driver.findElement(By.xpath(xpath));
//	        otpBox.sendKeys(digitAsString);
//	    }
	// Click on the OTP login button
	 //   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   // System.out.println("Login successfully");
	    //Thread.sleep(5000);
	