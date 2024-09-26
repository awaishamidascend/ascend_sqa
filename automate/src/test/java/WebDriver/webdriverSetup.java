package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class webdriverSetup {
    private String baseUrl = "https://dev.efficonx.com";
    protected static WebDriver driver;
    private static webdriverSetup driverManager;

    // Singleton pattern to ensure only one instance of webdriverSetup exists
    public static webdriverSetup getInstance() {
        if (driverManager == null) {
            System.out.println("Creating new instance of webdriverSetup");
            driverManager = new webdriverSetup();
        }
        return driverManager;
    }

    // Initialize the WebDriver with platform detection
    public void webdriverSetup() {
        try {
            System.out.println("Setting up WebDriver...");

            // Detect OS and set the appropriate WebDriver path
            String os = System.getProperty("os.name").toLowerCase();
            String fireFoxDriverPath;

            if (os.contains("win")) {
                // Windows path
                fireFoxDriverPath = "src/test/resources/drivers/geckodriver.exe";
            } else {
                // Linux/Mac path
                fireFoxDriverPath = "src/test/resources/drivers/geckodriver";
            }

            System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);

            // Initialize the FirefoxDriver
            driver = new FirefoxDriver();
            System.out.println("WebDriver initialized: " + (driver != null));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Load the base URL
    public void loadBaseUrl() throws InterruptedException {
        if (driver != null) {
            System.out.println("Loading base URL: " + baseUrl);
            driver.get(baseUrl);
            driver.manage().window().maximize();
            Thread.sleep(3000);
        } else {
            throw new IllegalStateException("WebDriver is not initialized. Please initialize the WebDriver before calling loadBaseUrl().");
        }
    }

    // Quit the WebDriver
    public void quitDriver() {
        if (driver != null) {
            System.out.println("Quitting WebDriver...");
            driver.quit();
            driver = null; // Reset driver to null after quitting
        }
    }
}
