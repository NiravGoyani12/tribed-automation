package com.tribed.pages.home;
import com.tribed.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterPage extends DriverManager {


    @FindBy(xpath="(//img[contains(@src,'/static/media/logo')])")
    public  WebElement tribedIcon;

    @FindBy(xpath="//h1[text()='Discover companies']")
    public  WebElement titleDiscoverCompanies;

    @FindBy(xpath="//p[text()='© 2021 yolba Ltd.']")
    public  WebElement copyRight;


    public void clickOntribedIcon() {
        waitForElementVisibility(tribedIcon,3,"Icon is not visible");
        clickOnElement(tribedIcon);
    }

    public boolean isHomePageOpen()
    {
        return titleDiscoverCompanies.isDisplayed();
    }
    public boolean isCopyrightSentenceDisplayed()
    {
        return copyRight.isDisplayed();
    }
}
