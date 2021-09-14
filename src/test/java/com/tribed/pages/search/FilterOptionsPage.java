package com.tribed.pages.search;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterOptionsPage extends DriverManager {


    @FindBy(xpath = "//span[text()='Filter options']")
    public WebElement filterOption;

    @FindBy(xpath = "//h1[text()='Which aspects of your company culture should candidates prioritise?']")
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

    @FindBy(xpath = "(//p[contains(@class,'SearchPage___StyledText')])[1]")
    public WebElement resultCount;

    @FindBy(xpath = "//div[@name='skillsAndExperience']")
    public WebElement skillAndExperienceTab;

    @FindBy(xpath = "//div[@name='preferences']")
    public WebElement workStyleTab;

    @FindBy(xpath = "//div[text()='Development']")
    public WebElement developmentTab;

    @FindBy(xpath = "//div[text()='.Net']")
    public WebElement dotNet;

    @FindBy(xpath = "//div[text()='HR']")
    public WebElement hrTab;

    @FindBy(xpath = "//div[text()='Asset Creation']")
    public WebElement assetCreation;

    @FindBy(xpath = "((//div[@title='Technical'])[1]/parent::div/following-sibling::div//li//div[contains(@class,'Tag__Label')])[1]")
    public WebElement firstTechnical;

    @FindBy(xpath = "//div[contains(@class,'hAedIP')]")
    public WebElement firstSkillSelected;

    @FindBy(xpath = "((//div[@title='Leadership'])[1]/parent::div/following-sibling::div//li//div[contains(@class,'Tag__Label')])[1]")
    public WebElement firstLeadership;

    @FindBy(xpath = "((//div[@title='Sectors'])[1]/parent::div/following-sibling::div//li//div[contains(@class,'Tag__Label')])[1]")
    public WebElement firstSector;

    @FindBy(xpath = "((//div[@title='Qualifications'])[1]/parent::div/following-sibling::div//li//div[contains(@class,'Tag__Label')])[1]")
    public WebElement firstQualification;

    @FindBy(xpath = "//div[text()='Clear technical filters']")
    public WebElement clearTechnical;

    @FindBy(xpath = "//div[text()='Clear leadership filters']")
    public WebElement clearLeadership;

    @FindBy(xpath = "//div[text()='Clear sectors filters']")
    public WebElement clearSectors;

    @FindBy(xpath = "//div[text()='Clear qualifications filters']")
    public WebElement clearQualification;

    @FindBy(xpath = "//h1[text()='Office location']/following-sibling::div//input")
    public WebElement officeLocationTxt;

    @FindBy(xpath = "//h1[text()='Office location']/following-sibling::div//input/following-sibling::div//input")
    public WebElement officeDistance;

    @FindBy(xpath = "//li[text()='Within 10 Miles']/following-sibling::input")
    public WebElement miles;

    public static String selectedcandidate;

    public void clickOnFilterOption()
    {
        clickOnElement(filterOption);
    }
    public void clickOnClearAllFilterOption()
    {
        clickOnElement(clearAllFilterBtn);
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
        String[] ct=getElementText(resultCount).split(" ");
        if(selectedcandidate.contains(ct[0]))
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public void selectOtherTechnical() throws InterruptedException {
        Thread.sleep(2000);
        waitForElementClickable(firstTechnical,10,"Technical not visible");
        clickOnElement(firstTechnical);
    }

    public void selectOtherDevelopment() throws InterruptedException {
        //moveOnElement(firstDevelopment);
        scrollWindow();
        waitForElementVisibility(firstDevelopment,10,"Development not visible");
        scrollWindow();
        scrollWindow();
        clickOnElement(firstDevelopment);
    }
    public void selectOtherWellBeing() throws InterruptedException {
        Thread.sleep(2000);
        waitForElementVisibility(firstWellBeing,10,"Well Being not visible");
        scrollIntoViewSelenium(firstBenefit);
        clickOnElement(firstWellBeing);
    }
    public void selectOtherBenefits() throws InterruptedException {
        Thread.sleep(2000);
        waitForElementVisibility(firstBenefit,10,"Benefits not visible");
        scrollIntoViewSelenium(firstBenefit);
        scrollWindow();
        clickOnElement(firstBenefit);
    }

    public void selectOtherLeadership() throws InterruptedException {
        //moveOnElement(firstDevelopment);
        scrollWindow();
        waitForElementVisibility(firstLeadership,10,"Leadership not visible");
        scrollWindow();
        scrollWindow();
        clickOnElement(firstLeadership);
    }
    public void selectOtherSectors() throws InterruptedException {
        Thread.sleep(2000);
        waitForElementVisibility(firstSector,10,"Sectors not visible");
        scrollIntoViewSelenium(firstQualification);
        clickOnElement(firstSector);
    }
    public void selectOtherQualification() throws InterruptedException {
        Thread.sleep(2000);
        waitForElementVisibility(firstQualification,10,"Qualification not visible");
        scrollIntoViewSelenium(firstQualification);
        scrollWindow();
        clickOnElement(firstQualification);
    }

    public void clickOnClearCulture() throws InterruptedException {
        //moveOnElement(clearCulture);
        waitForElementVisibility(clearCulture,10,"Clear Culture not visible");
        clickOnElement(clearCulture);
    }
    public void clickOnClearDevelopment() throws InterruptedException {
        //moveOnElement(clearDevelopment);
        waitForElementVisibility(clearDevelopment,10,"Clear Development not visible");
        clickOnElement(clearDevelopment);
    }
    public void clickOnClearWellBeing() throws InterruptedException {
        //moveOnElement(clearWellBeing);
        waitForElementVisibility(clearWellBeing,10,"Clear well being not visible");
        clickOnElement(clearWellBeing);
    }
    public void clickOnClearBenefits() throws InterruptedException {
        //moveOnElement(clearBenefits);
        waitForElementVisibility(clearBenefits,10,"Clear Benefits not visible");
        clickOnElement(clearBenefits);
    }

    public void clickOnClearTechnical() throws InterruptedException {
        //moveOnElement(clearCulture);
        waitForElementVisibility(clearTechnical,10,"Clear Technical not visible");
        clickOnElement(clearTechnical);
    }
    public void clickOnClearLeadership() throws InterruptedException {
        //moveOnElement(clearDevelopment);
        waitForElementVisibility(clearLeadership,10,"Clear Leadership not visible");
        scrollIntoViewSelenium(clearLeadership);
        clickOnElement(clearLeadership);
    }
    public void clickOnClearSectors() throws InterruptedException {
        //moveOnElement(clearWellBeing);
        waitForElementVisibility(clearSectors,10,"Clear Sectors not visible");
        scrollIntoViewSelenium(clearLeadership);
        clickOnElement(clearSectors);
    }
    public void clickOnClearQualification() throws InterruptedException {
        //moveOnElement(clearBenefits);
        waitForElementVisibility(clearQualification,10,"Clear Qualification not visible");
        scrollIntoViewSelenium(clearLeadership);
        clickOnElement(clearQualification);
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
    public boolean isClearAllFilterWorkingForSkillsAndExperience()
    {
        try
        {
            if (firstSkillSelected.isDisplayed()) {
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
    public void clickOnDevelopmentTab() throws InterruptedException {
        //moveOnElement(clearDevelopment);
        waitForElementVisibility(developmentTab,10,"development tab not displayed");
        clickOnElement(developmentTab);
    }
    public void clickOnHRTab() throws InterruptedException {
        //moveOnElement(clearDevelopment);
        waitForElementVisibility(hrTab,10,"HR tab not displayed");
        clickOnElement(hrTab);
    }
    public void clickONSkillsAndExperienceTab() throws InterruptedException {
        //moveOnElement(clearDevelopment);
        waitForElementVisibility(skillAndExperienceTab,10,"Skills and Experienced tab not displayed");
        clickOnElement(skillAndExperienceTab);
    }
    public boolean isDevelopmentRelatedSkillsDisplayed()
    {
        return dotNet.isDisplayed();
    }

    public boolean isFinanceRelatedSkillsDisplayed()
    {
        return assetCreation.isDisplayed();
    }

    public boolean isWorkstyleTabDisplayed()    {
        return workStyleTab.isDisplayed();
    }

    public void clickOnWorkstyletab() throws InterruptedException {
        //moveOnElement(clearDevelopment);
        waitForElementVisibility(workStyleTab,10,"workStyleTab tab not displayed");
        clickOnElement(workStyleTab);
    }

    public  void enterJobLocation(String Location)
    {
        officeLocationTxt.sendKeys(Location);
        officeDistance.click();
        miles.click();
    }

    @FindBy(xpath = "(//h1[text()='Minimum salary']/following-sibling::div//input)[1]")
    public WebElement currencydp;

    @FindBy(xpath = "//li[text()='£']/following-sibling::input")
    public WebElement currency;

    @FindBy(xpath = "(//h1[text()='Minimum salary']/following-sibling::div//input)[5]")
    public WebElement salarytxt;

    @FindBy(xpath = "(//h1[text()='Minimum salary']/following-sibling::div//input)[6]")
    public WebElement salaryDuration;

    @FindBy(xpath = "//li[text()='Per year']/following-sibling::input")
    public WebElement perYear;

    public void selectSalaryDetail()
    {
        scrollIntoViewSelenium(currency);
        currencydp.click();
        currency.click();
        salarytxt.sendKeys("2000");
        salaryDuration.click();
        perYear.click();
    }
}
