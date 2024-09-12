package efx_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class projectsPOM extends WebDriver.webdriverSetup {

    private static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public static void username(String username) {

        WebElement elem = driver.findElement(By.xpath("(//input[@id='username'])[1]"));
        elem.clear();
        elem.sendKeys(username);
    }

    public static void password(String password) {

        WebElement elem = driver.findElement(By.xpath("(//input[@id='password'])[1]"));
        elem.clear();
        elem.sendKeys(password);
    }

    public static void submit() {

        driver.findElement(By.xpath("(//button[@class='btn'])[1]")).click();
    }

    public static void projects() throws InterruptedException {

        WebElement project = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[normalize-space()='Projects'])[1]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", project);
        project.click();
        System.out.println("Opened Projects");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[normalize-space()='New Project']")).click();
        System.out.println("Opened New Projects");

    }

    public static void create_projects() throws InterruptedException {

        //Entering Name
        WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='name'])[1]")));
        name.sendKeys("Awais Hamid");

        //Entering Code
        WebElement code = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='code'])[1]")));
        code.sendKeys("555");

        //Entering Date
        WebElement date = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='date'])[1]")));
        date.click();
        date.sendKeys("01012024");

        //Entering Client
        WebElement client = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='multiselect__single'])[1]")));
        client.click(); // Click to open the dropdown
        client.sendKeys("MOMRA");
        // Wait for the option to become visible and clickable
        WebElement optionToSelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class, 'multiselect__option') and contains(text(),'MOMRA')]")));
        // Click the option once it's visible
        optionToSelect.click();


    }

}
