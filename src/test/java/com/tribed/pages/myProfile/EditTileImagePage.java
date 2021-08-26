package com.tribed.pages.myProfile;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditTileImagePage extends DriverManager {

    @FindBy(xpath = "//div[text()='Edit culture']")
    public WebElement editCultureLink;

    @FindBy(xpath = "//h2[text()='Culture']")
    public WebElement cultureScreen;

    @FindBy(xpath = "//img[contains(@src,'/static/media/cross')]")
    public WebElement closeBtn;

    public void clickOnEditCulture() {
        clickOnElement(editCultureLink);
    }

    public boolean isCultureScreenOpen()
    {
        return cultureScreen.isDisplayed();
    }

    public void clickOnCloseButton() {
        clickOnElement(closeBtn);
    }

}
