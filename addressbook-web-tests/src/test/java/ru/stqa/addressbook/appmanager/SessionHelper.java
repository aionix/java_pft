package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sergey on 31.01.2017.
 */
public class SessionHelper {
    private WebDriver wd;

    public SessionHelper(WebDriver wd) {
        this.wd = wd;
    }

    public void Login() {
        wd.findElement(By.name("user")).sendKeys("admin");
        wd.findElement(By.name("pass")).sendKeys("secret");
        wd.findElement(By.xpath("//*[@value='Login']")).click();
    }

}

