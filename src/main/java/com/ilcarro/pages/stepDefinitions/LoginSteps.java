package com.ilcarro.pages.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {
    @And("User clicks on login link")
    public void click_on_login_link() {
        new HomePage(driver).clickOnLoginLink();
    }
    @And("User enters valid data")
    public void enter_valid_data() {
        new LoginPage(driver).enterData("124A@gmail.com","12345678!Alina");
    }
    @And("User clicks on <Yalla> button")
    public void click_on_button() {
        new LoginPage(driver).clickOnYallaButton();
    }
    @And("User verifies Success message is displayed")
    public void verify_message_s_displayed() {
        new LoginPage(driver).isSuccessTextPresent("You are logged in success");
    }
    @Then("User closes Success message")
    public void verify_message_closed() {
        new LoginPage(driver).clickOnOkButton();
    }
}
