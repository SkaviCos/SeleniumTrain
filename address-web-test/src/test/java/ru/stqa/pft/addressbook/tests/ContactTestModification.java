package ru.stqa.pft.addressbook.tests;

import org.junit.Ignore;
import org.junit.Test;
import ru.stqa.pft.addressbook.tests.TestBase;
import ru.stqa.pft.contact.model.ContactData;

public class ContactTestModification extends TestBase {
    @Ignore
    @Test
    public void testContactModification(){
        app.getContactHelper().homePage();
        app.group().selectedElement(9);
        app.getContactHelper().editContact();
//        app.getContactHelper().createContact(new ContactData("tyty"));
        app.getContactHelper().submitContact();
    }
}
