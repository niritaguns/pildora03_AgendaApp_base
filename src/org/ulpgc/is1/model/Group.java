package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private final List<Contact> contacts = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // k) añadir y l) quitar contactos en el grupo
    public void addContact(Contact contact) {
        if (contact != null && !contacts.contains(contact)) {
            contacts.add(contact);
        }
    }

    public boolean removeContact(Contact contact) {
        return contacts.remove(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}
