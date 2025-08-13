package jiratests.web;

import jiratests.core.JiraBaseWebTest;
import jiratests.enums.TestData;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import testframework.DriverManager;
import testframework.PropertiesManager;

public class CreateStoryTest extends JiraBaseWebTest {

    @BeforeEach
    public void setUp() {
        DriverManager.getDriver().get(
                PropertiesManager.getConfigProperties().getProperty("projectPageUrl"));

        authenticateWithUser(TestData.JIRA_EMAIL.getValue(),
                TestData.JIRA_PASSWORD.getValue());
    }


    @Test
    public void createStoryInExistingProjectInJira_when_loginWithValidCredentials() throws InterruptedException {

        createStoryPage.clickCreateButton();

        createStoryPage.clickWorkTypeDropDownMenu();

        createStoryPage.selectTypeButton();

        createStoryPage.fillSummaryField("Automate login test cases so that authentication is validated");

        createStoryPage.fillDescriptionField(
                "Automate the login functionality test cases to ensure authentication works correctly across supported browsers and environments.\n" +
                "The automation will cover both positive and negative login scenarios, including valid credentials, invalid credentials, empty fields, and boundary conditions.");

        createStoryPage.clickPriorityDropDownMenu();

        createStoryPage.clickHighPriorityButton();

        createStoryPage.clickCreateBtn();

        createStoryPage.assertStoryIsPresent();

        WebElement storyIsVisible = createStoryPage.storyCreatedAndVisible();
        Assertions.assertEquals("less than a minute ago", storyIsVisible.getText(), "Story is not created successfully!");

//        createStoryPage.deleteStoryAfterCreation();
    }
}
