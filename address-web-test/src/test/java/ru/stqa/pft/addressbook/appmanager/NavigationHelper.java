package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends ApplicationHelper {


    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void groupPage() {
        if (isElementPresent(By.tagName("h1"))//для проверки нахождения на данной странице.
                && wd.findElement(By.tagName("h1")).getText().equals("Groups")//если находится на странице с данными атрибутами то данный метод завершает действие
                && isElementPresent(By.name("new"))) {
            return;
        }
        click(By.linkText("groups"));

    }


}
