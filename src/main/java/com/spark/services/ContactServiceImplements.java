package com.spark.services;

import com.spark.beans.Contact;

import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

public class ContactServiceImplements implements ContactService {
    private HashMap<String, Contact> db;

    public ContactServiceImplements() {
        this.db = new HashMap<>();
    }

    @Override
    public void insertContact(Contact contact) {
        contact.setId(UUID.randomUUID().toString());
        this.db.put(contact.getId(), contact);
    }

    @Override
    public Collection<Contact> getContacts() {
        return this.db.values();
    }

    @Override
    public Contact getContact(String id) {
        return this.db.get(id);
    }
}
