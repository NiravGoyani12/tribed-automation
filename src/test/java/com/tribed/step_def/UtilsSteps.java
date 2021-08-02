package com.tribed.step_def;
import com.tribed.driver.DriverManager;
import com.tribed.pages.home.HomePage;
import com.tribed.pages.home.LoginPage;
import com.tribed.pages.home.SignUpPage;
import com.tribed.pages.myProfile.*;
import com.tribed.pages.search.FilterOptionsPage;
import com.tribed.pages.search.SearchPage;
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
    SignUpPage signUpPage= new SignUpPage();
    CompanyPage companyPage=new CompanyPage();
    CulturePage culturePage=new CulturePage();
    JobPage jobPage=new JobPage();
    PreviewPage previewPage=new PreviewPage();
    PublishPage publishPage=new PublishPage();
    SearchPage searchPage=new SearchPage();
    FilterOptionsPage filterOptionsPage=new FilterOptionsPage();

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
            case "Company Page":
                isValidScreen = signUpPage.isCompanyPageTabDisplayed();
                break;
            case "Company edit":
                isValidScreen = previewPage.isCompanyEditPageDisplayed();
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
            case "Create account":
                signUpPage.clickOnCreateAccountBtn();
                break;
            case "Build company profile":
                signUpPage.clickOnBuildCompanyProfileButton();
                break;
            case "Save and go to cultural page":
                companyPage.clickonSaveAndGoToCulturalPageButton();
                break;
            case "Preview":
                companyPage.clickOnPreviewButton();
                break;
            case "Publish":
                Thread.sleep(2000);
                companyPage.clickOnPublishButton();
                break;
            case "Culture Page":
                culturePage.clickOnTabCulturePage();
                break;
            case "Job Page":
                jobPage.clickOnTabJobPage();
                break;
            case "Add to Culture":
                culturePage.clickAddCultureTile();
                break;
            case "Add Technical":
                jobPage.clickAddTechnicalSkill();
                break;
            case "Add Leadership":
                jobPage.clickAddLeaderShipSkill();
                break;
            case "Add Sector":
                jobPage.clickAddSector();
                break;
            case "Add Qualification":
                jobPage.clickAddQualification();
                break;
            case "Add Job":
                jobPage.clickAddJobBtn();
                break;
            case "Accept":
                culturePage.clickOnAcceptBtn();
                break;
            case "Next Section":
                jobPage.clickOnNextSection();
                break;
            case "Save and Exit":
                jobPage.clickonSaveAndExitBtn();
                break;
            case "About this job":
                jobPage.clickOnAboutThisJobBtn();
                break;
            case "Return to edit":
                previewPage.clickOnReturnToEdit();
                break;
            case "Return to home":
                publishPage.clickOnReturnToHome();
                break;
            case "Edit company":
                publishPage.clickOnEditCompanyTileNow();
                break;
            case "View company":
                publishPage.clickOnViewCompanyPage();
                break;

            default:
                throw new IllegalStateException("Unexpected service name: " + expButton);
        }
    }
}
