package com.tribed.driver;

import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverManager {

    public static WebDriver driver;
    public static Logger log = Logger.getLogger(DriverManager.class);
    public static String testDataPropertyFile = "testData.properties";
    private String browser = "chrome";


    public DriverManager() {
        PageFactory.initElements(driver, this);
    }

    public void openBrowser() {
        switch (browser) {
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                log.info(" Launched Internet Exploer Instance !!!");
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                log.info("Launched Chrome Instance");

                break;
            default:
                driver = new FirefoxDriver();
        }
    }

    public void maxBroser() {
        driver.manage().window().maximize();
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void closeBrowser() {
        driver.quit();
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void applyImplicit() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void waitForElementVisibility(WebElement element, int timeout, String failureMessage)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.withMessage(failureMessage);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
/*
    public void waitForElementInvisibility(WebElement element, int timeout, String failureMessage)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.withMessage(failureMessage);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void scrollIntoViewSelenium(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        sleep(500);
    }*/

    public void takeSceenShot(Scenario scenario) {
        byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenShot, "image/png");
    }

    public  void clickOnElement(WebElement e){
        e.click();
    }

    public  void MoveOnElement(WebElement e){
        Actions builder = new Actions(driver);
        builder.moveToElement(e).perform();

    }

    public  void sendKeys(WebElement e, String text){
        e.sendKeys(text);
    }

    public String getElementText(WebElement e){
        return e.getText();
    }
}