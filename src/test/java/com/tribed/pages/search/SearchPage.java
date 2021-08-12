package com.tribed.pages.search;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends DriverManager {

    @FindBy(name = "email")
    public   WebElement emmailField;

    @FindBy(xpath = "//input[@placeholder='Search for a key skill']")
    public   WebElement searchBox;

    @FindBy(xpath = "//img[contains(@src,'SearchIcon')]")
    public   WebElement searchIcon;

    @FindBy(xpath = "(//button[text()='See full profile'])[1]")
    public   WebElement seeFullProfilebtn;

    @FindBy(xpath = "(//div[contains(@class,'CandidateCard__CardTitle')])[1]")
    public   WebElement CandidateName;

    @FindBy(xpath = "//span[text()='Filter options']")
    public   WebElement filterOption;

    public static String cname;

    public void enterSearchText(String SearchText)
    {
        clearAndSendKeys(searchBox,SearchText);
    }
    public void clickonSearchIcon()
    {
        clickOnElement(searchIcon);
    }

    public boolean isFilterOptionsDisplayed()
    {
        return filterOption.isDisplayed();
    }
    public boolean isSeeFullProfileDisplayed()
    {
        return seeFullProfilebtn.isDisplayed();
    }

    public void clickOnSeeFullProfile()
    {
        cname=getElementText(CandidateName);
        clickOnElement(seeFullProfilebtn);
    }
    public boolean isSelectedUserFullProfileDisplayed()
    {
        try{
            WebElement element= driver.findElement(By.xpath("//h1[text()='"+cname+"']"));
            return element.isDisplayed();
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
