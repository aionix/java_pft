package ru.stqa.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import static com.sun.corba.se.spi.activation.IIOP_CLEAR_TEXT.value;

/**
 * Created by Sergey on 31.01.2017.
 */
public class BaseClass {
    WebDriver wd;
    WebDriverWait wait;

    @BeforeClass
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        wd = new ChromeDriver();
        wait = new WebDriverWait(wd, 10);
    }

    @BeforeMethod
    public void startBrowser() {
        wd.get("http://localhost/addressbook/");
    }
    @AfterMethod
    public void closeBrowser(){
        wd.quit();
    }

    public void Login() {
        wd.findElement(By.name("user")).sendKeys("admin");
        wd.findElement(By.name("pass")).sendKeys("secret");
        wd.findElement(By.xpath("//*[@value='Login']")).click();
    }

    public void returnToGroupsPage() {
        wd.findElement(By.partialLinkText("group")).click();
    }

    public void newGroup() {
        wd.findElement(By.xpath("*//input[1][@value='New group']")).click();
    }
    public void submitGroupCreation() {
        wd.findElement(By.cssSelector("input[name='submit']")).click();
    }

    public void fillGroupForm(GroupData groupData){
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    public void getListOfGroups(){
        List<WebElement> groups;
        groups = wd.findElements(By.className("group"));
        for(WebElement m : groups){System.out.println(m.getText());}
        System.out.println(groups.get(0).getAttribute("value"));   //почему-то возвращает null а get text  все ок
    }

}


