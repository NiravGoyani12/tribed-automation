package com.tribed.pages.myProfile;

import com.tribed.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PublishPage extends DriverManager {

    @FindBy(xpath="//h2[text()='Congratulations!']")
    public WebElement publishSuccessMsg;

    public String getPublishSuccessMsg() {
        return getElementText(publishSuccessMsg);
    }
}
