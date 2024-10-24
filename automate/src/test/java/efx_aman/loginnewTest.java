package efx_aman;

import WebDriver.webdriverSetup;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class loginnewTest {

    private static webdriverSetup setupClass;
    //private static LoginHelper loginHelper;
    private static loginPOM loginPOM;


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
        loginPOM.username(obj_reporterVO.getUsername());
        loginPOM.password(obj_reporterVO.getPassword());
        Thread.sleep(3000);
        loginPOM.submit();
    }
}
