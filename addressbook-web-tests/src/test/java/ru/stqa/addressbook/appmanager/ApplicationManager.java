package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import sun.plugin2.util.BrowserType;

/**
 * Created by Sergey on 31.01.2017.
 */
public class ApplicationManager {
    WebDriver wd;
    WebDriverWait wait;
    int Browser = BrowserType.INTERNET_EXPLORER;
    private GroupHelper groupHelper;
    private NavigationHelper navigationHelper;
    private SessionHelper sessionHelper;

    public void init() {
        // System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");

        if (Browser==(BrowserType.INTERNET_EXPLORER)) {
            wd = new InternetExplorerDriver();
        } else if (Browser==(BrowserType.MOZILLA)) {
            wd = new FirefoxDriver();
        } else {
            wd = new ChromeDriver();
        }
        wait = new WebDriverWait(wd, 10);
        groupHelper = new GroupHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);

        wd.get("http://localhost/addressbook/");
    }

    @BeforeMethod
    public void startBrowser() {
    }

    public void closeBrowser() {
        wd.quit();
    }

    //  Getters for helpers
    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }
}
