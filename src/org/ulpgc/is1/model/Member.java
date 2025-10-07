package org.ulpgc.is1.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Member {
    private Contact contact;
    private Group group;
    private LocalDateTime date;

    public Member(Contact contact, Group group) {
        this.contact = contact;
        this.group = group;
        this.date = LocalDateTime.now(); // guarda la fecha actual al crearse
    }

    public Contact getContact() {
        return contact;
    }

    public Group getGroup() {
        return group;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getFormattedDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(formatter);
    }
}

