package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
@FindBy(css="[name='username']")
WebElement emailField;
    @FindBy(css="[name='password']")
    WebElement passwordField;
    public LoginPage enterData(String email, String password) {
        type(emailField, email);
        type(passwordField, password);
        return this;
    }
@FindBy(css="button[type='submit']")
WebElement yallaButton;
    public LoginPage clickOnYallaButton() {
        click(yallaButton);
        return this;
    }
@FindBy(xpath="//h3")
WebElement Successmessage;
    public LoginPage isSuccessTextPresent(String message) {
        assert Successmessage.getText().contains(message);
        return this;
    }
}
