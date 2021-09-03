package com.tribed.step_def;

import com.tribed.driver.DriverManager;
import com.tribed.pages.dashBoard.DashboardPage;
import com.tribed.pages.dashBoard.JobPage;
import com.tribed.pages.home.HomePage;
import com.tribed.pages.home.LoginPage;
import com.tribed.pages.home.SignUpPage;
import com.tribed.pages.myProfile.*;
import com.tribed.pages.search.DiscoverPage;
import com.tribed.pages.search.FilterOptionsPage;
import com.tribed.pages.search.SearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

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
    MyProfilePage myProfilePage=new MyProfilePage();
    DashboardPage dashboardPage=new DashboardPage();
    DiscoverPage discoverPage=new DiscoverPage();
    EditTileImagePage editTileImagePage=new EditTileImagePage();

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
                isValidScreen = myProfilePage.isMyProfileButtonWorking();
                break;
            case "Hiring":
                isValidScreen = homePage.isIamHiringPageOpen(expScreenName.toLowerCase());
                break;
            case "Dashboard":
                isValidScreen = dashboardPage.isDashboardScreenOpen();
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
            case "Confirmation popup":
                isValidScreen = publishPage.isConfirmationPopupDisplayed();
                break;
            case "Edit profile":
                isValidScreen = myProfilePage.isEditProfileScreenOpen();
                break;
            case "View profile":
                isValidScreen = myProfilePage.isViewProfileScreenOpen();
                break;
            case "Edit job":
                isValidScreen = dashboardPage.isEditJobScreenOpen();
                break;
            case "Add a new job listing":
                isValidScreen = dashboardPage.isAddJobListingScreenOpen();
                break;
            case "Discover":
                isValidScreen = discoverPage.isDiscoverScreenDisplayed();
                break;
            case "candidates":
                isValidScreen = dashboardPage.isManageCandidatesScreenDisplayed();
                break;
            case "Email sent":
                isValidScreen = loginPage.isSendResetLinkButtonWorking();
                break;
            case "Company tile":
                isValidScreen = myProfilePage.isEditTileImageScreenOpen();
                break;
            case "Culture":
                isValidScreen = editTileImagePage.isCultureScreenOpen();
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
                loginPage.clickonMyProfileMenu();
                break;
            case "Logout":
                loginPage.clickOnLogoutBtn();
                break;
            case "Dashboard":
                loginPage.clickonDashboardMenu();
                break;
            case "Dashboard after edit Job":
                loginPage.clickonDashboardMenuAfterEditJob();
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
            case "Filter Option":
                filterOptionsPage.clickOnFilterOption();
                break;
            case "Show Candidate":
                filterOptionsPage.clickOnShowCandidate();
                break;
            case "Search icon":
                searchPage.clickonSearchIcon();
                break;
            case "First Culture":
                filterOptionsPage.selectOtherCulture();
                break;
            case "First Development":
                filterOptionsPage.selectOtherDevelopment();
                break;
            case "First Well-Being":
                filterOptionsPage.selectOtherWellBeing();
                break;
            case "First Benefits":
                filterOptionsPage.selectOtherBenefits();
                break;
            case "Clear culture filter":
                filterOptionsPage.clickOnClearCulture();
                break;
            case "Clear development filter":
                filterOptionsPage.clickOnClearDevelopment();
                break;
            case "Clear well-being filter":
                filterOptionsPage.clickOnClearWellBeing();
                break;
            case "Clear benefits filter":
                filterOptionsPage.clickOnClearBenefits();
                break;
            case "Clear all filters":
                filterOptionsPage.clickOnClearAllFilterOption();
                break;
            case "Cancel":
                publishPage.clickOnCancelbtn();
                break;
            case "Register Now":
                loginPage.clickOnRegisterNowBtn();
                break;
            case "Edit my profile":
                myProfilePage.clickOnEditMyProfile();
                break;
            case "View my profile":
                myProfilePage.clickOnViewMyProfile();
                break;
            case "Edit job":
                dashboardPage.clickOnEditJob();
                break;
            case "Edit job listing":
                dashboardPage.clickOnEditJobListingMenu();
                break;
            case "Add a new job listing":
                dashboardPage.clickOnAddANewJobListingBtn();
                break;
            case "Next icon":
                dashboardPage.clickNextBtn();
                break;
            case "Previous icon":
                dashboardPage.clickPreviousBtn();
                break;
            case "Discover":
                discoverPage.clickOnDisCoverTab();
                break;
            case "Back":
                dashboardPage.clickBackBtn();
                break;
            case "Back button":
                editTileImagePage.clickOnBackBtn();
                break;
            case "Activate job":
                dashboardPage.clickActivateJob();
                break;
            case "Deactivate job":
                dashboardPage.clickDeactivateJob();
                break;
            case "Manage candidates":
                dashboardPage.clickManageCandidates();
                break;
            case "Date Posted":
                dashboardPage.clickDatePosted();
                break;
            case "Job Status":
                dashboardPage.clickJobStatus();
                break;
            case "Save Date Posted":
                dashboardPage.clickSaveDatePosted();
                break;
            case "Save Job Status":
                dashboardPage.clickSaveJobStatus();
                break;
            case "Alphabetical":
                dashboardPage.selectAlphabetical();
                break;
            case "Job inactive":
                dashboardPage.selectJobInactive();
                break;
            case "Show Password Icon":
                signUpPage.clickOnShowPasswordBtn();
                break;
            case "Sent reset link":
                loginPage.clickOnSentResetLink();
                break;
            case "Edit tile image":
                myProfilePage.clickOnEditTileImage();
                break;
            case "Edit culture":
                editTileImagePage.clickOnEditCulture();
                break;
            case "Close culture window":
                editTileImagePage.clickOnCloseButton();
                break;
            case "Development":
                filterOptionsPage.clickOnDevelopmentTab();
                break;
            case "HR":
                filterOptionsPage.clickOnHRTab();
                break;
            case "Skills & experience":
                filterOptionsPage.clickONSkillsAndExperienceTab();
                break;
            case "First Technical":
                filterOptionsPage.selectOtherTechnical();
                break;
            case "First Leadership":
                filterOptionsPage.selectOtherLeadership();
                break;
            case "First Sector":
                filterOptionsPage.selectOtherSectors();
                break;
            case "First Qualification":
                filterOptionsPage.selectOtherQualification();
                break;
            case "Clear technical filter":
                filterOptionsPage.clickOnClearTechnical();
                break;
            case "Clear leadership filter":
                filterOptionsPage.clickOnClearLeadership();
                break;
            case "Clear sectors filter":
                filterOptionsPage.clickOnClearSectors();
                break;
            case "Clear qualification filter":
                filterOptionsPage.clickOnClearQualification();
                break;
            case "Change image":
                editTileImagePage.clickOnChangeImage();
                break;
            case "Workstyle":
                filterOptionsPage.clickOnWorkstyletab();
                break;
            default:
                throw new IllegalStateException("Unexpected service name: " + expButton);
        }
    }
}
