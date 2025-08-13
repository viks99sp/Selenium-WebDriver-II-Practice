package jiratests.web;

import jiratests.core.JiraBaseWebTest;
import jiratests.enums.TestData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import testframework.DriverManager;
import testframework.PropertiesManager;

public class LinkBugToStoryTest extends JiraBaseWebTest {

    @BeforeEach
    public void setUp() {

        DriverManager.getDriver().get(
                PropertiesManager.getConfigProperties().getProperty("projectPageUrl"));

        authenticateWithUser(TestData.JIRA_EMAIL.getValue(),
                TestData.JIRA_PASSWORD.getValue());
    }


    @Test
    public void successfullyLinkBugToStory_when_loginWithValidCredentials() throws InterruptedException {

        linkBugToStoryPage.clickGoToBacklogButton();

        linkBugToStoryPage.clickBugLink();

        linkBugToStoryPage.clickActionsMenu();

        linkBugToStoryPage.clickCommandPaletteButton();

        linkBugToStoryPage.clickLinkOrUnlinkButton();

        linkBugToStoryPage.clickIsBlockedBy();

        linkBugToStoryPage.clickOnCreatedStory();

        linkBugToStoryPage.clickAsideToCloseTheCommandPaletteDropDownMenu();

        WebElement text = linkBugToStoryPage.textIsBlockedBy();
        Assertions.assertEquals("Connected work items", text.getText(), "The Bug is not linked to the Story!");
    }
}

