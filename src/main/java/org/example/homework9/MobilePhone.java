package org.example.homework9;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact userContact) {
        if (!myContacts.contains(userContact)) {
            myContacts.add(userContact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int indexOfOldContact = findContact(oldContact);
        if (indexOfOldContact == -1) {
            return false;
        }
        myContacts.set(indexOfOldContact, newContact);
        return true;
    }

    public boolean removeContact(Contact contactToRemove) {
        if (myContacts.contains(contactToRemove)) {
            myContacts.remove(contactToRemove);
            return true;
        }
        return false;
    }

    public int findContact(Contact contactToFind) {
        return myContacts.indexOf(contactToFind);
    }

    public int findContact(String name) {
        for (Contact contact : myContacts)
            if (name.equalsIgnoreCase(contact.getName())) {
                return myContacts.indexOf(contact);
            }
        return -1;
    }

    public Contact queryContact(String name) {
        int indexOfContact = findContact(name);
        if (indexOfContact == -1) {
            return null;
        }
        return myContacts.get(indexOfContact);
    }

    public void printContacts() {
        for (Contact contact : myContacts) {
            System.out.println(contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }

}