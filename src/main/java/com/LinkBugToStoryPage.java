package com;

import com.pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testframework.DriverManager;

public class LinkBugToStoryPage extends MainPage {

    Actions actions = new Actions(DriverManager.getDriver().getWebDriver());

    private final By backlogBtn = By.xpath("//span[@class='css-178ag6o' and text()='Go to Backlog']");
    private final By bugLink = By.xpath("//div[@class='_19itglyw _vchhusvi _r06hglyw _1reo15vq _18m915vq _1bto1l2s' and text()='Successfully login with valid credentials ']");
    private final By actionsMenu = By.xpath("//div[@class='_1e0c1txw _vchhusvi _gy1pu2gc _1p57u2gc _4cvrv2br _2lx2vrvc _1bahh9n0']//div[@class='_1bumglyw _sedtglyw']");
    private final By commandPaletteBtn = By.xpath("//span[text()='Open command palette']");
    private final By linkOrUnlinkBtn = By.xpath("//div[text()='Link or unlink work items']");
    private final By isBlockedBy = By.xpath("//div[text()='is blocked by']");
    private final By createdStory = By.xpath("//span[text()='Automate login test cases so that authentication is validated']");
    private final By assertText = By.xpath("//span[@class='css-c0canv' and text()='Connected work items']");


    public LinkBugToStoryPage() {
        super("");
    }

    public void clickGoToBacklogButton() throws InterruptedException {
        WebElement backlogButton = driverWait().until(ExpectedConditions.visibilityOfElementLocated(backlogBtn));
        Thread.sleep(1200);
        backlogButton.click();
    }

    public void clickBugLink() {
        WebElement bugLinkButton = driverWait().until(ExpectedConditions.visibilityOfElementLocated(bugLink));
        bugLinkButton.click();
    }

    public void clickActionsMenu() {
        WebElement actionsMenuBtn = driverWait().until(ExpectedConditions.visibilityOfElementLocated(actionsMenu));
        actionsMenuBtn.click();
    }

    public void clickCommandPaletteButton() {
        WebElement commandPalette = driverWait().until(ExpectedConditions.visibilityOfElementLocated(commandPaletteBtn));
        commandPalette.click();
    }

    public void clickLinkOrUnlinkButton() {
        WebElement linkOrUnlink = driverWait().until(ExpectedConditions.visibilityOfElementLocated(linkOrUnlinkBtn));
        linkOrUnlink.click();
    }

    public void clickIsBlockedBy() {
        WebElement isBlockedByBtn = driverWait().until(ExpectedConditions.visibilityOfElementLocated(isBlockedBy));
        isBlockedByBtn.click();
    }

    public void clickOnCreatedStory() {
        WebElement createdStoryBtn = driverWait().until(ExpectedConditions.visibilityOfElementLocated(createdStory));
        createdStoryBtn.click();
    }

    public void clickAsideToCloseTheCommandPaletteDropDownMenu() {
        actions.moveByOffset(0, 0).click().perform();
    }

    public WebElement textIsBlockedBy() {
        return driverWait().until(ExpectedConditions.visibilityOfElementLocated(assertText));
    }
}
