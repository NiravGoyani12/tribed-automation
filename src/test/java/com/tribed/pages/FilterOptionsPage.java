package com.tribed.pages;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterOptionsPage extends DriverManager {


    @FindBy(xpath = "//span[text()='Filter options']")
    public   WebElement filterOption;

    @FindBy(xpath = "//div[text()='Which aspects of your company culture should candidates prioritise?']")
    public WebElement filterOptionText;

    @FindBy(xpath = "//button[contains(text(),'Show')]")
    public   WebElement showCandidate;

    @FindBy(xpath = "(//img[contains(@src,'cultureIcon')])[1]")
    public   WebElement firstCulture;


    public static String selectedcandidate;

    public void clickOnFilterOption()
    {

        clickOnElement(filterOption);
    }
    public boolean isFilterOptionTextDisplayed()
    {
        selectedcandidate=getElementText(showCandidate);
        return filterOptionText.isDisplayed();
    }
    public void selectOtherCulture() throws InterruptedException {
        Thread.sleep(2000);
        waitForElementClickable(firstCulture,10,"culture not visible");
        clickOnElement(firstCulture);
    }
    public void clickOnShowCandidate()
    {
        clickOnElement(showCandidate);
    }
    public boolean isSelectedCandidateCountUpdated()
    {
        if(showCandidate.getAttribute("value").equals(selectedcandidate))
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public boolean isShowCandidateCountDisplayedOnSearchResultPage()
    {
        if(showCandidate.getAttribute("value").equals(selectedcandidate))
        {
            return false;
        }
        else
        {
            return true;
        }
    }

}
