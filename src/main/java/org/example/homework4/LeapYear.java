package org.example.homework4;

public class LeapYear {
    public boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}