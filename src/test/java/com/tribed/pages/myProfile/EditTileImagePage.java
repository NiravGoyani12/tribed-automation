package com.tribed.pages.myProfile;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditTileImagePage extends DriverManager {

    @FindBy(xpath = "//div[text()='Edit culture']")
    public WebElement editCultureLink;

    @FindBy(xpath = "//h2[text()='Culture']")
    public WebElement cultureScreen;

    public void clickOnEditCulture() {
        clickOnElement(editCultureLink);
    }

    public boolean isCultureScreenOpen()
    {
        return cultureScreen.isDisplayed();
    }
}
