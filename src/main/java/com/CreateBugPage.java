package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateBugPage extends CreateStoryPage {

    private final By bugTypeBtn = By.xpath("//div[@class='_2lx21bp4 _1e0c1txw _1bsb1osq']//div[contains(text(), 'Bug')]");
    private final By workTypeBtn = By.xpath("//div[@class='_1pfhu2gc']//div[@class='_19itglyw _vchhusvi _r06hglyw']");
    private final By dropdownStatus = By.xpath("//div[@data-testid='issue-field-select-base.ui.format-option-label.c-label' and text()='Bug']");


    @Override
    public void selectTypeButton() {
        driverWait().until(ExpectedConditions.elementToBeClickable(bugTypeBtn)).click();
    }
}

