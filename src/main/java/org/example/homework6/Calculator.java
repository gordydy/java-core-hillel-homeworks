package org.example.homework6;

import java.util.Scanner;

public class Calculator {
    String decisionValue;
    Scanner scanner = new Scanner(System.in);

    public void calculate() {

        do {
            System.out.print("Enter a number:");
            double firstNum = getNumber();

            System.out.print("Enter an operation (+, -, *, /):");
            String arithmeticOpr = scanner.nextLine();

            System.out.print("Enter another number:");
            double secondNum = getNumber();

            double result = calculateResult(firstNum, secondNum, arithmeticOpr);
            System.out.println("Result: " + result);

        } while (!"no".equals(continueDecision()) && ("yes".equals(decisionValue)));
        System.out.println("Exiting the calculator.");
        scanner.close();
    }

    public String continueDecision() {
        System.out.print("Do you want to perform another calculation? (yes/no): ");
        decisionValue = scanner.nextLine().toLowerCase();
        if (!"yes".equals(decisionValue) && (!"no".equals(decisionValue))) {
            System.out.println("Please, enter yes or no!");
            continueDecision();
        }
        return decisionValue;
    }

    public double getNumber() {
        double number;
        while (true) {
            try {
                number = Double.parseDouble(scanner.nextLine());
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid value! Number required, try again.");
            }

        }
    }

    public double calculateResult(double firstNum, double secondNum, String arithmeticOpr) {
        switch (arithmeticOpr) {
            case "+":
                return firstNum + secondNum;
            case "-":
                return firstNum - secondNum;
            case "/":
                if (secondNum != 0)
                    return firstNum / secondNum;
                else {
                    System.out.println("Error! Division by 0");
                }
            case "*":
                return firstNum * secondNum;
            default:
                System.out.println("Invalid operator");
                return 0;
        }
    }
}