package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.LoginParam;

public class SessionHelper extends ApplicationHelper {

    public SessionHelper(WebDriver wd) {

        super(wd);
    }

    public void login(LoginParam loginParam) {
        type(By.name("user"), loginParam.getUsername());
        type(By.name("pass"), loginParam.getPassword());
        click(By.xpath("//form[@id='LoginForm']/input[3]"));

    }

}
