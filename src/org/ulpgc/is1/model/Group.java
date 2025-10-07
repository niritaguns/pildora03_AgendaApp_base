package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Contact> contacts;

    public Group(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }
}
