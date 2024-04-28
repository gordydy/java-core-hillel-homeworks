package org.example.homework8.printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(9, false);
        System.out.println(printer.addToner(90));
        System.out.println("Count of pages to print: " + printer.printPages(7));
        System.out.println("Count of printed pages with duplex condition: " + printer.getPagesPrinted());
    }

}