package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by Sergey on 31.01.2017.
 */
public class GroupDeletionTests extends TestBase {

    @Test
    void delGroup(){
        app.Login();
        app.getNavigationHelper().goToGroupsPage();
        app.getGroupHelper().deleteOneGroup();
    }
}
