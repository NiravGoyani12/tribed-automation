package com.tribed.driver;

import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.Robot;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    public static WebDriver driver;
    public static Logger log = Logger.getLogger(DriverManager.class);
    public static String testDataPropertyFile = "testData.properties";
    private String browser = "chrome";

    String username = System.getenv("qateam185");
    String accessKey = System.getenv("U43eLsDGGubF1ioXzTfQ");

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

    public void runHeadless() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        log.info("Launched Chrome Instance");
    }

    public void runOnRemoteHost() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("os", "Windows");
        capabilities.setCapability("os_version", "10");
        capabilities.setCapability("browser", "Chrome");
        capabilities.setCapability("browser_version", "latest");
        driver = new RemoteWebDriver(new URL("https://" + username + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), capabilities);

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

    public String getCurrentUrl() {
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

    public void waitForElementVisibility(WebElement element, int timeout, String failureMessage) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.withMessage(failureMessage);
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void waitForElementClickable(WebElement element, int timeout, String failureMessage) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.withMessage(failureMessage);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Thread.sleep(2000);
    }

    public void scrollIntoViewSelenium(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        sleep(500);
    }

    public void scrollWindow() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(150,100)", "");
        sleep(500);
    }

    public void takeSceenShot(Scenario scenario) {
        byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenShot, "image/png");
    }

    public void clickOnElement(WebElement e) {
        e.click();
    }

    public void moveOnElement(WebElement e) {
        Actions action = new Actions(driver);
        action.moveToElement(e).build().perform();
        //action.moveToElement(we).moveToElement(driver.findElement(By.xpath("/expression-here"))).click().build().perform();

    }

    public void clearAndSendKeys(WebElement e, String text) {
        e.clear();
        e.sendKeys(text);
    }

    public void SendKeys(WebElement e, String text) {
        e.clear();
        e.sendKeys(text);
    }

    public void uploadFile(String image) throws AWTException, InterruptedException {

        Robot robot = new Robot();
        robot.delay(300);
        Thread.sleep(2000);
        String currentDir = System.getProperty("user.dir");
        String Path=currentDir+"\\src\\test\\resources\\Images\\"+image;
        StringSelection str = new StringSelection(Path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
    }

    public String getElementText(WebElement e) {
        return e.getText();
    }
}
