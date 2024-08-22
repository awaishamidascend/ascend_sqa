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
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

public class create_user_json {

    public static void main(String[] args) throws InterruptedException, IOException, org.json.simple.parser.ParseException {
        // Setting up ExtentReports for logging test execution
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("romeesa.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        ExtentTest test = extent.createTest("UserCreationTest", "Creating users based on JSON data");
        test.log(Status.INFO, "Starting the user creation process");

        // Setting up WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open the web application
        driver.get("https://dev-efficax-obligation.kakashi.app/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Perform login (Its a simple method)
        performLogin(driver, wait);

        // Read credentials from JSON and create users (Its a simple method)
        readAndCreateUsers(driver, wait, test); //Parameterized Method (Sequence, Type, No of parameters shoudl be same)

        // End the test
        extent.flush();
    }

    //Execution stops here (IDE only read till here)
    
    public static void readAndCreateUsers(WebDriver driver, WebDriverWait wait, ExtentTest test) throws InterruptedException, IOException, org.json.simple.parser.ParseException {
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader("C:\\Users\\HamidAwais(Ascend)\\Downloads\\new_user.json")) {
            // Read JSON file
            JSONArray usersList = (JSONArray) jsonParser.parse(reader);

            // Iterate through each user in the JSON array
            for (Object o : usersList) {
                JSONObject users = (JSONObject) o;
                JSONObject user = (JSONObject) users.get("users");
                String username = (String) user.get("username");
                String password = (String) user.get("password");

                // Create user in the application
                String result = createUser(driver, wait, username, password);
                user.put("result", result);

                // Log the result in the Extent Report
                test.log(Status.INFO, "Created user: " + username + " Result: " + result);
            }

            // Write updated JSON data back to file
            try (FileWriter file = new FileWriter("Testdata1.json")) {
                file.write(usersList.toJSONString());
                file.flush();
            }
        }
    }

    private static String createUser(WebDriver driver, WebDriverWait wait, String username, String password) throws InterruptedException {
        try {
            // Navigate to Users section
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Settings')]"))).click();
            Thread.sleep(2000);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Settings')]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='menu-item text-truncate'][normalize-space()='Users'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("add"))).click();

            // Fill in user details
            WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='nameMulti'])[1]")));
            nameField.sendKeys("User: " + username);

            driver.findElement(By.xpath("//input[@placeholder='email@email.com']")).sendKeys(username);
            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);

            // Handle the dropdown and phone number entry
            
            WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'select__control') and contains(@class, 'css-k3ockt-control')]//input[@id='react-select-2-input']")));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", dropdown);
            dropdown.click();
            Thread.sleep(2000);
            System.out.println("Role Clicked");


            WebElement firstOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'select__menu')]//div[contains(@class, 'select__option')][1]")));
            firstOption.click();
            System.out.println("Role Clicked");


            WebElement phoneField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputmask")));
            phoneField.clear(); // Clear any pre-filled value
            phoneField.sendKeys("6564646");

            // Adding a slight delay to let the field settle, if necessary
            Thread.sleep(1000);

            System.out.println("Phone Number Entered successfully");

            WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Submit')]")));

         // Re-set phone number before clicking submit
         WebElement phoneField1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputmask")));
         phoneField1.clear(); // Just in case
         phoneField1.sendKeys("1234567890");

         submit.click();


            Thread.sleep(5000);
            
            // Return success status
            return "Success";
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed";
        }
    }

    private static void performLogin(WebDriver driver, WebDriverWait wait) throws InterruptedException {
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Email']")));
        emailField.sendKeys("system@ascend.com");

        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordField.sendKeys("eod777");

        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        submitButton.click();

        System.out.println("Login Success");
        Thread.sleep(5000); // Wait for login to complete
    }
}
