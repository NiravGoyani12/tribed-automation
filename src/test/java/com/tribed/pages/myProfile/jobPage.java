package com.tribed.pages.myProfile;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class jobPage extends DriverManager {


    @FindBy(xpath = "//h3[text()='Jobs page']")
    public WebElement jobPageTab;

    @FindBy(xpath = "//button[text()='Add new job listing']")
    public WebElement addJobBtn;

    @FindBy(xpath = "//input[@name='jobTitle']")
    public WebElement jobTitleTxt;

    @FindBy(xpath = "//input[@name='basics.team']")
    public WebElement basicsTeamTxt;

    @FindBy(xpath = "//input[@name='basics.preferences.officeLocation']")
    public WebElement basicsPreferencesOfficeLocationTxt;

    @FindBy(xpath = "//input[@placeholder='Select option']/following-sibling::img")
    public WebElement jobLocationDP;

    @FindBy(xpath = "//input[@value='Remote']/following-sibling::input")
    public WebElement jobLocationRemote;

    @FindBy(xpath = "(//input[@placeholder='Select type']/following-sibling::img)[1]")
    public WebElement contractTypeDP;

    @FindBy(xpath = "//li[text()='Contract full-time']/following-sibling::input")
    public WebElement fullTimeContract;

    @FindBy(xpath = "(//input[@placeholder='Select type']/following-sibling::img)[2]")
    public WebElement roleLevelDP;

    @FindBy(xpath = "//li[text()='Entry Level']/following-sibling::input")
    public WebElement entryLevelRole;

    @FindBy(xpath = "//input[@placeholder='Select currency']/following-sibling::img")
    public WebElement currencyDP;

    @FindBy(xpath = "//li[text()='£ (GBP)']/following-sibling::input")
    public WebElement gBPCurrency;

    @FindBy(xpath = "//input[@placeholder='Select frequency']/following-sibling::img")
    public WebElement frequencyDP;

    @FindBy(xpath = "//li[text()='Per year']/following-sibling::input")
    public WebElement perYerFrequency;

    @FindBy(xpath = "//input[@placeholder='e.g 30000']")
    public WebElement minSalaryTxt;

    @FindBy(xpath = "//input[@placeholder='e.g 35000']")
    public WebElement maxSalaryTxt;

    @FindBy(xpath = "//input[@name='infoTitle']")
    public WebElement infoTitleTxt;

    @FindBy(xpath = "//textarea[@name='info']")
    public WebElement infoTxt;

    @FindBy(xpath = "//div[text()='Add Technical']")
    public WebElement addTechnicalTile;

    @FindBy(xpath = "//div[text()='Jira']")
    public WebElement jiraTech;

    @FindBy(xpath = "//button[text()='Save and exit']")
    public WebElement saveAndExitBtn;

    @FindBy(xpath = "//div[text()='Add Leadership']")
    public WebElement addLeadershipTile;

    @FindBy(xpath = "//div[text()='Coaching']")
    public WebElement coachingShip;

    @FindBy(xpath = "//div[text()='Add Sectors']")
    public WebElement sectorTile;

    @FindBy(xpath = "//div[text()='Regions']")
    public WebElement regionsSector;

    @FindBy(xpath = "//div[text()='Add Qualifications']")
    public WebElement qualificationTile;

    @FindBy(xpath = "//div[text()='Amazon Web Services']")
    public WebElement amazonWebService;

    public void clickOnTabJobPage()
    {
        waitForElementVisibility(jobPageTab, 8, "Job page tab not displayed");
        clickOnElement(jobPageTab);
    }
    public void clickAddJobBtn()
    {
        waitForElementVisibility(addJobBtn, 8, "Add new Job listing not displayed");
        scrollIntoViewSelenium(addJobBtn);
        clickOnElement(addJobBtn);
    }
    public void clickAddTechnicalSkill()
    {
        waitForElementVisibility(addTechnicalTile, 8, "Add Technical Skill Tile not displayed");
        scrollIntoViewSelenium(infoTxt);
        clickOnElement(addTechnicalTile);
    }
    public void selectAndSaveTechnicalSkill()
    {

        clickOnElement(jiraTech);
        clickOnElement(saveAndExitBtn);
    }
    public void clickonSaveAndExitBtn()
    {
        clickOnElement(saveAndExitBtn);
    }

    public boolean isAddTechnicalSkillSavedAndDisplayed() {
        waitForElementVisibility(jiraTech, 5, "Added Technical Skill not displayed");
        return jiraTech.isDisplayed();
    }

    public void clickAddLeaderShipSkill()
    {
        waitForElementVisibility(addLeadershipTile, 8, "Add Leadership Skill Tile not displayed");
        scrollIntoViewSelenium(addTechnicalTile);
        clickOnElement(addLeadershipTile);
    }
    public void selectLeaderShipSkill()
    {
        clickOnElement(coachingShip);
    }

    public boolean isAddedLeadershipSkillSavedAndDisplayed() {
        waitForElementVisibility(coachingShip, 5, "Added Leadership Skill not displayed");
        return coachingShip.isDisplayed();
    }

    public void clickAddSector()
    {
        waitForElementVisibility(sectorTile, 8, "Add Sectors Tile not displayed");
        scrollIntoViewSelenium(addTechnicalTile);
        clickOnElement(sectorTile);
    }
    public void selectSectors()
    {
        clickOnElement(regionsSector);
    }

    public boolean isAddedSectorSavedAndDisplayed() {
        waitForElementVisibility(regionsSector, 5, "Added Secotor not displayed");
        return regionsSector.isDisplayed();
    }
    public void clickAddQualification()
    {
        waitForElementVisibility(qualificationTile, 8, "Add Qualification Tile not displayed");
        scrollIntoViewSelenium(addTechnicalTile);
        clickOnElement(qualificationTile);
    }
    public void selectQualification()
    {
        clickOnElement(amazonWebService);
    }

    public boolean isAddedQualificationSavedAndDisplayed() {
        waitForElementVisibility(amazonWebService, 5, "Added Qualification not displayed");
        return amazonWebService.isDisplayed();
    }

    public void enterJobDetail(String jobTitle, String team, String officeLocation, String minSalary, String maxSalary, String infoTitle, String info) throws InterruptedException {
        Thread.sleep(2000);
        waitForElementVisibility(jobTitleTxt, 5, "Job page not open");
        SendKeys(jobTitleTxt, jobTitle);
        SendKeys(basicsTeamTxt, team);
        SendKeys(basicsPreferencesOfficeLocationTxt, officeLocation);
        SendKeys(minSalaryTxt, minSalary);
        SendKeys(maxSalaryTxt, maxSalary);
        SendKeys(infoTitleTxt, infoTitle);
        SendKeys(infoTxt, info);
    }



}
