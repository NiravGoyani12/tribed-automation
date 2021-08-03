package com.tribed.pages.search;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterOptionsPage extends DriverManager {


    @FindBy(xpath = "//span[text()='Filter options']")
    public WebElement filterOption;

    @FindBy(xpath = "//div[text()='Which aspects of your company culture should candidates prioritise?']")
    public WebElement filterOptionText;

    @FindBy(xpath = "//button[contains(text(),'Show')]")
    public WebElement showCandidate;

    @FindBy(xpath = "(//img[contains(@src,'cultureIcon')])[1]")
    public WebElement firstCulture;

    @FindBy(xpath = "(//div[@title='Culture' and contains(@class,'selected')]//img[contains(@src,'cultureIcon')])[1]")
    public WebElement firstCultureSelected;

    @FindBy(xpath = "(//div[@title='Development']//img[contains(@src,'cultureIcon')])[1]")
    public WebElement firstDevelopment;

    @FindBy(xpath = "(//div[@title='Development' and contains(@class,'selected')]//img[contains(@src,'cultureIcon')])[1]")
    public WebElement firstDevelopmentSelected;

    @FindBy(xpath = "(//div[@title='Well-being']//img[contains(@src,'cultureIcon')])[1]")
    public WebElement firstWellBeing;

    @FindBy(xpath = "(//div[@title='Well-being' and contains(@class,'selected')]//img[contains(@src,'cultureIcon')])[1]")
    public WebElement firstWellbeingSelected;

    @FindBy(xpath = "(//div[@title='Benefits']//img[contains(@src,'cultureIcon')])[1]")
    public WebElement firstBenefit;

    @FindBy(xpath = "(//div[@title='Benefits' and contains(@class,'selected')]//img[contains(@src,'cultureIcon')])[1]")
    public WebElement firstBenefitsSelected;

    @FindBy(xpath = "//a[text()='Clear all filter']")
    public WebElement clearAllFilterBtn;

    @FindBy(xpath = "//div[text()='Clear culture filters']")
    public WebElement clearCulture;

    @FindBy(xpath = "//div[text()='Clear development filters']")
    public WebElement clearDevelopment;

    @FindBy(xpath = "//div[text()='Clear well-being filters']")
    public WebElement clearWellBeing;

    @FindBy(xpath = "//div[text()='Clear benefits filters']")
    public WebElement clearBenefits;

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

    public void selectOtherDevelopment() throws InterruptedException {
        //moveOnElement(firstDevelopment);
        waitForElementClickable(firstDevelopment,10,"Development not visible");
        clickOnElement(firstDevelopment);
    }
    public void selectOtherWellBeing() throws InterruptedException {
        //moveOnElement(firstWellBeing);
        waitForElementClickable(firstWellBeing,10,"Well Being not visible");
        clickOnElement(firstWellBeing);
    }
    public void selectOtherBenefits() throws InterruptedException {
        //moveOnElement(firstBenefit);
        waitForElementClickable(firstBenefit,10,"Benefits not visible");
        clickOnElement(firstBenefit);
    }

    public void clickOnClearCulture() throws InterruptedException {
        //moveOnElement(clearCulture);
        waitForElementClickable(clearCulture,10,"Clear Culture not visible");
        clickOnElement(clearCulture);
    }
    public void clickOnClearDevelopment() throws InterruptedException {
        //moveOnElement(clearDevelopment);
        waitForElementClickable(clearDevelopment,10,"Clear Development not visible");
        clickOnElement(clearDevelopment);
    }
    public void clickOnClearWellBeing() throws InterruptedException {
        //moveOnElement(clearWellBeing);
        waitForElementClickable(clearWellBeing,10,"Clear well being not visible");
        clickOnElement(clearWellBeing);
    }
    public void clickOnClearBenefits() throws InterruptedException {
        //moveOnElement(clearBenefits);
        waitForElementClickable(clearBenefits,10,"Clear Benefits not visible");
        clickOnElement(clearBenefits);
    }


    public boolean isClearAllFilterWorking()
    {
        try
        {
            if (firstCultureSelected.isDisplayed() || firstDevelopmentSelected.isDisplayed() || firstWellbeingSelected.isDisplayed() || firstBenefitsSelected.isDisplayed()) {
                return false;
            } else {
                return true;
            }
        }
        catch(Exception e)
        {
            return true;
        }
    }

    public boolean isClearCultureFilterWorking()
    {
        try
        {
            if(firstCultureSelected.isDisplayed())
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        catch(Exception e)
        {
            return true;
        }
    }

    public boolean isClearDevelopmentFilterWorking()
    {
        try
        {
            if(firstDevelopmentSelected.isDisplayed())
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        catch(Exception e)
        {
            return true;
        }
    }

    public boolean isClearWellBeingFilterWorking()
    {
        try
        {
            if(firstWellbeingSelected.isDisplayed())
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        catch(Exception e)
        {
            return true;
        }
    }

    public boolean isClearBenefitsFilterWorking()
    {
        try
        {
            if(firstBenefitsSelected.isDisplayed())
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        catch(Exception e)
        {
            return true;
        }
    }



}
