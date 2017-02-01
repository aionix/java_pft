package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sergey on 31.01.2017.
 */
public class SessionHelper extends HelperBase {

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void Login() {
        wd.findElement(By.name("user")).sendKeys("admin");
        wd.findElement(By.name("pass")).sendKeys("secret");
        click(By.xpath("//*[@value='Login']"));
    }

}

