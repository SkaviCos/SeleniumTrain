package ru.stqa.pft.contact;

import org.junit.Ignore;
import org.junit.Test;
import ru.stqa.pft.addressbook.tests.TestBase;
import ru.stqa.pft.contact.model.ContactData;

public class ContactTestCreate extends TestBase {

    @Ignore
    @Test
    public void testContactCreation() {
        app.getContactHelper().goToContactPage();
        app.getContactHelper().createContact(new ContactData("jkjkjkj","huhuhu","gdgdgd","bcbcc"));
        app.getContactHelper().submitContact();
    }


}
