package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import java.security.acl.Group;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GroupHelper extends ApplicationHelper {

    public GroupHelper(WebDriver wd) {
        super(wd);

    }

    public void returnToGroupPage() {
        click(By.linkText("groups"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
//        type();
    }

    public void submitGroupCreation(String submit) {
        click(By.name(submit));
    }

    public void initGroupPage(String s) {
        click(By.name(s));
    }

    public void selectedElement(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();
    }

    public void selectedElementById(int id) {
        wd.findElement(By.cssSelector("input[value='"+ id +"']")).click();
    }

    public void deleteSomeGroup() {
        click(By.name("delete"));
    }

    public void editGroup() {
        click(By.xpath("//*[@id='content']/form/input[6]"));
    }

    public void updateGroup() {
        click(By.xpath("//*[@id='content']/form/input[3]"));
    }


    public void create(GroupData group) {//новый оптимизированный метод для создания группы
        initGroupPage("new");
        fillGroupForm(group);
        submitGroupCreation("submit");
        groupCache = null;
        returnToGroupPage();

    }

    public void modify(GroupData group) {
        selectedElementById(group.getId());
        editGroup();
        fillGroupForm(group);
        updateGroup();
        groupCache = null;
        returnToGroupPage();
    }



    public void delete(GroupData group) {
        selectedElementById(group.getId());
        deleteSomeGroup();
        groupCache = null;
        returnToGroupPage();
    }

    public boolean isThereAGroup() {//новый метод для проверки есть ли данный элемент на странице
        return isElementPresent(By.name("selected[]"));
    }

    public int getGroupCount() {
       return wd.findElements(By.name("selected[]")).size();
    }

    public List<GroupData> list() {
        List<GroupData> groups = new ArrayList<>();
        List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
        for(WebElement element : elements){
            String name = element.getText();
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            groups.add(new GroupData().withId(id).withName(name));
        }
        return groups;
    }
    private Groups groupCache = null;

    public Groups all() {
        if (groupCache != null)return new Groups(groupCache);
      groupCache = new Groups();
        List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
        for(WebElement element : elements){
            String name = element.getText();
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            groupCache.add(new GroupData().withId(id).withName(name));
        }
        return new Groups(groupCache);
    }
}
