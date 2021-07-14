package com.tribed.pages.myProfile;
import java.awt.*;
import java.awt.datatransfer.StringSelection;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveMouseAction;
import org.openqa.selenium.support.FindBy;

public class CulturePage extends DriverManager {


    @FindBy(xpath = "//h3[text()='Culture page']")
    public WebElement culturePageTab;

    @FindBy(xpath = "//span[text()='Add to Culture']")
    public WebElement textOnCulturePage;

    @FindBy(xpath = "//img[contains(@src,'add-culture')]")
    public WebElement addToCultureImg;

    @FindBy(xpath = "//img[contains(@src,'casual-dress')]")
    public WebElement casualDressTile;

    @FindBy(xpath = "//div[contains(@class,'modal')]//img[contains(@src,'cultureIcon')]/following-sibling::span/parent::div/parent::div[not(contains(@class,'selected'))]//span")
    public WebElement notSelectedCulture;

    @FindBy(xpath = "//button[text()='Save and exit']")
    public WebElement saveAndExitBtn;

    @FindBy(xpath = "//img[contains(@src,'add-development')]")
    public WebElement addDevlopmentImg;

    @FindBy(xpath = "//img[contains(@src,'technical-training-programme')]")
    public WebElement ttpTile;

    @FindBy(xpath = "//img[contains(@src,'add-wellbeing')]")
    public WebElement addWellbeingImg;

    @FindBy(xpath = "//img[contains(@src,'gym-access')]")
    public WebElement gymAccessTile;

    @FindBy(xpath = "//img[contains(@src,'add-benefits')]")
    public WebElement addBenefitsImg;

    @FindBy(xpath = "//img[contains(@src,'dental-benefits')]")
    public WebElement dentalBenifitsile;

    public static String cultureName;


    public String getTextOnCulturePage() {
        scrollIntoViewSelenium(textOnCulturePage);
        return getElementText(textOnCulturePage);
    }

    public void clickOnTabCulturePage()
    {
        waitForElementVisibility(culturePageTab, 8, "Culture page tab not displayed");

        clickOnElement(culturePageTab);
    }
    public void clickAddCultureTile()
    {
        waitForElementVisibility(addToCultureImg, 8, "Add to Culture tile not displayed");
        scrollIntoViewSelenium(addToCultureImg);
        clickOnElement(textOnCulturePage);
    }
    public void selectCultureAndSave()
    {
        cultureName=getElementText(notSelectedCulture);
        clickOnElement(notSelectedCulture);
        clickOnElement(saveAndExitBtn);
    }

    public boolean isAddCultureSavedAndDisplayed() {
        WebElement element= driver.findElement(By.xpath("//img[contains(@src,'cultureIcon')]/following-sibling::span[text()='"+cultureName+"']"));
        waitForElementVisibility(casualDressTile, 5, "Added Culture not displayed");
        return element.isDisplayed();
    }





}
