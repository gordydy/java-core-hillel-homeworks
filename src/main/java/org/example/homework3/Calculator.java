package org.example.homework3;

public class Calculator {
    public void sum(int a, int b) {
        int result = a + b;
        System.out.println("Sum result: " + result);
    }

    public void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction result: " + result);
    }

    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication result: " + result);
    }

    public void division(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by 0!");
        } else {
            int result = a / b;
            System.out.println("Division result: " + result);
        }
    }
}