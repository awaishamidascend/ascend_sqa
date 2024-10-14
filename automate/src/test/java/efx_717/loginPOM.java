package efx_717;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class loginPOM extends WebDriver.webdriverSetup {

        public static void username(String username) {

            WebElement elem = driver.findElement(By.xpath("//input[@placeholder='Email']"));
            elem.clear();
            elem.sendKeys(username);
        }

        public static void password(String password) {

            WebElement elem = driver.findElement(By.xpath("//input[@placeholder='Password']"));
            elem.clear();
            elem.sendKeys(password);
        }

        public static void submit() {

            driver.findElement(By.xpath("//button[@type='submit']")).click();
        }

        public static void OTP (String otp) {
            System.out.println("Umairrrrrr");
                String otp1 = "otp";
                // Find the OTP input field
                //WebElement otpInput = driver.findElement(By.xpath("//input[@aria-label='Please enter OTP character 1']"));
                // Loop through each digit of the OTP and enter it into the input field
                for (int i = 0; i < otp.length(); i++) {
                    char digit = otp.charAt(i);
                    String digitAsString = Character.toString(digit);
                    // Construct XPath for locating each box of the OTP input field
                    String xpath = "//input[@aria-label='Please enter OTP character " + (i + 1) + "']";
                    WebElement otpBox = driver.findElement(By.xpath(xpath));
                    otpBox.sendKeys(digitAsString);
                }
            }
        public static void SubmitOTP () {
                driver.findElement(By.xpath("//button[@type='submit']")).click();
            }
        }