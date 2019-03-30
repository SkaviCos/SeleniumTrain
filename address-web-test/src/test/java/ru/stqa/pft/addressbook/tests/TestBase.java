package ru.stqa.pft.addressbook.tests;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.remote.BrowserType;
import ru.stqa.pft.addressbook.appmanager.ApplicatioMananger;


public class TestBase {

    protected final static ApplicatioMananger app = new ApplicatioMananger(BrowserType.CHROME);

    @Before
    public void setUp() throws Exception {
        app.init();
    }

    @After
    public void tearDown() {
        app.stop();
    }

    public ApplicatioMananger getApp() {
        return app;
    }
}
