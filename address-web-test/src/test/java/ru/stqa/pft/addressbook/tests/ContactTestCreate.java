package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.contact.model.ContactData;

public class ContactTestCreate extends TestBase {


    @Test
    public void testContactCreation() {
        app.getContactHelper().goToContactPage();
        app.getContactHelper().createContact(new ContactData().withtNickname("")
                .withMiddlename("").withLastname("").withtNickname(""));
        app.getContactHelper().submitContact();
    }


}
