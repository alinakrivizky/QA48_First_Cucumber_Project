package com.ilcarro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LetCarWorkPage extends BasePage{
    public LetCarWorkPage(WebDriver driver) {
        super(driver);
    }
@FindBy(id="city")
WebElement cityField;
    public LetCarWorkPage chooseTheCity(String city) {
        click(cityField);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement firstCity = wait.until(ExpectedConditions
                .elementToBeClickable(By.cssSelector("#city-suggestions [role='option']")));
        firstCity.click();
        return this;
    }
@FindBy(css="input[name='manufacture']")
WebElement makeField;
    @FindBy(css="input[name='model']")
    WebElement modelField;
    @FindBy(css="input[name='year']")
    WebElement yearField;
    public LetCarWorkPage fillCarModelDetails(String make, String model, String year) {
        type(makeField,"make");
        type(modelField,"model");
        type(yearField,"year");
        return this;
    }
@FindBy(css="select[name='fuel']")
WebElement fuelField;
    public LetCarWorkPage selectFuel(String fuel) {
        new Select(fuelField).selectByValue("petrol");
        return this;
    }
@FindBy(css="select[name='gear']")
WebElement gearField;
    public LetCarWorkPage selectGear(String gear) {
        new Select(gearField).selectByValue("manual");
        return this;
    }
@FindBy(css="select[name='wheelsDrive']")
WebElement wheelsDriveField;
    public LetCarWorkPage selectWd(String wd) {
        new Select(wheelsDriveField).selectByValue("FWD");
        return this;
    }
@FindBy(css="input[name='doors']")
        //@FindBy need arrows to work but selector is invisible
WebElement doorsField;
    public LetCarWorkPage chooseDoorsAmount(String doors) {
        new Actions(driver).moveToElement(doorsField).perform();
        return this;
    }
@FindBy(css="input[name='seats']")
    WebElement seatsField;
    public LetCarWorkPage chooseSeatsAmount(String seats) {
        type(seatsField,"seats");
        return this;
    }
@FindBy(css="input[name='carClass']")
WebElement carClassField;
    @FindBy(css="input[name='pricePerDay']")
    WebElement pricePerDayField;
    @FindBy(css="input[name='serialNumber']")
    WebElement regNumberField;
@FindBy(css="textarea[placeholder='About (max 500 chars)']")
WebElement aboutField;
    public LetCarWorkPage fillCarDetailsToRegister(String carClass,
                                                   String regNumber, String price, String description) {
        type(carClassField,carClass);
        type(regNumberField,regNumber);
        type(pricePerDayField,price);
        type(aboutField,description);
        return this;
    }
@FindBy(css="#photo-file")
WebElement photoField;
    public LetCarWorkPage choosePhoto(String photoPath) {
        photoField.sendKeys(photoPath);
        return this;
    }
@FindBy(css="button[type='submit']")
WebElement submitButton;
    public LetCarWorkPage clickOnSubmitButton() {
        click(submitButton);
        return this;
    }
}
