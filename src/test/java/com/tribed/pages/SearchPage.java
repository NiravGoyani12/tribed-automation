package com.tribed.pages;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.tribed.utilities.CommonUtils.*;

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
    public   WebElement companyTitle;




}
