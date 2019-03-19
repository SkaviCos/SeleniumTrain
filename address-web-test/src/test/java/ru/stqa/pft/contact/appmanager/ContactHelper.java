package ru.stqa.pft.contact.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.pft.addressbook.appmanager.ApplicationHelper;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.contact.model.ContactData;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends ApplicationHelper {


    public ContactHelper(WebDriver wd) {

        super(wd);
    }

    public void createContact(ContactData contactData) {
        type(By.name("firstname"),contactData.getFirstname());
        type(By.name("middlename"),contactData.getMiddlename());
        type(By.name("lastname"),contactData.getLastname());
//        type(By.name("nickname"),contactData.getNickname());
        type(By.xpath(".//input[@name = \"nickname\"]"),contactData.getNickname());
    }

    public void submitContact() {
        click(By.xpath("//div[@id='content']/form/input[21]"));

    }

    public void goToContactPage() {
        click(By.xpath("//div[@id='nav']//a[.='add new']"));

    }
    public void editContact(){
        click(By.xpath("//*[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
    }
    public void homePage(){
        click(By.xpath("//*[@id='nav']/ul/li[1]/a"));
    }
    public void push(){
        String s = wd.findElement(By.id("7")).getAttribute("text");
        System.out.println(s);
    }

    public List<GroupData> list() {
        List<GroupData> groups = new ArrayList<>();
        List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
        for(WebElement element : elements){
            String elem = element.getText();
            groups.add(new GroupData().withId(9).withName(elem));
        }
        return groups;
    }
}
