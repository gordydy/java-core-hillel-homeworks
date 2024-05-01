package org.example.homework9;

public class Main {
    public static void main(String[] args) {
        MobilePhone test1 = new MobilePhone("+380970345789");
        Contact dmytro = new Contact("Dmytro", "+380501111234");
        Contact vasyl = new Contact("Vasyl", "+380501156734");
        Contact oleg = new Contact("Oleg", "+380786590449");
        Contact irina = new Contact("Irina", "+380500032234");

        System.out.println("Add new contacts: " + dmytro.getName() + " and " + vasyl.getName());
        test1.addNewContact(dmytro);
        test1.addNewContact(vasyl);
        test1.printContacts();
        System.out.println("*".repeat(35));

        System.out.println("Add new contact " + irina.getName() + " and get result: " + test1.addNewContact(irina));
        test1.printContacts();
        System.out.println("*".repeat(35));

        System.out.println("Remove " + dmytro.getName() + " and get result: " + test1.removeContact(dmytro));
        System.out.println("Add contact " + irina.getName() + " and get result: " + test1.addNewContact(irina));
        test1.printContacts();
        System.out.println("*".repeat(35));

        System.out.println("Update " + vasyl.getName() + " to the " + dmytro.getName() + " " + test1.updateContact(vasyl, dmytro));
        test1.printContacts();
        System.out.println("Update " + oleg.getName() + " to the " + vasyl.getName() + " " + test1.updateContact(oleg, dmytro));
        test1.printContacts();
        System.out.println("*".repeat(35));

        test1.printContacts();
        System.out.println("Find index by Contact class for " + irina.getName() + " = " + test1.findContact(irina));
        System.out.println("Find index by String name " + dmytro.getName() + " = " + test1.findContact("dmytro"));
        System.out.println("Find index by Contact class for " + oleg.getName() + " = " + test1.findContact(oleg));
        System.out.println("Find index by String name " + vasyl.getName() + " = " + test1.findContact("vasyl"));
        System.out.println("*".repeat(35));

        System.out.println("Query method with String value: " + irina.getName() + " return \n" + test1.queryContact("Irina"));
        System.out.println("*".repeat(35));

        System.out.println("Create contact by createContact method \n" + Contact.createContact("Max", "+380588432976"));

    }
}