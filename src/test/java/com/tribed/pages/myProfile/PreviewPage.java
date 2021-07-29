package com.tribed.pages.myProfile;
import com.tribed.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PreviewPage extends DriverManager {

    @FindBy(xpath="//button[text()='Return to edit']")
    public WebElement textOnPreviewPage;

    @FindBy(xpath = "(//h3[text()='Culture'])[1]")
    public WebElement cultureTab;

    @FindBy(xpath = "//button[text()='Preview']")
    public WebElement previewBtn;

    @FindBy(xpath = " //button[text()='Publish']")
    public WebElement publishBtn;

    @FindBy(xpath = " //input[@name='name']")
    public WebElement editCompanyName;

    public String getTextOnPreviewPage() {
        scrollIntoViewSelenium(textOnPreviewPage);
        return getElementText(textOnPreviewPage);
    }

    public boolean isSloganOnPreviewDisplayed(String slogan) {
        WebElement element = driver.findElement(By.xpath("(//div[text()='" + slogan + "'])[1]"));
        waitForElementVisibility(element, 5, "Preview page not open");
        return element.isDisplayed();
    }

    public boolean isSectorOnPreviewDisplayed(String sector) {
        WebElement element = driver.findElement(By.xpath("(//div[text()='" + sector + "'])"));
        waitForElementVisibility(element, 5, "Preview page not open");
        return element.isDisplayed();
    }

    public void clickOnReturnToEdit() {
        waitForElementVisibility(textOnPreviewPage,5,"return to edit text is not visible");
        textOnPreviewPage.click();
    }

    public void clickCultureTabAfterPreview()
    {
        waitForElementVisibility(cultureTab, 8, "Culture tab not displayed after preview");
        scrollWindow();
        clickOnElement(cultureTab);
    }

    public void clickOnPreviewButton() throws InterruptedException {
        Thread.sleep(3000);
        waitForElementVisibility(previewBtn, 5, "Preview button not displayed");
        clickOnElement(previewBtn);
    }

    public boolean isJobTitleOnPreviewDisplayed(String jobTitle) {
        WebElement element = driver.findElement(By.xpath("(//h1[text()='" + jobTitle + "'])[1]"));
        waitForElementVisibility(element, 5, "Preview page not open");
        return element.isDisplayed();
    }

    public boolean isPublishButtonDisplayed()
    {
        waitForElementVisibility(publishBtn, 5, "Publish button not displayed");
        return publishBtn.isDisplayed();
    }

    public boolean isCompanyEditPageDisplayed()
    {
        waitForElementVisibility(editCompanyName, 5, "Edit company page not displayed");
        return editCompanyName.isDisplayed();
    }

}
