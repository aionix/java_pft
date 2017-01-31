package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sergey on 31.01.2017.
 */
public class NavigationHelper {
    private WebDriver wd;

    public NavigationHelper(WebDriver wd) {
        this.wd = wd;
    }

    public void goToGroupsPage() {
        wd.findElement(By.partialLinkText("group")).click();
    }
}
