package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contact> contacts;
    private List<Group> groups;

    public Agenda() {
        this.contacts = new ArrayList<>();
        this.groups = new ArrayList<>();
    }

    public void addPerson(Person person) {
        contacts.add(person);
    }

    public void addCompany(Company company) {
        contacts.add(company);
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public List<Contact> getContactList() {
        return contacts;
    }

    public List<Group> getGroupList() {
        return groups;
    }

    public void addContact2Group(Contact contact, Group group) {
        group.addContact(contact);
    }
}

