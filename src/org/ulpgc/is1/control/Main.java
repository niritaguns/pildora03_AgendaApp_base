package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        // 1. Crear dos contactos Person
        Person john = new Person("John", "Doe", "123456789", "john.doe@example.com");
        john.setAddress(new Address("Main Street", "Anytown", "123", "Anycountry"));

        Person jane = new Person("Jane", "Doe", "987654321", "jane.doe@example.com");
        jane.setAddress(new Address("Other Street", "Othertown", "456", "Othercountry"));

        agenda.addPerson(john);
        agenda.addPerson(jane);

        // 2. Crear un grupo llamado "trabajo" y añadirlo a la agenda
        Group trabajoGroup = new Group("trabajo");
        agenda.addGroup(trabajoGroup);

        // 3. Añadir al grupo "trabajo" uno de los contactos creados (por ejemplo, el primero)
        Contact contactToAdd = agenda.getContactList().get(0);
        trabajoGroup.addContact(contactToAdd);

        // 4. Imprimir número de contactos de la agenda
        System.out.println("Número de contactos en la agenda: " + agenda.getContactList().size());

        // 5. Imprimir número de contactos del grupo "trabajo"
        System.out.println("Número de contactos en el grupo 'trabajo': " + trabajoGroup.getContacts().size());
    }
}
