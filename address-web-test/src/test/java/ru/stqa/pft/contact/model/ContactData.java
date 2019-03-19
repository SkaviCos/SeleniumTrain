package ru.stqa.pft.contact.model;

import java.io.File;

public class ContactData {
    public ContactData withFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public ContactData withMiddlename(String middlename) {
        this.middlename = middlename;
        return this;
    }

    public ContactData withLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public ContactData withtNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    private String firstname;
    private String middlename;
    private String lastname;
    private String nickname;

    public File getPhoto() {
        return photo;
    }

    public ContactData setPhoto(File photo) {
        this.photo = photo;
        return this;
    }

    private File photo;

//    public ContactData(String firstname, String middlename, String lastname, String nickname) {
//        this.firstname = firstname;
//        this.middlename = middlename;
//        this.lastname = lastname;
//        this.nickname = nickname;
//    }

//    public ContactData(String firstname) {
//        this.firstname = firstname;
//    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }
}


