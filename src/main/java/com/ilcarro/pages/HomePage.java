package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
@FindBy(css="h1")
WebElement homeTitle;
    public HomePage isHomePageTitleDisplayed() {
        assert isElementDisplayed(homeTitle);
        return this;
    }
@FindBy(xpath="//a[.='Log in']")
WebElement logInLink;
    public LoginPage clickOnLoginLink() {
        click(logInLink);
        return new LoginPage(driver);
    }
}
