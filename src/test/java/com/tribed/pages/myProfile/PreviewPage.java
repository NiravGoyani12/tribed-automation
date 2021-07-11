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
}
