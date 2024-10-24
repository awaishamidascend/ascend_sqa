package efx_aman;

import WebDriver.webdriverSetup;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class loginTest {



    private static webdriverSetup setupClass;

    @BeforeAll
    public static void setUpClass() throws InterruptedException {
        // Initialize WebDriver once before all tests
        System.out.println("BeforeAll: Initializing WebDriver");
        setupClass = webdriverSetup.getInstance();
        setupClass.webdriverSetup();
        setupClass.loadBaseUrl();
    }

    // Method source to provide user data from the jaon class
    public static Stream<AmanVO> setUpData() {
        return json.setUpData();  // Call the setUpData method from the jaon class
    }


    @ParameterizedTest(name = "{0}")
    @MethodSource("setUpData")
    public void testLoginAndLogout(AmanVO obj_reporterVO) throws InterruptedException {
        System.out.println("Executing test with user: " + obj_reporterVO.getUsername());

        // Perform login
        AmanPOM.username(obj_reporterVO.getUsername());
        AmanPOM.password(obj_reporterVO.getPassword());
        Thread.sleep(3000);
        AmanPOM.submit();

        Thread.sleep(5000);


        AmanPOM.profile();
        Thread.sleep(2000);
        AmanPOM.logout();

        // Wait for a while
        Thread.sleep(10000);

        AmanPOM.Secondurl();
        Thread.sleep(10000);


    }

    @AfterAll
    public static void tearDown() {
        // Quit the driver after each test
        System.out.println("AfterEach: Quitting WebDriver");
        if (setupClass != null) {
            setupClass.quitDriver();
        }
    }
}

