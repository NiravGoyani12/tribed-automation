package com.tribed.pages;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CultureDetailPage extends DriverManager {


    @FindBy(xpath="//img[contains(@src,'add-culture')]")
    public  WebElement addToCultureImg;

    @FindBy(xpath="//img[contains(@src,'casual-dress')]")
    public  WebElement casualDress;







}
