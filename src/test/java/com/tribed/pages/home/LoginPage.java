package com.tribed.pages.home;
import com.tribed.driver.DriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static com.tribed.utilities.CommonUtils.*;

public class LoginPage extends DriverManager {

    @FindBy(name = "email")
    public   WebElement emmailField;

    @FindBy(name = "password")
    public   WebElement passwordField;

    @FindBy(xpath="//button[contains(text(),'Sign in')]")
    public   WebElement loginBtn;

    @FindBy(xpath="//div[contains(text(),'My profile')]")
    public  WebElement validLogInText;

    @FindBy(xpath="//label[text()='Password can only contain Latin letters.']")
    public  WebElement invalidLogInText;

    @FindBy(xpath="(//div[contains(text(),'Log out')])[1]")
    public  WebElement logoutBtn;

    @FindBy(xpath = "(//div[text()='Sign in'])[1]")
    public WebElement signInBtn;

    @FindBy(xpath = "(//div[text()='Messages'])[1]")
    public WebElement messageMenu;

    @FindBy(xpath = "(//div[text()='My profile'])[1]")
    public WebElement myProfileMenu;

    @FindBy(xpath = "//div[contains(text(),'Dashboard')]")
    public WebElement dashboardMenu;

    @FindBy(xpath = "//div[contains(text(),'Dashboard')]")
    public WebElement dashboardMenuAfterEditjob;

    @FindBy(xpath = "//div[contains(text(),'Search')]")
    public WebElement searchMenu;

    @FindBy(xpath = "(//div[contains(text(),'Search')])[1]")
    public WebElement searchMenuAfterLogin;

    @FindBy(xpath = "//img[contains(@src,'signUpHero')]/following-sibling::*")
    public WebElement signUpClose;

    @FindBy(xpath = "//span[contains(text(),'Forgot your password?')]")
    public WebElement forgetPasswordBtn;

    @FindBy(xpath = "//div[text()='Reset password']")
    public WebElement resetPassword;

    @FindBy(xpath = "//span[text()='Register now']")
    public WebElement registerNowBtn;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement forgetEmailTxt;

    @FindBy(xpath = "//button[text()='Send reset link']")
    public WebElement sendResetLinkBtn;

    @FindBy(xpath = "//h2[text()='Reset password email sent']")
    public WebElement ResetPasswordEmailSentMsg;

    public void enterEmailAndPassword(String userType) {
        clearAndSendKeys(emmailField,getUserName(userType));
        clearAndSendKeys(passwordField,getPassword(userType));
    }

    public void clickOnLogInBtn() throws InterruptedException {
        waitForElementClickable(loginBtn,10, "Login button not displayed");
        clickOnElement(loginBtn);
        Thread.sleep(3000);
    }

    public void clickOnRegisterNowBtn() throws InterruptedException {
        waitForElementClickable(registerNowBtn,10, "Register now button not displayed");
        clickOnElement(registerNowBtn);
    }

    public String getUserName(String userType)
    {
        switch(userType) {
            case "Valid User":
                return VALID_USER;
            case "Invalid User":
                return INVALID_USER;
            default:
                throw new IllegalStateException("Unexpected user type: " + userType);
        }
    }

    public String getPassword(String userType)
    {
        switch(userType) {
            case "Valid User":
                return VALID_USER_PSW;
            case "Invalid User":
                return INVALID_USER_PSW;
            default:
                throw new IllegalStateException("Unexpected user type: " + userType);
        }
    }

    public String getLoggedText() {
        waitForElementVisibility(validLogInText, 5, "Logged in Text not Visible");
        return getElementText(validLogInText);
    }

    public String getLogInnErrorText() {
        return getElementText(invalidLogInText);
    }

    public boolean checkStateOfButton() {
        return loginBtn.isEnabled();
    }

    public void clickOnLogoutBtn() {
        clickOnElement(logoutBtn);
    }

    public boolean isSignInButtonDisplayed() throws InterruptedException {
        waitForElementVisibility(signInBtn,5, "SingIn button not displayed");
        return signInBtn.isDisplayed();
    }

    public void clickonMessagemenu() throws InterruptedException {
        waitForElementClickable(messageMenu,5, "Message menu not displayed");
        clickOnElement(messageMenu);
    }

    public void clickonDashboardMenu()
    {
        clickOnElement(dashboardMenu);
    }

    public void clickonDashboardMenuAfterEditJob()
    {
        clickOnElement(dashboardMenuAfterEditjob);
    }

    public void clickonMyProfileMenu() throws InterruptedException {
        clickOnElement(myProfileMenu);
        Thread.sleep(1000);
    }
    public void clickonSearchMenu() throws InterruptedException {
        waitForElementClickable(searchMenu,10, "Search button not displayed");
        clickOnElement(searchMenu);
    }
    public void clickOnSearchAfterLogin() throws InterruptedException {
        waitForElementClickable(searchMenuAfterLogin,10, "Search button not displayed");
        clickOnElement(searchMenuAfterLogin);
    }

    public boolean isMessageMenuOpen()
    {
        //waitForElementVisibility(signInBtn,5, "Message screen not displayed");
        return true;
    }
        public void clickonSignUpClose() throws InterruptedException {
        waitForElementVisibility(signUpClose,10, "SingIn button not displayed");
        clickOnElement(signUpClose);
        Thread.sleep(2000);
    }
    public boolean isSignUpClosed() throws InterruptedException {
        Thread.sleep(4000);
        try {
            return signUpClose.isDisplayed();
        }
        catch (Exception e)
        {
            return  signUpClose.isDisplayed();
        }
    }

    public void clickonForgetPasswordLink()
    {
        waitForElementVisibility(forgetPasswordBtn,10, "Forget password link  not displayed");
        clickOnElement(forgetPasswordBtn);
    }
    public boolean isResetPasswordPageDisplayed() throws InterruptedException {
        Thread.sleep(4000);
        try {
            return resetPassword.isDisplayed();
        }
        catch (Exception e)
        {
            return  resetPassword.isDisplayed();
        }
    }
    public void pressEnterKey()
    {
        passwordField.sendKeys(Keys.ENTER);
    }

    public void enterEmailId()
    {
        forgetEmailTxt.sendKeys(getRandomString(10)+"@gmail.com");
    }

    public void clickOnSentResetLink()
    {
        clickOnElement(sendResetLinkBtn);
    }

    public boolean isSendResetLinkButtonWorking()
    {
        return ResetPasswordEmailSentMsg.isDisplayed();
    }
}
