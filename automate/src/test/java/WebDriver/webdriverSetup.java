package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

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

    // Initialize the WebDriver with a headless flag
    public void webdriverSetup() {
        try {
            System.out.println("Setting up WebDriver...");
            String fireFoxDriverPath = "src/test/resources/drivers/geckodriver.exe";
            System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);

            // Configure FirefoxOptions with the headless option
            FirefoxOptions options = new FirefoxOptions();
            boolean headless = false;
            if (headless) {
                options.setHeadless(true);  // Enable headless mode
                System.out.println("Running in headless mode");
            } else {
                System.out.println("Running in non-headless mode");
            }

            driver = new FirefoxDriver(options);  // Pass options to FirefoxDriver
            System.out.println("WebDriver initialized: " + (driver != null));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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

    public void quitDriver() {
        if (driver != null) {
            System.out.println("Quitting WebDriver...");
            driver.quit();
            driver = null; // Reset driver to null after quitting
        }
    }
}