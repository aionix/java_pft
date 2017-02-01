package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Sergey on 31.01.2017.
 */
public class ApplicationManager {
    WebDriver wd;
    WebDriverWait wait;
    private GroupHelper groupHelper;
    private NavigationHelper navigationHelper;
    private SessionHelper sessionHelper;


    public void init() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        wd = new ChromeDriver();
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
