package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.addressbook.model.GroupData;

/**
 * Created by Sergey on 31.01.2017.
 */
public class GroupCreationTests extends TestBase {

    @Test
    public void createGroup(){
        app.getSessionHelper().Login();
        app.getNavigationHelper().goToGroupsPage();
        app.getGroupHelper().newGroup();
        app.getGroupHelper().fillGroupForm(new GroupData("group_name1", "header1", "footer1"));
        app.getGroupHelper().submitGroupCreation();
        app.getNavigationHelper().goToGroupsPage();
        app.getGroupHelper().getListOfGroups();
    }

}
