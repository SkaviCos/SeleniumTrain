package bdd;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DemotestSecond {

    WebDriver wd;

    @Before
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    @After
    public void close(){

        wd.close();

    }
    @Test
    @Given("^пользователь открывает страницу$")
    public void testSec(){

        wd.get("https://coursehunters.net/course/komandnaya-stroka-instrumenty-testirovshchika");

    }


}
