package com;

import com.pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class
CreateStoryPage extends MainPage {

    private final By createBtn = By.xpath("//button[@class='_mizu194a _1ah31bk5 _ra3xnqa1 _128m1bk5 _1cvmnqa1 _4davt94y _19itglyw _vchhusvi _r06hglyw _80omtlke _2rkosqtm _11c82smr _v5649dqc _189eidpf _1rjc12x7 _1e0c116y _1bsb1wug _p12f1osq _kqswh2mm _4cvr1q9y _1bah1h6o _gy1p1b66 _1o9zidpf _4t3iviql _k48p1wq8 _y4tiutpp _bozgu2gc _y3gn1h6o _s7n4nkob _14mj1kw7 _9v7aze3t _1tv3nqa1 _39yqe4h9 _11fnglyw _18postnw _bfhkomb0 _syaz15cr _105315cr _f8pj15cr _30l315cr _9h8h15cr _irr31wqm _1di617hq _4bfu18uv _1hmsglyw _ajmmnqa1 _1a3b18uv _4fprglyw _5goinqa1 _9oik18uv _1bnxglyw _jf4cnqa1 _1nrm18uv _c2waglyw _1iohnqa1']//span[contains(text(), 'Create')]");
    private final By workTypeBtn = By.xpath("//div[@class='_1pfhu2gc']//div[@class='_19itglyw _vchhusvi _r06hglyw']");
    private final By storyTypeBtn = By.xpath("//div[@class='_2lx21bp4 _1e0c1txw _1bsb1osq']/div[contains(text(), 'Story')]");
    private final By summaryField = By.xpath("//input[@id='summary-field']");
    private final By descriptionField = By.xpath("//div[@class='css-sox1a6']//div[@class='ProseMirror ua-chrome']");
    private final By priorityBtn = By.xpath("//div[@id='priority-container']//div[@class='_12ji1r31 _1qu2glyw _12y3idpf _2rkosqtm _v564r5cv _1h6d1elr _1dqonqa1 _189ee4h9 _4cvr1h6o _80om73ad _1e0c1txw _1n261g80 _1bah1yb4 _kqswh2mm _bfhk1j9a _1tke1ylp _ca0qze3t _u5f3ze3t _n3tdze3t _19bvze3t _15peftgi _1ke8ftgi _jaboglyw _1u6l1bml _4cvx1elr _123b1h4p _d0altlke _irr31d5g _1oglgxqn -control']");
    private final By highPriorityBtn = By.xpath("//div[@data-testid='issue-field-select-base.ui.format-option-label.c-label' and text()='High']");
    private final By createButton = By.xpath("//span[@class='css-178ag6o' and text()='Create']");
    private final By summaryBtn = By.xpath("//span[contains(text(), 'Summary')]");
    private final By storyIsVisible = By.xpath("//p[contains(text(), 'less than a minute ago')]");
    private final By linkToStory = By.xpath("//span[@data-testid='icon-position-wrapper']");
    private final By actionsBtn = By.xpath("//button[@data-testid='issue-meatball-menu.ui.dropdown-trigger.button']");
    private final By deleteBtn = By.xpath("//span[contains(text(), 'Delete')]");
    private final By deleteField = By.xpath("//input[@id='Textfield']");
    private final By finalDeleteBtn = By.xpath("//span[@class='css-178ag6o' and text()='Delete']");


    public CreateStoryPage() {
        super("");
    }

    public void clickCreateButton() throws InterruptedException {
        Thread.sleep(12000);
        driverWait().until(ExpectedConditions.visibilityOfElementLocated(createBtn)).click();
    }

    public void clickWorkTypeDropDownMenu() {
        driverWait().until(ExpectedConditions.visibilityOfElementLocated(workTypeBtn)).click();
    }

    public void selectTypeButton() {
        driverWait().until(ExpectedConditions.elementToBeClickable(storyTypeBtn)).click();
    }


    public void fillSummaryField(String summaryText) {
        driverWait().until(ExpectedConditions.visibilityOfElementLocated(summaryField)).sendKeys(summaryText);
    }

    public void fillDescriptionField(String descriptionText) {
        driverWait().until(ExpectedConditions.visibilityOfElementLocated(descriptionField)).sendKeys(descriptionText);
    }

    public void clickPriorityDropDownMenu() {
        driverWait().until(ExpectedConditions.visibilityOfElementLocated(priorityBtn)).click();
    }

    public void clickHighPriorityButton() {
        driverWait().until(ExpectedConditions.visibilityOfElementLocated(highPriorityBtn)).click();
    }

    public void clickCreateBtn() {
        driverWait().until(ExpectedConditions.visibilityOfElementLocated(createButton)).click();
    }

    public void assertStoryIsPresent() {
        driverWait().until(ExpectedConditions.visibilityOfElementLocated(summaryBtn)).click();
    }

    public WebElement storyCreatedAndVisible() {
      return driverWait().until(ExpectedConditions.visibilityOfElementLocated(storyIsVisible));
    }

    public void deleteStoryAfterCreation() throws InterruptedException {
        Thread.sleep(5000);
        driverWait().until(ExpectedConditions.visibilityOfElementLocated(linkToStory)).click();

        driverWait().until(ExpectedConditions.visibilityOfElementLocated(actionsBtn)).click();

        driverWait().until(ExpectedConditions.visibilityOfElementLocated(deleteBtn)).click();

        driverWait().until(ExpectedConditions.visibilityOfElementLocated(deleteField)).sendKeys("delete");

        driverWait().until(ExpectedConditions.visibilityOfElementLocated(finalDeleteBtn)).click();
    }

}
