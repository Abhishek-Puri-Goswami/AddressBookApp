package com.addressbook.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class AddressBook {

    private String name;
    private List<Contact> contacts;

    public AddressBook(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }
}