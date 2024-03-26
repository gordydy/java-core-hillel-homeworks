package org.example.homework4;


public class ProductCostCalculator {

    public double calculateTotalCost(double unitPrice, int quantity) {
        double discountRate = getDiscount(quantity);
        double totalPrice = quantity * unitPrice;
        double discount = totalPrice * (discountRate / 100);
        return totalPrice - discount;
    }

    public double getDiscount(int quantity) {
        if (quantity <= 10) {
            return 0.0;
        } else if (quantity <= 20) {
            return 5.0;
        } else if (quantity <= 30) {
            return 10.0;
        } else if (quantity <= 40) {
            return 12.0;
        } else if (quantity <= 50) {
            return 12.4;
        } else if (quantity <= 60) {
            return 12.8;
        } else if (quantity <= 70) {
            return 13.2;
        } else if (quantity <= 80) {
            return 13.6;
        } else {
            return 13.0;
        }
    }
}