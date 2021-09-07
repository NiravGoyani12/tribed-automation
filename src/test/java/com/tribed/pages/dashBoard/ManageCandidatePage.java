package com.tribed.pages.dashBoard;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.tribed.utilities.CommonUtils.getRandomString;

public class ManageCandidatePage extends DriverManager {

    @FindBy(xpath = "//p[text()='Followers']")
    public WebElement follower;

    public boolean isDashboardScreenOpen()
    {
            return follower.isDisplayed();
    }

    public void clickOnAddANewJobListingBtn()
    {
        clickOnElement(follower);
    }

}
