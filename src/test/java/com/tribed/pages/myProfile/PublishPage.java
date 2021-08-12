package com.tribed.pages.myProfile;
import com.tribed.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PublishPage extends DriverManager {

    @FindBy(xpath="//h2[text()='Congratulations!']")
    public WebElement publishSuccessMsg;

    @FindBy(xpath="//button[text()='Return home']")
    public WebElement returnHomebtn;

    @FindBy(xpath="//p[text()='Edit company tile now']/parent::button")
    public WebElement editCompanyBtn;

    @FindBy(xpath="//button[text()='View Company Page']")
    public WebElement viewCompanyBtn;

    @FindBy(xpath="//button[text()='view company page']")
    public WebElement viewCompanyPageBtn;

    @FindBy(xpath="//h1[text()='Discover companies']")
    public  WebElement titleDiscoverCompanies;

    @FindBy(xpath = "//button[text()='Accept']")
    public WebElement acceptBtn;

    @FindBy(xpath = "//button[text()='cancel']")
    public WebElement cancelBtn;
    public String getPublishSuccessMsg() {
        return getElementText(publishSuccessMsg);
    }

    public boolean isReturnHomeBtnDisplayed() {
        //WebElement element = driver.findElement(By.xpath("(//h1[text()='" + jobTitle + "'])[1]"));
        waitForElementVisibility(returnHomebtn, 5, "Return to Home button not displayed");
        return returnHomebtn.isDisplayed();
    }

    public boolean isEditCompanyBtnDisplayed() {
        //WebElement element = driver.findElement(By.xpath("(//h1[text()='" + jobTitle + "'])[1]"));
        waitForElementVisibility(editCompanyBtn, 5, "Edit Company button not displayed");
        return editCompanyBtn.isDisplayed();
    }

    public boolean isViewCompanyBtnDisplayed() {
        //WebElement element = driver.findElement(By.xpath("(//h1[text()='" + jobTitle + "'])[1]"));
        waitForElementVisibility(viewCompanyPageBtn, 5, "View Company  button page not displayed");
        return viewCompanyPageBtn.isDisplayed();
    }

    public void clickOnReturnToHome()
    {
        clickOnElement(returnHomebtn);
    }
    public boolean isDashboardScreenDisplayed()
    {
        waitForElementVisibility(titleDiscoverCompanies, 5, "Dashboard page not displayed");
        return titleDiscoverCompanies.isDisplayed();
    }
    public void clickOnEditCompanyTileNow()
    {
        clickOnElement(editCompanyBtn);
    }
    public void clickOnViewCompanyPage()
    {
        clickOnElement(viewCompanyPageBtn);
    }
    public boolean isCompanyPageOpen()
    {
        return true;
    }

    public boolean isConfirmationPopupDisplayed()
    {
        try {
            return acceptBtn.isDisplayed();
        }
        catch (Exception e)
        {
            return false;
        }

    }
    public void clickOnCancelbtn()
    {
        clickOnElement(cancelBtn);
    }
}
