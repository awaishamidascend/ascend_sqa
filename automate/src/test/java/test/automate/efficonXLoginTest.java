package test.automate;

import WebDriver.webdriverSetup;
import com.google.gson.Gson;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class efficonXLoginTest {

    private static webdriverSetup setupClass;

    @BeforeAll
    public static void setUpClass() throws InterruptedException {
        // Initialize WebDriver once before all tests
        System.out.println("BeforeAll: Initializing WebDriver");
        setupClass = webdriverSetup.getInstance(); // Correct way to get the instance
        setupClass.webdriverSetup(); // This should be renamed to a proper initialization method
        setupClass.loadBaseUrl(); // Load the base URL
    }

    public static Stream<efficonXLoginVO> setUpData() {
        // Read credentials from JSON file using Gson
        Gson gson = new Gson();
        try (FileReader reader = new FileReader("jsons/Users/Users.json")) {
            // Deserialize into efficonXLoginVO wrapper
            efficonXLoginVO wrapper = gson.fromJson(reader, efficonXLoginVO.class);
            // Return the stream of users
            return wrapper.getUsers().stream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Stream.empty();
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("setUpData")
    public void testLoginAndLogout(efficonXLoginVO obj_efficonXVO) throws InterruptedException {
        System.out.println("Executing test with user: " + obj_efficonXVO.getUsername());

        // Perform login
        efficonXLoginPOM.username(obj_efficonXVO.getUsername());
        efficonXLoginPOM.password(obj_efficonXVO.getPassword());
        Thread.sleep(3000); // Consider using explicit waits instead of sleep
        efficonXLoginPOM.submit();

        // Wait for a while (again, consider using explicit waits)
        Thread.sleep(10000);

        // Perform logout
        efficonXLoginPOM.options();
        efficonXLoginPOM.logout();

        // Wait before finishing the test
        Thread.sleep(5000);
    }

    @AfterAll
    public static void tearDown() {
        // Quit the driver after all tests
        System.out.println("AfterAll: Quitting WebDriver");
        if (setupClass != null) {
            setupClass.quitDriver();
        }
    }
}
