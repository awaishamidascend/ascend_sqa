package test.automate;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.Capabilities;
import io.appium.java_client.AppiumDriver;

public class Appium {
    static AppiumDriver driver;

    public static void main(String[] args) {
        try {
            openApp(driver);
        } catch (Exception exp) {
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
    }

    public static void openApp(AppiumDriver driver) throws MalformedURLException {
        MutableCapabilities appiumCapabilities = new MutableCapabilities();
        appiumCapabilities.setCapability("deviceName", "Galaxy A23");
        appiumCapabilities.setCapability("udid", "R58T41V260E");
        appiumCapabilities.setCapability("platformName", "Android");
        appiumCapabilities.setCapability("platformVersion", "14");
        appiumCapabilities.setCapability("appPackage", "com.fakeeh");
        appiumCapabilities.setCapability("appActivity", "com.fakeeh.MainActivity");

        MutableCapabilities w3cCapabilities = new MutableCapabilities();
        w3cCapabilities.setCapability("appium:appActivity", "com.fakeeh.MainActivity");
        w3cCapabilities.setCapability("appium:appPackage", "com.fakeeh");
        w3cCapabilities.setCapability("appium:deviceName", "Galaxy A23");
        w3cCapabilities.setCapability("appium:platformVersion", "14");
        w3cCapabilities.setCapability("appium:udid", "R58T41V260E");
        w3cCapabilities.setCapability("appium:platformName", "Android");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver(url, w3cCapabilities);
        System.out.println("App opened successfully");
    }
}
