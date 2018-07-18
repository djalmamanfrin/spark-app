package com.spark.services;

import com.spark.beans.Contact;
import java.util.Collection;

public interface ContactService {
    public void insertContact(Contact contact);
    public Collection<Contact> getContacts();
    public Contact getContact(String id);
}
