package com.tribed.pages.myProfile;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

import static com.tribed.utilities.CommonUtils.JOB_LOGO;

public class EditTileImagePage extends DriverManager {

    @FindBy(xpath = "//div[text()='Edit culture']")
    public WebElement editCultureLink;

    @FindBy(xpath = "//div[text()='Change image']")
    public WebElement changeImageLink;

    @FindBy(xpath = "//h2[text()='Culture']")
    public WebElement cultureScreen;

    @FindBy(xpath = "//img[contains(@src,'/static/media/cross')]")
    public WebElement closeBtn;

    @FindBy(xpath = "(//button[text()='Save'])[1]")
    public WebElement saveImgBtn;

    @FindBy(xpath = "//div[contains(@class,'company_tile_edit__BackErrorWrapper')]/*")
    public WebElement backBtn;

    @FindBy(xpath = "//input[@placeholder='Search for a key skill']")
    public WebElement searchTxt;

    public void clickOnEditCulture() {
        clickOnElement(editCultureLink);
    }

    public void clickOnBackBtn() {
        clickOnElement(backBtn);
    }

    public boolean isCultureScreenOpen()
    {
        return cultureScreen.isDisplayed();
    }

    public boolean isBackButtonWorking()
    {
        return searchTxt.isDisplayed();
    }

    public void clickOnCloseButton() {
        clickOnElement(closeBtn);
    }

    public void clickOnChangeImage() {
        clickOnElement(changeImageLink);
    }

    public void uploadImage() throws InterruptedException, AWTException {
        uploadFile(JOB_LOGO);
        clickOnElement(saveImgBtn);
    }
}
