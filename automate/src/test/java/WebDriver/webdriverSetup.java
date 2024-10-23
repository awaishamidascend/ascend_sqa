package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class webdriverSetup {
    private String baseUrl = "https://dev.efficonx.com";
    protected static WebDriver driver;
    private static webdriverSetup driverManager;

    // Singleton pattern to ensure only one instance of WebDriverSetup exists
    public static synchronized webdriverSetup getInstance() {
        if (driverManager == null) {
            System.out.println("Creating new instance of WebDriverSetup");
            driverManager = new webdriverSetup();
            driverManager.initializeWebDriver(); // Initialize the WebDriver upon instance creation
        }
        return driverManager;
    }

    // Initialize the WebDriver with Firefox or Chrome in headless mode
    private void initializeWebDriver() {
        try {
            System.out.println("Setting up WebDriver...");

            // Detect the operating system
            String os = System.getProperty("os.name").toLowerCase();
            System.out.println("Operating System: " + os);

            // Set the driver path based on the OS
            boolean useFirefox = true; // Set to false if you want to use Chrome

            if (useFirefox) {
                String fireFoxDriverPath;
                if (os.contains("win")) {
                    fireFoxDriverPath = "src/test/resources/drivers/geckodriver.exe"; // Windows path
                } else if (os.contains("nix") || os.contains("nux")) {
                    fireFoxDriverPath = "src/test/resources/drivers/geckodriverlinux"; // Linux path
                } else {
                    throw new IllegalStateException("Unsupported operating system: " + os);
                }

                System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);

                // Initialize Firefox options with headless mode
                FirefoxOptions options = new FirefoxOptions();
                options.addArguments("--headless"); // Enable headless mode

                driver = new FirefoxDriver(options); // Pass the options to FirefoxDriver
                System.out.println("Firefox WebDriver initialized in headless mode: " + (driver != null));
            } else {
                String chromeDriverPath;
                if (os.contains("win")) {
                    chromeDriverPath = "src/test/resources/drivers/chromedriver.exe"; // Windows path
                } else if (os.contains("nix") || os.contains("nux")) {
                    chromeDriverPath = "src/test/resources/drivers/chromedriverlinux"; // Linux path
                } else {
                    throw new IllegalStateException("Unsupported operating system: " + os);
                }

                System.setProperty("webdriver.chrome.driver", chromeDriverPath);

                // Initialize Chrome options with headless mode
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless"); // Enable headless mode

                driver = new ChromeDriver(options); // Pass the options to ChromeDriver
                System.out.println("Chrome WebDriver initialized in headless mode: " + (driver != null));
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to initialize WebDriver: " + e.getMessage());
        }
    }

    // Load the base URL
    public void loadBaseUrl() {
        if (driver != null) {
            System.out.println("Loading base URL: " + baseUrl);
            driver.get(baseUrl);
            driver.manage().window().maximize();
            // Use explicit waits here instead of Thread.sleep()
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
