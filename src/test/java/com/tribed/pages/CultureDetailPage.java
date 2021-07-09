package com.tribed.pages;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CultureDetailPage extends DriverManager {


    @FindBy(xpath="//img[contains(@src,'add-culture')]")
    public  WebElement addToCultureImg;

    @FindBy(xpath="//img[contains(@src,'casual-dress')]")
    public  WebElement casualDressTile;

    @FindBy(xpath="//button[text()='Save and exit']")
    public  WebElement saveAndExitBtn;

    @FindBy(xpath="//img[contains(@src,'add-development')]")
    public  WebElement addDevlopmentImg;

    @FindBy(xpath="//img[contains(@src,'technical-training-programme')]")
    public  WebElement ttpTile;

    @FindBy(xpath="//img[contains(@src,'add-wellbeing')]")
    public  WebElement addWellbeingImg;

    @FindBy(xpath="//img[contains(@src,'gym-access')]")
    public  WebElement gymAccessTile;

    @FindBy(xpath="//img[contains(@src,'add-benefits')]")
    public  WebElement addBenefitsImg;

    @FindBy(xpath="//img[contains(@src,'dental-benefits')]")
    public  WebElement dentalBenifitsile;

}
