package ru.stqa.pft.addressbook.generator;

import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.contact.model.ContactData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class ContactDataGenerator {

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(args[0]);
        File file = new File(args[1]);

        List<ContactData> contacts = generateContact(count);
        saveContact(contacts, file);
    }

    private static void saveContact(List<ContactData> contacts, File file) throws IOException {
        System.out.println(new File(".").getAbsolutePath());
        Writer writer = new FileWriter(file);
        for(ContactData contact : contacts)
            writer.write(String.format("%s;%s;%s\n", contact.getFirstname(), contact.getMiddlename(), contact.getLastname()));
        writer.close();
    }

    private static List<ContactData> generateContact(int count) {
        List<ContactData> contacts = new ArrayList<>();
        for(int i = 0; i<count;i++){
            contacts.add(new ContactData().withFirstname(String.format("test %s", i)).withMiddlename(String.format("test %s", i)).withLastname(String.format("test %s", i)));
        }
        return contacts;
    }
}
