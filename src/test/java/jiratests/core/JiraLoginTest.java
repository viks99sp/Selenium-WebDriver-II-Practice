package jiratests.core;

import jiratests.enums.TestData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class JiraLoginTest extends JiraBaseWebTest {


    @Test
    public void successfulLoginInJiraAccount_when_validCredentials() throws InterruptedException {

        loginPage.navigate();

        authenticateWithUser(TestData.JIRA_EMAIL.getValue(),
                TestData.JIRA_PASSWORD.getValue());

       WebElement jiraIcon = loginPage.successfulNavigated();
       Assertions.assertTrue(jiraIcon.isDisplayed(), "You are not logged in!");
    }
}
