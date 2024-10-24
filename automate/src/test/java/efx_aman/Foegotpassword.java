package efx_aman;
import WebDriver.webdriverSetup;
import com.google.gson.Gson;
import efx_projects.projectsPOM;
import efx_projects.projectsVO;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;


    public class Foegotpassword {

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
            return jaon.setUpData();  // Call the setUpData method from the jaon class
        }


        @ParameterizedTest(name = "{0}")
        @MethodSource("setUpData")
        public void testLoginAndLogout(AmanVO obj_reporterVO) throws InterruptedException {
            System.out.println("Executing test with user: " + obj_reporterVO.getUsername());

            // Perform forgot password flow

            loginPOM.forgot();
            Thread.sleep(2000);
            loginPOM.forgotemail();
            Thread.sleep(2000);
            loginPOM.forgotemailsendbutton();
            Thread.sleep(2000);





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










