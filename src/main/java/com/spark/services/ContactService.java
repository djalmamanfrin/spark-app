package com.spark.services;

import com.spark.beans.Contact;
import java.util.Collection;

public interface ContactService {
    void insertContact(Contact contact);
    Collection<Contact> getContacts();
    Contact getContact(String id);
    Contact editContact(Contact contact);
    Contact deleteContact(String id);
}
