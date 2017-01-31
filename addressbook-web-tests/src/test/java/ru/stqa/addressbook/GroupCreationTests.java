package ru.stqa.addressbook;

import org.testng.annotations.Test;

/**
 * Created by Sergey on 31.01.2017.
 */
public class GroupCreationTests extends BaseClass {

    @Test
    public void createGroup(){
        Login();
        returnToGroupsPage();
//        newGroup();
//        fillGroupForm(new GroupData("gr name1", "header1", "footer1"));
//        submitGroupCreation();
//        returnToGroupsPage();
        getListOfGroups();



    }
}
