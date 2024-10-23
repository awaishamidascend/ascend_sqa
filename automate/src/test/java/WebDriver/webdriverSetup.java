package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class webdriverSetup {

    public static WebDriver getDriver() {
        WebDriver driver;

        // Retrieve the environment from a system property
        String environment = System.getProperty("ENVIRONMENT", "LOCAL");

        // Define the paths for the different drivers
        String geckoDriverLinuxPath = "src/test/resources/drivers/geckodriverlinux";
        String geckoDriverWindowsPath = "src/test/resources/drivers/geckodriver.exe";

        if ("JENKINS".equalsIgnoreCase(environment)) {
            // Set the Linux Geckodriver and enable headless mode for Jenkins
            System.setProperty("webdriver.gecko.driver", geckoDriverLinuxPath);

            FirefoxOptions options = new FirefoxOptions();
            options.setHeadless(true);  // Run headless in Jenkins

            driver = new FirefoxDriver(options);

        } else {
            // Use non-headless mode and the local Geckodriver for IntelliJ
            System.setProperty("webdriver.gecko.driver", geckoDriverWindowsPath);

            FirefoxOptions options = new FirefoxOptions();
            options.setHeadless(false);  // Run with GUI locally

            driver = new FirefoxDriver(options);
        }

        return driver;
    }
}
