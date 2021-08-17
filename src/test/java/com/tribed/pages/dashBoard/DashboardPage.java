package com.tribed.pages.dashBoard;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.tribed.utilities.CommonUtils.getRandomString;

public class DashboardPage extends DriverManager {

    @FindBy(xpath = "//p[text()='Followers']")
    public WebElement follower;

    @FindBy(xpath = "//p[text()='Live jobs']")
    public WebElement liveJObs;

    @FindBy(xpath = "(//div[text()='Edit job'])[1]")
    public WebElement editJob;

    @FindBy(xpath = "(//li[text()='Edit job listing'])[1]")
    public WebElement editJobListing;

    @FindBy(xpath = "(//h1[contains(@class,'JobTile___StyledSubHeading')])[1]")
    public WebElement firstJobTitle;

    @FindBy(xpath = "//span[text()='Add a new job listing']")
    public WebElement addANewJobListingBtn;

    @FindBy(xpath = "//p[text()='Live jobs']/following-sibling::p")
    public WebElement liveJobsCount;

    @FindBy(xpath = "//h1[contains(@class,'JobTile___StyledSubHeading')]")
    public WebElement totalJobs;

    @FindBy(xpath = "//input[@name='jobTitle']")
    public WebElement jobTitle;

    @FindBy(xpath = "//input[@name='basics.team']")
    public WebElement basicsTeamTxt;

    @FindBy(xpath = "(//div[contains(@class,'JobsCarousel___StyledDiv')]/button)[1]")
    public WebElement nextBtn;

    @FindBy(xpath = "(//div[contains(@class,'JobsCarousel___StyledDiv')]/button)[1][@disabled]")
    public WebElement nextDisabledBtn;

    @FindBy(xpath = "(//div[contains(@class,'JobsCarousel___StyledDiv')]/button)[2]")
    public WebElement previousBtn;

    @FindBy(xpath = "(//div[contains(@class,'JobsCarousel___StyledDiv')]/button)[2][@disabled]")
    public WebElement previousDisabledBtn;

    @FindBy(xpath = "//div[contains(@class,'job_edit__TitleContainerLeft')]/*")
    public WebElement backBtn;

    @FindBy(xpath = "(//li[text()='Activate job'])[1]")
    public WebElement activateJobBtn;

    @FindBy(xpath = "(//li[text()='Deactivate job'])[1]")
    public WebElement deactivateJobBtn;

    @FindBy(xpath = "(//div[contains(@class,'JobTile__JobStatus')])[1]")
    public WebElement jobStatus;

    @FindBy(xpath = "(//button[text()='Manage candidates'])[1]")
    public WebElement manageCandidateBtn;

    @FindBy(xpath = "//h1[contains(@class,'applied_candidates___StyledSectionHeading')]")
    public WebElement candidatesScreen;

    public static String jobName;
    public static String teamName;

    public void clickOnEditJob()
    {
        waitForElementVisibility(editJob,10, "Edit job button not displayed");
        jobName=firstJobTitle.getText();
        clickOnElement(editJob);
    }

    public boolean isEditJobScreenOpen()
    {
        if(jobName.equals(jobTitle.getAttribute("value")))
            return true;
        else
            return false;
    }

    public boolean isDashboardScreenOpen()
    {
            return addANewJobListingBtn.isDisplayed();
    }

    public void clickOnAddANewJobListingBtn()
    {
        clickOnElement(addANewJobListingBtn);
    }

    public boolean isCorrectLiveJobCountDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        String liveJobCount=liveJobsCount.getText();
        int count=driver.findElements(By.xpath("//h1[contains(@class,'JobTile___StyledSubHeading')]")).size();
        if(liveJobCount.equals(String.valueOf(count)))
            return true;
        else
            return false;
    }
    public void updateJobTeam() throws InterruptedException {
        Thread.sleep(2000);
        teamName="Scrum "+getRandomString(4)+"_Team";
        clearAndSendKeys(basicsTeamTxt,teamName);
        Thread.sleep(2000);
    }
    public boolean isEditJobWorking()
    {
        if(teamName.equals(basicsTeamTxt.getAttribute("value")))
            return true;
        else
            return false;
    }

    public boolean isAddJobListingScreenOpen()
    {
        if(jobTitle.getAttribute("value").equals(""))
            return true;
        else
            return false;
    }
    public void clickNextBtn()
    {
        clickOnElement(nextBtn);
    }

    public void clickPreviousBtn()
    {
        clickOnElement(previousBtn);
    }

    public boolean isNextBtnWorking()
    {
        return nextDisabledBtn.isDisplayed();
    }

    public boolean isPreviousBtnWorking()
    {
        return previousDisabledBtn.isDisplayed();
    }

    public void clickOnEditJobListingMenu()
    {
        clickOnElement(editJobListing);
    }
    public void clickBackBtn()
    {
        clickOnElement(backBtn);
    }
    public void clickActivateJob()
    {
        clickOnElement(activateJobBtn);
    }

    public void clickDeactivateJob()
    {
        clickOnElement(deactivateJobBtn);
    }

    public void clickManageCandidates()
    {
        clickOnElement(manageCandidateBtn);
    }

    public boolean isActivateJobWorking() throws InterruptedException {
        Thread.sleep(3000);
        if(jobStatus.getText().equals("Job live"))
            return true;
        else
            return false;
    }

    public boolean isDeactivateJobWorking() throws InterruptedException {
        Thread.sleep(3000);
        if(jobStatus.getText().equals("Job deactivated"))
            return true;
        else
            return false;
    }

    public boolean isManageCandidatesScreenDisplayed()
    {
        return candidatesScreen.isDisplayed();
    }
}
