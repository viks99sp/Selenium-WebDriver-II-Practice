package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends MainPage {

    private final By emailField = By.xpath("//div[@class='css-env1z2']//input[@id='username-uid1']");
    private final By continueBtn = By.xpath("//button[@id='login-submit']");
    private final By passwordField = By.xpath("//div[@class='css-env1z2']//input[@id='password']");
    private final By loginBtn = By.xpath("//button[@id='login-submit']");
    private final By jiraIcon = By.xpath("//span[@aria-label='Jira']");


    public LoginPage() {
        super("/jira");
    }

    public void loginIntoJiraAccount(String email, String password) {
        WebElement emailInput = driverWait().until(ExpectedConditions.visibilityOfElementLocated(emailField));
        emailInput.sendKeys(email);

        WebElement continueButton = driver().findElement(continueBtn);
        continueButton.click();

        WebElement passwordInput = driver().findElement(passwordField);
        passwordInput.sendKeys(password);

        WebElement loginButton = driver().findElement(loginBtn);
        loginButton.click();

    }


    public WebElement successfulNavigated() throws InterruptedException {
        Thread.sleep(8000);
        return driverWait().until(ExpectedConditions.visibilityOfElementLocated(jiraIcon));
    }
}
