package com.tribed.pages;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager {

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[1]/div/div[4]")
    private WebElement signInBtn;

    public void clickOnSignIn() {
        clickOnElement(signInBtn);
    }
}
