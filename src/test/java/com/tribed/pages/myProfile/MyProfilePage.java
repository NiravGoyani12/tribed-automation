package com.tribed.pages.myProfile;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfilePage extends DriverManager {

    @FindBy(xpath = "(//li[text()='Edit my profile'])[1]")
    public WebElement editMyProfile;

    @FindBy(xpath = "(//li[text()='View my profile'])[1]")
    public WebElement viewMyProfile;

    @FindBy(xpath = "(//li[text()='Edit tile image'])[1]")
    public WebElement editTileImage;

    @FindBy(xpath = "//h3[text()='Company page']")
    public WebElement companyPage;

    @FindBy(xpath = "//h1[text()='Company tile']")
    public WebElement companyTile;

    @FindBy(xpath = "(//strong[text()='Number of employees:'])[1]")
    public WebElement noOfEmployees;

    public void clickOnEditMyProfile()
    {
        waitForElementVisibility(editMyProfile,5, "Edit My Profile screen not displayed");
        clickOnElement(editMyProfile);
    }

    public void clickOnViewMyProfile() {
        waitForElementVisibility(viewMyProfile,5, "View My Profile screen not displayed");
        clickOnElement(viewMyProfile); }

    public boolean isEditProfileScreenOpen()
    {
            return companyPage.isDisplayed();
    }

    public boolean isViewProfileScreenOpen()
    {
        return noOfEmployees.isDisplayed();
    }

    public boolean isMyProfileButtonWorking() throws InterruptedException {
        Thread.sleep(2000);
        return editMyProfile.isDisplayed();
    }

    public void clickOnEditTileImage()
    {
        clickOnElement(editTileImage);
    }

    public boolean isEditTileImageScreenOpen()
    {
        return companyTile.isDisplayed();
    }
}
