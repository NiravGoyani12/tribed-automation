package com.tribed.pages.dashBoard;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.tribed.utilities.CommonUtils.getRandomString;

public class Messages extends DriverManager {

    @FindBy(xpath = "//div[text()='Messages']")
    public WebElement Messgaes;

    @FindBy(xpath = "//button[contains(@class,'sc-dlnjwi fRayCF')]")
    public WebElement Dashboard;
    private Object Messages;


    public void clickOntribedIcon() {
        waitForElementVisibility((WebElement) Messages, 3, "Messages is not visible");
        clickOnElement((WebElement) Messages);
    }
}
