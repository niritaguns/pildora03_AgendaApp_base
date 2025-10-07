package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contact> contacts;
    private List<Group> groups;
    private List<Member> members;

    public Agenda() {
        this.contacts = new ArrayList<>();
        this.groups = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addPerson(Person p) {
        contacts.add(p);
    }

    public void addCompany(Company c) {
        contacts.add(c);
    }

    public void addGroup(Group g) {
        groups.add(g);
    }

    public List<Contact> getContactList() {
        return contacts;
    }

    public List<Group> getGroupList() {
        return groups;
    }

    public void addMember2Group(Contact c, Group g) {
        g.addContact(c);  // añadimos el contacto al grupo
        Member m = new Member(c, g);
        members.add(m);
        System.out.println("Contacto añadido al grupo el " + m.getFormattedDate());
    }

    public Member getMember(Contact c, Group g) {
        for (Member m : members) {
            if (m.getContact().equals(c) && m.getGroup().equals(g)) {
                return m;
            }
        }
        return null;
    }
}