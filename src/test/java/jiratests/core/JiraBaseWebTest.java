package jiratests.core;

import com.CreateBugPage;
import com.CreateStoryPage;
import com.LinkBugToStoryPage;
import com.pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import testframework.DriverManager;
import testframework.core.BaseWebTest;

public class JiraBaseWebTest extends BaseWebTest {

    protected LoginPage loginPage;
    protected CreateBugPage createBugPage;
    protected CreateStoryPage createStoryPage;
    protected LinkBugToStoryPage linkBugToStoryPage;

    @BeforeEach
    public void beforeTests() {
        // perform some code before each test starts

        loginPage = new LoginPage();
        createStoryPage = new CreateStoryPage();
        createBugPage = new CreateBugPage();
        linkBugToStoryPage = new LinkBugToStoryPage();
    }

    // close driver
    @AfterEach
    public void afterTest() {
        DriverManager.quitDriver();
    }

    // Extract methods that use multiple pages
    public void authenticateWithUser(String username, String pass) {
        loginPage.loginIntoJiraAccount(username, pass);

    }
}
