package org.example.homework4;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        System.out.println(leapYear.isLeapYear(1900));
        System.out.println("*****");

        MinutesCalculator calculator = new MinutesCalculator();
        calculator.printYearsAndDays(561600);
        System.out.println("*****");

        ProductCostCalculator costCalculator = new ProductCostCalculator();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double unitPrice = 10.0;
        int quantity = 55;
        double totalCost = costCalculator.calculateTotalCost(unitPrice, quantity);
        System.out.println("Total cost of the product: " + decimalFormat.format(totalCost));
    }

}