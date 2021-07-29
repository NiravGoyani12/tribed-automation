package com.tribed.pages.myProfile;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

import static com.tribed.utilities.CommonUtils.COMPANY_LOGO;

public class CompanyPage extends DriverManager {

    @FindBy(xpath = "//input[@name='slogan']")
    public WebElement sloganTxt;

    @FindBy(xpath = "//input[@name='foundationYear']")
    public WebElement foundationYearTxt;

    @FindBy(xpath = "//input[@name='sector']")
    public WebElement sectorTxt;

    @FindBy(xpath = "//input[@name='numberOfEmployees']")
    public WebElement noOfEmployeeTxt;

    @FindBy(xpath = "//input[@name='aboutUsTitle']")
    public WebElement aboutUsTitleTxt;

    @FindBy(xpath = "//textarea[@name='aboutUs']")
    public WebElement aboutUsTxt;

    @FindBy(xpath = "//input[@name='moreInfoTitle']")
    public WebElement moreInfoTitleTxt;

    @FindBy(xpath = "//textarea[@name='coreValue1.title']")
    public WebElement coreValue1Txt;

    @FindBy(xpath = "//textarea[@name='coreValue1.description']")
    public WebElement coreValue1DescTxt;

    @FindBy(xpath = "//textarea[@name='coreValue2.title']")
    public WebElement coreValue2Txt;

    @FindBy(xpath = "//textarea[@name='coreValue2.description']")
    public WebElement coreValue2DescTxt;

    @FindBy(xpath = "//textarea[@name='coreValue3.title']")
    public WebElement coreValue3Txt;

    @FindBy(xpath = "//textarea[@name='coreValue3.description']")
    public WebElement coreValue3DescTxt;

    @FindBy(xpath = "//textarea[@name='testimonial.quote']")
    public WebElement testimonialQuoteTxt;

    @FindBy(xpath = "//input[@name='testimonial.name']")
    public WebElement testimonialNameTxt;

    @FindBy(xpath = "//input[@name='testimonial.role']")
    public WebElement testimonialRoleTxt;

    @FindBy(xpath = "//button[text()='Save & go to culture page']")
    public WebElement saveBtn;

    @FindBy(xpath = "//button[text()='Preview']")
    public WebElement previewBtn;

    @FindBy(xpath = "//button[text()='Publish']")
    public WebElement publishBtn;

    @FindBy(xpath = "//input[@name='brandColor']")
    public WebElement brandColorTxt;

    @FindBy(xpath = "//textarea[@name='moreInfo']")
    public WebElement moreInfoTxt;

    @FindBy(xpath = "(//div[text()='Upload image'])[1]")
    public WebElement uploadImageLogo;

    @FindBy(xpath = "(//div[text()='Upload image'])[3]")
    public WebElement uploadSupportImage;

    @FindBy(xpath = "(//div[text()='Upload image'])[2]")
    public WebElement uploadEmpImage;

    public void enterProfileDetail(String slogan, String year, String sector, String noOfEmp, String brandcolor, String aboutUsTitle, String aboutUs, String moreInfoTitle, String moreInfo, String coreValue1, String coreValue1Description, String coreValue2, String coreValue2Description, String coreValue3, String coreValue3Description, String testimonialQuote, String testimonialName, String testimonialRole) throws AWTException, InterruptedException {

        waitForElementVisibility(sloganTxt, 5, "Profile page not open");
        clickOnElement(uploadImageLogo);
        uploadFile(COMPANY_LOGO);
        clearAndSendKeys(sloganTxt, slogan);
        clearAndSendKeys(foundationYearTxt, year);
        clearAndSendKeys(sectorTxt, sector);
        clearAndSendKeys(noOfEmployeeTxt, noOfEmp);
        //clearAndSendKeys(brandColorTxt, brandcolor);
        clearAndSendKeys(aboutUsTitleTxt, aboutUsTitle);
        clearAndSendKeys(aboutUsTxt, aboutUs);
        //waitForElementClickable(uploadSupportImage,10,"Upload support email not displayed");
        //clickOnElement(uploadSupportImage);
        //uploadFile(COMPANY_SUPPORT_IMAGE);
        clearAndSendKeys(moreInfoTitleTxt, moreInfoTitle);
        clearAndSendKeys(moreInfoTxt, moreInfo);

        //clickOnElement(uploadEmpImage);
        //uploadFile(COMPANY_IMP_IMAGE);
        clearAndSendKeys(coreValue1Txt, coreValue1);
        clearAndSendKeys(coreValue1DescTxt, coreValue1Description);
        clearAndSendKeys(coreValue2Txt, coreValue2);
        clearAndSendKeys(coreValue2DescTxt, coreValue2Description);
        clearAndSendKeys(coreValue3Txt, coreValue3);
        clearAndSendKeys(coreValue3DescTxt, coreValue3Description);
        clearAndSendKeys(testimonialQuoteTxt, testimonialQuote);
        clearAndSendKeys(testimonialNameTxt, testimonialName);
        clearAndSendKeys(testimonialRoleTxt, testimonialRole);
        //clickOnElement(uploadEmpImage);
        //uploadFile(JOB_TEAM_IMAGE);
    }

    public void clickonSaveAndGoToCulturalPageButton() {
        scrollIntoViewSelenium(saveBtn);
        clickOnElement(saveBtn);
    }

    public void clickOnPreviewButton() {
        waitForElementVisibility(previewBtn, 5, "Preview button not displayed");
        clickOnElement(previewBtn);
    }

    public void clickOnPublishButton() {
        waitForElementVisibility(previewBtn, 5, "Publish button not displayed");
        clickOnElement(publishBtn);
    }
}
