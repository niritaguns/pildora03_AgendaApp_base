package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agenda {
    // e) composiciones/agregaciones con List (ArrayList)
    private final List<Contact> contactList = new ArrayList<>();
    private final List<Group> groupList = new ArrayList<>();

    // g) Constructores (aquí no necesitamos args)
    public Agenda() {}

    // a–c–j–k) API de Agenda
    public Person addPerson(String firstName, String lastName,
                            String telephone, String email,
                            String street, int number, int floor, String city) {
        Person p = new Person(firstName, lastName, telephone, email);
        p.setAddress(new Address(street, number, floor, city));
        contactList.add(p);
        return p;
    }

    public Company addCompany(String name, String description,
                              String telephone, String email,
                              String street, int number, int floor, String city) {
        Company c = new Company(name, description, telephone, email);
        c.setAddress(new Address(street, number, floor, city));
        contactList.add(c);
        return c;
    }

    public Group addGroup(String name) {
        Group g = new Group(name);
        groupList.add(g);
        return g;
    }

    // d) getters de las colecciones (lectura)
    public List<Contact> getContactList() {
        return Collections.unmodifiableList(contactList);
    }

    public List<Group> getGroupList() {
        return Collections.unmodifiableList(groupList);
    }

    // l) eliminar de agenda (opcional)
    public boolean removeContact(Contact c) { return contactList.remove(c); }
    public boolean removeGroup(Group g) { return groupList.remove(g); }
}
