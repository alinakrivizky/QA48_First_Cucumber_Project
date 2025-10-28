package com.ilcarro.pages.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LetCarWorkPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LetCarWorkSteps {
    @And("User clicks on Let car work link")
    public void click_on_let_car_work_link() {
        new HomePage(driver).clickOnLetCarWorkLink();
    }
    @And("User enters all types of data")
    public void enter_all_types_of_data() {
        new LetCarWorkPage(driver).chooseTheCity("Tel Aviv")
                .fillCarModelDetails("Mini","Cooper(R56)","2010").selectFuel("Petrol")
                .selectGear("Manual").selectWd("FWD")
                .chooseDoorsAmount("2").chooseSeatsAmount("2")
                .fillCarDetailsToRegister("City Car","79-AR-526","200",
                        "Well-maintained stylish and fuel-efficient — perfect for city driving.")
                .choosePhoto("/Users/alinakrivizky/Documents/mini.jpg");
    }
    @Then("User clicks on Submit button")
    public void click_on_submit_button() {
        new LetCarWorkPage(driver).clickOnSubmitButton();
    }
}
