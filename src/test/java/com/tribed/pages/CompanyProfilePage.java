package com.tribed.pages;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyProfilePage extends DriverManager {


    @FindBy(xpath="//input[@name='slogan']")
    public  WebElement sloganTxt;

    @FindBy(xpath="//input[@name='foundationYear']")
    public  WebElement foundationYearTxt;

    @FindBy(xpath="//input[@name='sector']")
    public  WebElement sectorTxt;

    @FindBy(xpath="//input[@name='numberOfEmployees']")
    public  WebElement noOfEmployeeTxt;

    @FindBy(xpath="//input[@name='aboutUsTitle']")
    public  WebElement aboutUsTitleTxt;

    @FindBy(xpath="//textarea[@name='aboutUs']")
    public  WebElement aboutUsTxt;

    @FindBy(xpath="//input[@name='moreInfoTitle']")
    public  WebElement moreInfoTitleTxt;

    @FindBy(xpath="//textarea[@name='coreValue1.title']")
    public  WebElement coreValue1Txt;

    @FindBy(xpath="//textarea[@name='coreValue1.description']")
    public  WebElement coreValue1DescTxt;

    @FindBy(xpath="//textarea[@name='coreValue2.title']")
    public  WebElement coreValue2Txt;

    @FindBy(xpath="//textarea[@name='coreValue2.description']")
    public  WebElement coreValue2DescTxt;

    @FindBy(xpath="//textarea[@name='coreValue3.title']")
    public  WebElement coreValue3Txt;

    @FindBy(xpath="//textarea[@name='coreValue3.description']")
    public  WebElement coreValue3DescTxt;

    @FindBy(xpath="//textarea[@name='testimonial.quote']")
    public  WebElement testimonialQuoteTxt;

    @FindBy(xpath="//input[@name='testimonial.name']")
    public  WebElement testimonialNameTxt;

    @FindBy(xpath="//input[@name='testimonial.role']")
    public  WebElement testimonialRoleTxt;

    @FindBy(xpath="//button[text()='Save & go to culture page']")
    public  WebElement saveBtn;

    @FindBy(xpath="//h1[text()='Culture']")
    public  WebElement cultureBtn;

    @FindBy(name = "email")
    public   WebElement emmailField;

    @FindBy(name = "password")
    public   WebElement passwordField;

    @FindBy(xpath = "//button[text()='Preview']")
    public   WebElement previewBtn;

    @FindBy(xpath = "//h2[contains(text(),'Congratulations!')]")
    public   WebElement congratulationMsg;

    @FindBy(xpath = "//button[text()='Publish']")
    public   WebElement publishBtn;


    @FindBy(xpath="//input[@name='brandColor']")
    public  WebElement brandColorTxt;

    @FindBy(xpath="//textarea[@name='moreInfo']")
    public  WebElement moreInfoTxt;


    public void enterProfileDetail(String slogan, String year, String sector, String noOfEmp, String brandcolor, String aboutUsTitle, String aboutUs, String moreInfoTitle,String moreInfo, String coreValue1,String coreValue1Description, String coreValue2,String coreValue2Description, String coreValue3,String coreValue3Description, String testimonialQuote, String testimonialName, String testimonialRole) {

        waitForElementVisibility(sloganTxt, 5, "Profile page not open");
        sendKeys(sloganTxt, slogan);
        sendKeys(foundationYearTxt, year);
        sendKeys(sectorTxt, sector);
        sendKeys(noOfEmployeeTxt,noOfEmp);
        sendKeys(brandColorTxt,brandcolor);
        sendKeys(aboutUsTitleTxt, aboutUsTitle);
        sendKeys(aboutUsTxt, aboutUs);
        sendKeys(moreInfoTitleTxt, moreInfoTitle);
        sendKeys(moreInfoTxt, moreInfo);
        sendKeys(coreValue1Txt, coreValue1);
        sendKeys(coreValue1DescTxt, coreValue1Description);
        sendKeys(coreValue2Txt, coreValue2);
        sendKeys(coreValue2DescTxt, coreValue2Description);
        sendKeys(coreValue3Txt, coreValue3);
        sendKeys(coreValue3DescTxt, coreValue3Description);
        sendKeys(testimonialQuoteTxt, testimonialQuote);
        sendKeys(testimonialNameTxt, testimonialName);
        sendKeys(testimonialRoleTxt, testimonialRole);
    }

    public void clickonSaveAndGoToCulturalPageButton()
    {
        waitForElementVisibility(saveBtn, 5, "Save button not displayed");
        //MoveOnElement(saveBtn);
        clickOnElement(saveBtn);
    }

    public boolean isCulturalPageOpen() throws InterruptedException {
        waitForElementVisibility(cultureBtn, 5, "cultural page not open");
        return cultureBtn.isDisplayed();
    }

    public void enterEmailAndPassword(String email, String password) {
        sendKeys(emmailField,email);
        sendKeys(passwordField,password);
    }

    public void clickOnPreviewButton()
    {
        waitForElementVisibility(previewBtn, 5, "Preview button not displayed");
        //MoveOnElement(saveBtn);
        clickOnElement(previewBtn);
    }

    public boolean isPreviewWorking(String slogan)
    {
        WebElement element=driver.findElement(By.xpath("(//div[text()='"+slogan+"'])[1]"));
        waitForElementVisibility(element, 5, "Preview page not open");
        return element.isDisplayed();
    }

    public void clickOnPublishButton()
    {
        waitForElementVisibility(previewBtn, 5, "Publish button not displayed");
        //MoveOnElement(publishBtn);
        clickOnElement(publishBtn);
    }

    public boolean isPublishWorking()
    {
        waitForElementVisibility(previewBtn, 5, "Publish button not working");
        return congratulationMsg.isDisplayed();
    }

}
