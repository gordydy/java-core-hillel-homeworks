package org.example.homework4;

public class MinutesCalculator {
    public void printYearsAndDays(long minutes) {
        if (minutes > 0) {
            long years = minutes / (365 * 1440);
            long days = minutes / 1440 - 365 * years;
            System.out.println(minutes + " minutes = " + years + " y and " + days + " d");
        } else System.out.println("Invalid Value");
    }
}