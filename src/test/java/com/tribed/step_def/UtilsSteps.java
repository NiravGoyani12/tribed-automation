package com.tribed.step_def;
import com.tribed.driver.DriverManager;
import com.tribed.pages.home.HomePage;
import com.tribed.pages.home.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.StringContains.containsString;

public class UtilsSteps extends DriverManager {

    DriverManager driverManager = new DriverManager();
    HomePage homePage = new HomePage();
    LoginPage loginPage=new LoginPage();

    @Then("^the url should contain with \"([^\"]*)\"$")
    public void the_url_should_contain(String url) {
        assertThat(getCurrentUrl(), containsString(url));
    }


    @Then("^I should able to see \"([^\"]*)\" screen$")
    public void iShouldAbleToSeeScreen(String expScreenName) throws Throwable {
        Boolean isValidScreen = false;

        switch (expScreenName) {
            case "Home":
                isValidScreen = homePage.isHomePageOpen();
                break;
            case "Search":
                isValidScreen = homePage.isSearchPageOpen();
                break;
            case "Login":
                isValidScreen = homePage.isSignPageOpen();
                break;
            case "Signup":
                isValidScreen = homePage.isSignUpPageOpen();
                break;
            case "SignIn":
                isValidScreen = loginPage.isSignInButtonDisplayed();
                break;
            case "Messages":
                isValidScreen = loginPage.isMessageMenuOpen();
                break;
            case "My Profile":
                isValidScreen = loginPage.isMyProfileOpen();
                break;
            case "Hiring":
                isValidScreen = homePage.isIamHiringPageOpen(expScreenName.toLowerCase());
                break;
            case "Dashboard":
                isValidScreen = loginPage.isDashboardOpen();
                break;
            case "Reset Password":
                isValidScreen = loginPage.isResetPasswordPageDisplayed();
                break;
            default:
                throw new IllegalStateException("Unexpected service name: " + expScreenName);
        }
        assertThat(isValidScreen, is(true));
    }

    @And("^I click on \"([^\"]*)\" menu$")
    public void iClickOnMenu(String expButton) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        switch (expButton) {
            case "Search":
                homePage.clickOnSearch();
                break;
            case "SignIn":
                homePage.clickOnSignIn();
                break;
            case "SignUp":
                homePage.clickOnSignUp();
                break;
            case "I m Hiring":
                homePage.clickOnIAmHiring();
                break;
            case "Home":
                homePage.clickOnHome();
                break;
            case "Messages":
                loginPage.clickonMessagemenu();
                break;
            case "My Profile":
                loginPage.clickonMyProfileMenu();
                break;
            case "Dashboard":
                loginPage.clickonDashboardMenu();
                break;
            default:
                throw new IllegalStateException("Unexpected service name: " + expButton);
        }
    }

    @And("^I click on \"([^\"]*)\" button$")
    public void iClickOnButton(String expButton) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        switch (expButton) {
            case "Tribe Icon":
                homePage.clickOntribedIcon();
                break;
            case "View Company":
                homePage.clickOnViewCompanyPage();
                break;
            case "Login":
                loginPage.clickOnLogInBtn();
                break;
            case "Logout":
                loginPage.clickOnLogoutBtn();
                break;
            case "Close":
                loginPage.clickonSignUpClose();
                break;
            case "Forget Password":
                loginPage.clickonForgetPasswordLink();
                break;
            default:
                throw new IllegalStateException("Unexpected service name: " + expButton);
        }
    }
}
