package ru.stqa.pft.litecart;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class demotest {
    //FirefoxDriver wd;
    ChromeDriver wd;
    @Before
    public void setUp() throws Exception {
        //wd = new FirefoxDriver();
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void demotest() {
        wd.get("http://localhost/litecart/admin/login.php?redirect_url=%2Flitecart%2Fadmin%2F%3Fapp%3Dcountries%26doc%3Dcountries");
        wd.findElement(By.name("password")).click();
        wd.findElement(By.name("password")).clear();
        wd.findElement(By.name("password")).sendKeys("admin");
        wd.findElement(By.name("username")).click();
        wd.findElement(By.name("username")).clear();
        wd.findElement(By.name("username")).sendKeys("admin");
        wd.findElement(By.name("login")).click();
        alphabetic();
    }

    public void alphabetic() {
        List<String> alphabet = new ArrayList<>();
        for (int i = 2; i < 240; i++) {
            String s = wd.findElement(By.xpath("//*[@id='content']/form/table/tbody/tr[" + i + "]/td[5]/a")).getAttribute("text");
            alphabet.add(s);
        }
        //for(String k : alphabet){
        //  System.out.println(k);
        //}

        System.out.println(alphabet.size());
        List<String> alpha = new ArrayList<>(alphabet);

        Collections.sort(alpha);
        //for (String h : alphabet) {
        //  alpha.add(h);
        //}
        assertEquals(alphabet, alpha);
    }

    @After
    public void tearDown() {
        wd.quit();
    }

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
