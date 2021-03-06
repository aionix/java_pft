package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.addressbook.model.GroupData;

import java.util.List;

/**
 * Created by Sergey on 31.01.2017.
 */
public class GroupHelper extends HelperBase {
    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void newGroup() {
        click(By.xpath("*//input[1][@value='New group']"));
    }

    public void submitGroupCreation() {
        click(By.cssSelector("input[name='submit']"));
    }

    public void fillGroupForm(GroupData groupData) {
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    public void getListOfGroups() {
        List<WebElement> groups;
        groups = wd.findElements(By.className("group"));
        for (WebElement m : groups) {
            System.out.println(m.getText());
        }
        System.out.println(groups.get(0).getAttribute("value"));   //почему-то возвращает null а get text  все ок
    }

    public void deleteOneFirstGroup() {
        wd.findElement(By.xpath(".//span[1]")).click();
        wd.findElement(By.xpath("//input[5][@name='delete']")).click();
    }
}
