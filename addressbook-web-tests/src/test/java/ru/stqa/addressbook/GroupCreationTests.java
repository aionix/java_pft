package ru.stqa.addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Sergey on 30.01.2017.
 */
public class GroupCreationTests {
   // public Webdriver driver;

    @BeforeMethod
    public void starter(){
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");

    }
    @Test
    public void someTest(){
     //   driver.get();

    }
}
