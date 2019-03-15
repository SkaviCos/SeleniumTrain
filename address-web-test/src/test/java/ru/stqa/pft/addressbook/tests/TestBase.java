package ru.stqa.pft.addressbook.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.BrowserType;
import ru.stqa.pft.addressbook.appmanager.ApplicatioMananger;


public class TestBase {

    protected static ApplicatioMananger app = new ApplicatioMananger(BrowserType.FIREFOX);

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