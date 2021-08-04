package com.tribed.pages.myProfile;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfilePage extends DriverManager {

    @FindBy(xpath = "(//li[text()='Edit my profile'])[2]")
    public WebElement editMyProfile;

    @FindBy(xpath = "(//li[text()='View my profile'])[2]")
    public WebElement viewMyProfile;

    @FindBy(xpath = "//h3[text()='Company page']")
    public WebElement companyPage;

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

}
