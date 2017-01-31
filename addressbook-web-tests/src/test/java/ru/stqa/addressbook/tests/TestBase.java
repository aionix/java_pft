package ru.stqa.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import ru.stqa.addressbook.appmanager.ApplicationManager;

/**
 * Created by Sergey on 31.01.2017.
 */
public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp() {
        app.init();
    }

    @AfterMethod
    public void tearDown(){
        app.stop();
    }

}


