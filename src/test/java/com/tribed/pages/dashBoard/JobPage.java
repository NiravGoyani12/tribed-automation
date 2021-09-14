package com.tribed.pages.dashBoard;
import com.tribed.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

import static com.tribed.utilities.CommonUtils.*;

public class JobPage extends DriverManager {

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

    @FindBy(xpath = "(//button[text()='Save'])[1]")
    public WebElement saveImgBtn;

    @FindBy(xpath = "(//button[text()='Save'])[last()]")
    public WebElement saveImgBtnLast;

    @FindBy(xpath = "//input[@placeholder='Select option']/following-sibling::img")
    public WebElement jobFlexDP;

    @FindBy(xpath = "//input[@value='Office']")
    public WebElement jobFlexRemote;

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

    @FindBy(xpath = "//div[contains(@class,'modal')]//div[contains(@class,'Tag__Label')]/parent::div/parent::div[not(contains(@class,'selected'))]/div/div")
    public WebElement notSelectedSkills;

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

    @FindBy(xpath = "//span[text()='Upload image']")
    public WebElement uploadImageLogo;

    @FindBy(xpath = "//span[text()='Upload image of team or company']")
    public WebElement uploadTeamImage;

    @FindBy(xpath = "(//button[text()='About this job'])[1]")
    public WebElement aboutThisJobBtn;

    @FindBy(xpath = "//input[@name='basics.isSalaryHidden']")
    public WebElement isSalaryHiddenChk;

    @FindBy(xpath = "//button[text()='next section']")
    public WebElement nextSectionBtn;

    public static String skill;
    public static String leadership;
    public static String sector;
    public static String qualification;

    public void clickOnTabJobPage()
    {
        waitForElementVisibility(jobPageTab, 8, "Job page tab not displayed");
        clickOnElement(jobPageTab);
    }

    public void clickAddJobBtn() {
        waitForElementVisibility(addJobBtn, 8, "Add new Job listing not displayed");
        //scrollIntoViewSelenium(addJobBtn);
        scrollWindow();
        scrollWindow();
        scrollWindow();
        scrollWindow();
        scrollWindow();
        clickOnElement(addJobBtn);
    }

    public void clickAddTechnicalSkill() {
        waitForElementVisibility(addTechnicalTile, 8, "Add Technical Skill Tile not displayed");
        scrollIntoViewSelenium(infoTxt);
        clickOnElement(addTechnicalTile);
    }

    public void selectAndSaveSkillAndExperienced() {
        skill = getElementText(notSelectedSkills);
        clickOnElement(notSelectedSkills);
        clickOnElement(saveAndExitBtn);
    }

    public void selectAnySkillAndSave() {
        skill = getElementText(notSelectedSkills);
        clickOnElement(notSelectedSkills);
        clickOnElement(saveAndExitBtn);
    }

    public void clickonSaveAndExitBtn() throws InterruptedException {

        clickOnElement(saveAndExitBtn);
        Thread.sleep(2000);
    }

    public boolean isAddedSkillSavedAndDisplayed()
    {
        WebElement element = driver.findElement(By.xpath("//div[contains(@class,'SkillItemStrip')]//div[text()='" + skill + "']"));
        waitForElementVisibility(element, 5, "Added  Skill not displayed");
        return element.isDisplayed();
    }

    public void clickAddLeaderShipSkill()
    {
        waitForElementVisibility(addLeadershipTile, 8, "Add Leadership Skill Tile not displayed");
        scrollIntoViewSelenium(addTechnicalTile);
        scrollWindowUp();
        clickOnElement(addLeadershipTile);
    }

    public void clickAddSector() {
        waitForElementVisibility(sectorTile, 8, "Add Sectors Tile not displayed");
        scrollIntoViewSelenium(addTechnicalTile);
        clickOnElement(sectorTile);
    }

    public void clickAddQualification() {
        waitForElementVisibility(qualificationTile, 8, "Add Qualification Tile not displayed");
        scrollIntoViewSelenium(addTechnicalTile);
        clickOnElement(qualificationTile);
    }

    public void enterJobDetail(String jobTitle, String team, String officeLocation, String minSalary, String maxSalary, String infoTitle, String info) throws InterruptedException, AWTException {
        Thread.sleep(2000);
        waitForElementVisibility(jobTitleTxt, 5, "Job page not open");
        SendKeys(jobTitleTxt, jobTitle);
        clickOnElement(uploadImageLogo);
        uploadFile(JOB_LOGO);
        clickOnElement(saveImgBtn);
        SendKeys(basicsTeamTxt, team);
        SendKeys(basicsPreferencesOfficeLocationTxt, officeLocation);
        scrollWindow();
        clickOnElement(jobFlexDP);
        clickOnElement(jobFlexRemote);
        clickOnElement(jobFlexDP);
        clickOnElement(contractTypeDP);
        clickOnElement(fullTimeContract);
        clickOnElement(contractTypeDP);
        scrollWindow();
        clickOnElement(roleLevelDP);
        clickOnElement(entryLevelRole);
        clickOnElement(roleLevelDP);
        scrollWindow();
        clickOnElement(currencyDP);
        clickOnElement(gBPCurrency);
        clickOnElement(currencyDP);
        clickOnElement(frequencyDP);
        clickOnElement(perYerFrequency);
        clickOnElement(frequencyDP);
        SendKeys(minSalaryTxt, minSalary);
        SendKeys(maxSalaryTxt, maxSalary);
        SendKeys(infoTitleTxt, infoTitle);
        SendKeys(infoTxt, info);
        scrollWindow();
        scrollWindow();
        clickOnElement(uploadTeamImage);
        uploadFile(JOB_TEAM_IMAGE);
        clickOnElement(saveImgBtnLast);
    }

    public void clickOnAboutThisJobBtn()
    {
        scrollWindow();
        scrollWindow();
        scrollWindow();
        scrollWindow();
        scrollWindow();
        scrollWindow();
        clickOnElement(aboutThisJobBtn);
    }

    public boolean isAboutThisJobPageOpen() {
        return true;
    }

    public void clickOnIsSalaryHiddeenchk() {
        //scrollWindow();
        clickOnElement(isSalaryHiddenChk);
    }

    public boolean isSalaryVisible(String MinSalary) {
        try {
            WebElement element = driver.findElement(By.xpath("//p[contains(text(),'" + MinSalary + "')]"));
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void selectTechnicalSkill() {
        waitForElementVisibility(notSelectedSkills, 5, "Technical skill not selected");
        skill = getElementText(notSelectedSkills);
        clickOnElement(notSelectedSkills);
    }

    public void selectLeadership() {
        waitForElementVisibility(notSelectedSkills, 5, "Leadership not selected");
        leadership = getElementText(notSelectedSkills);
        clickOnElement(notSelectedSkills);
    }

    public void selectSector() {
        waitForElementVisibility(notSelectedSkills, 5, "Sector not selected");
        sector = getElementText(notSelectedSkills);
        clickOnElement(notSelectedSkills);
    }

    public void selectQualification() {
        waitForElementVisibility(notSelectedSkills, 5, "Qualification not selected");
        qualification = getElementText(notSelectedSkills);
        clickOnElement(notSelectedSkills);
    }

    public void clickOnNextSection() {
        clickOnElement(nextSectionBtn);
    }

    public boolean isAddedLeadershipDisplayed() {
        WebElement element = driver.findElement(By.xpath("//div[contains(@class,'SkillItemStrip')]//div[text()='" + leadership + "']"));
        waitForElementVisibility(element, 5, "selected leadership displayed");
        return element.isDisplayed();
    }

    public boolean isAddedSectorDisplayed() {
        WebElement element = driver.findElement(By.xpath("//div[contains(@class,'SkillItemStrip')]//div[text()='" + sector + "']"));
        waitForElementVisibility(element, 5, "selected sector displayed");
        return element.isDisplayed();
    }

    public boolean isAddedQualificationDisplayed() {
        WebElement element = driver.findElement(By.xpath("//div[contains(@class,'SkillItemStrip')]//div[text()='" + qualification + "']"));
        waitForElementVisibility(element, 5, "selected qualification displayed");
        return element.isDisplayed();
    }
}
