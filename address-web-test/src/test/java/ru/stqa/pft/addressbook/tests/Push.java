package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.contact.model.ContactData;

public class Push extends TestBase {
    @Test
    public void testContactCreation() {

        app.getContactHelper().goToContactPage();
        app.getContactHelper().createContact(new ContactData().withFirstname("bcbcc")
                .withLastname("gdgdgd").withMiddlename("huhuhu").withtNickname("jkjkjkj"));
        app.getContactHelper().submitContact();
    }
}
