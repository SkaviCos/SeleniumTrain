package ru.stqa.pft.addressbook.generator;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import ru.stqa.pft.contact.model.ContactData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class ContactDataGenerator {

    @Parameter(names = "-c", description = "Contact count")
    public int count;

    @Parameter(names = "-f", description = "Target file")
    public String file;

    public static void main(String[] args) throws IOException {
        ContactDataGenerator contactDataGenerator = new ContactDataGenerator();
        JCommander jCommander = new JCommander(contactDataGenerator);

        try {
            jCommander.parse(args);
        } catch (ParameterException ex) {
            jCommander.usage();
            return;
        }
        contactDataGenerator.runContact();

    }

    public void runContact() throws IOException {
        List<ContactData> contacts = generateContact(count);
        saveContact(contacts, new File(file));
    }

    private void saveContact(List<ContactData> contacts, File file) throws IOException {
        System.out.println(new File(".").getAbsolutePath());
        Writer writer = new FileWriter(file);
        for (ContactData contact : contacts)
            writer.write(String.format("%s;%s;%s\n", contact.getFirstname(), contact.getMiddlename(), contact.getLastname()));
        writer.close();
    }

    private List<ContactData> generateContact(int count) {
        List<ContactData> contacts = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            contacts.add(new ContactData().withFirstname(String.format("test %s", i)).withMiddlename(String.format("test %s", i)).withLastname(String.format("test %s", i)));
        }
        return contacts;
    }
}
