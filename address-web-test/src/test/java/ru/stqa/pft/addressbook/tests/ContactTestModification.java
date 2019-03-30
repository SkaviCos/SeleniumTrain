package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactTestModification extends TestBase {

    @Test
    public void testContactModification() {
        app.getContactHelper().homePage();
        app.group().selectedElement(9);
        app.getContactHelper().editContact();
//        app.getContactHelper().createContact(new ContactData("tyty"));
        app.getContactHelper().submitContact();
    }
}
