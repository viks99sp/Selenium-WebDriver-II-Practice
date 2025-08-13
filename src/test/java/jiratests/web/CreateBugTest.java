package jiratests.web;

import jiratests.core.JiraBaseWebTest;
import jiratests.enums.TestData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import testframework.DriverManager;
import testframework.PropertiesManager;

public class CreateBugTest extends JiraBaseWebTest {

    @BeforeEach
    public void setUp() {

        DriverManager.getDriver().get(
                PropertiesManager.getConfigProperties().getProperty("projectPageUrl"));

        authenticateWithUser(TestData.JIRA_EMAIL.getValue(),
                TestData.JIRA_PASSWORD.getValue());
    }


    @Test
    public void createBugInExistingProjectInJira_when_loginWithValidCredentials() throws InterruptedException {
        createBugPage.clickCreateButton();

        createBugPage.clickWorkTypeDropDownMenu();

        createBugPage.selectTypeButton();

        createBugPage.fillSummaryField("Successfully login with valid credentials ");

        createBugPage.fillDescriptionField(
                "1.Launch the application in a supported browser.\n" +
                        "2.Navigate to the Login page.\n" +
                        "3.Enter a valid username in the Username field.\n" +
                        "4.Enter the correct password in the Password field.\n" +
                        "5.Click the Login button.\n" +
                        "6.Wait for the page to load.\n" +
                        "Expected Result: User is successfully logged in and redirected to the home page.\n" +
                        "Actual Result: User was successfully logged in and redirected to the home page.");

        createBugPage.clickPriorityDropDownMenu();

        createBugPage.clickHighPriorityButton();

        createBugPage.clickCreateBtn();

        createBugPage.assertStoryIsPresent();

        WebElement bugIsVisible = createBugPage.storyCreatedAndVisible();
        Assertions.assertEquals("less than a minute ago", bugIsVisible.getText(), "Story is not created successfully!");

//        createBugPage.deleteStoryAfterCreation();
    }
}
