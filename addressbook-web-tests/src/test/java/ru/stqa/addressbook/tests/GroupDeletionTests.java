package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by Sergey on 31.01.2017.
 */
public class GroupDeletionTests extends TestBase {

    @Test
    void delGroup(){
        app.getSessionHelper().Login();
        app.getNavigationHelper().goToGroupsPage();
        app.getGroupHelper().deleteOneFirstGroup();
    }
}
