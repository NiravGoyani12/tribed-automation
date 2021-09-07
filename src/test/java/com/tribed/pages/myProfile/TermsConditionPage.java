package com.tribed.pages.myProfile;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TermsConditionPage extends DriverManager {

    @FindBy(xpath = "//div[text()='Privacy Policy']")
    public WebElement privacyPolicy;

    @FindBy(xpath = "//div[text()='T&C’s']")
    public WebElement terms;

    @FindBy(xpath = "//li[contains(text(),'T&C')]")
    public WebElement termsConditionMenu;

    @FindBy(xpath = "//div[contains(text(),'To view the terms and conditions click')]/span")
    public WebElement tCLink;

    @FindBy(xpath = "//div[contains(text(),'To view the privacy policy click')]/span")
    public WebElement privacyPolicyLink;

    @FindBy(xpath = "//h2[text()='Yolba Terms']")
    public WebElement yoblaTermsTitle;

    @FindBy(xpath = "//h2[text()='Yolba Privacy Policy']")
    public WebElement yoblaPrivacyPolicyTitle;

    @FindBy(xpath = "//img[contains(@src,'cross')]")
    public WebElement closeBtn;

    public void clickOnTermsConditionTab() {
        clickOnElement(termsConditionMenu);
    }

    public void clickOnTermsLink() {
        clickOnElement(tCLink);
    }

    public void clickOnPrivacyPolicyLink() {
        clickOnElement(privacyPolicyLink);
    }

    public void clickOnCloseBtn() {
        clickOnElement(closeBtn);
    }

    public boolean isTermsAndConditionScreenOpen()
    {
        return terms.isDisplayed();
    }

    public boolean isTermsLinkWorking() {
        try {
            return yoblaTermsTitle.isDisplayed();
        } catch (Exception e)
        {
            return false;
        }
    }

    public boolean isPrivacyPolicyLinkWorking()
    {
        try {
            return yoblaPrivacyPolicyTitle.isDisplayed();
        }catch(Exception e)
        {
            return false;
        }
    }

}
