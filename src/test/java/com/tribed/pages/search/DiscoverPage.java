package com.tribed.pages.search;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiscoverPage extends DriverManager {

    @FindBy(xpath = "//a[text()='Discover']")
    public   WebElement discoverTab;

    @FindBy(xpath = "//h1[contains(text(),'Candidates who prioritise company culture')]")
    public   WebElement headLines;

    public void clickOnDisCoverTab()
    {
        clickOnElement(discoverTab);
    }
    public boolean isDiscoverScreenDisplayed()
    {
        return  headLines.isDisplayed();
    }
}
