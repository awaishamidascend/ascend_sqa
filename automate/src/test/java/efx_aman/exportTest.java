package efx_aman;
import WebDriver.webdriverSetup;
import com.google.gson.Gson;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;
public class exportTest {

        private static webdriverSetup setupClass;

        @BeforeAll
        public static void setUpClass() throws InterruptedException {
            // Initialize WebDriver once before all tests
            System.out.println("BeforeAll: Initializing WebDriver");
            setupClass = webdriverSetup.getInstance();
            setupClass.webdriverSetup();
            setupClass.loadBaseUrl();
        }

        public static Stream<AmanVO> setUpData() {

            // Read credentials from JSON file using Gson
            Gson gson = new Gson();
            try (FileReader reader = new FileReader("jsons/Users/Aman_Users1.json")) {
                // Deserialize into UsersWrapper
                AmanVO wrapper = gson.fromJson(reader, AmanVO.class);
                // Return the stream of users
                return wrapper.getUsers().stream();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return Stream.empty();
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

            Thread.sleep(10000);

            loginPOM.FORM();
            Thread.sleep(2000);

            loginPOM.الصيدليات();
            Thread.sleep(2000);

            loginPOM.export();
            Thread.sleep(2000);

            loginPOM.pdf();
            Thread.sleep(10000);

            loginPOM.profile();
            Thread.sleep(2000);
            loginPOM.logout();
            // Wait for a while
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




