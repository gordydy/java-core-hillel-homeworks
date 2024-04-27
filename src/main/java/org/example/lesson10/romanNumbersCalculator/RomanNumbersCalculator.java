package org.example.lesson10.romanNumbersCalculator;

public class RomanNumbersCalculator {
    public enum RomanNumber {
        M(1000), D(500), C(100), L(50), X(10), V(5), I(1);
        final int number;

        RomanNumber(int number) {
            this.number = number;
        }
    }

    public int calculate(RomanNumber firstEnum, RomanNumber secondEnum, String operator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = firstEnum.number + secondEnum.number;
                break;
            case "-":
                result = firstEnum.number - secondEnum.number;
                break;
            case "/":
                result = firstEnum.number / secondEnum.number;
                break;
            case "*":
                result = firstEnum.number * secondEnum.number;
                break;
            default:
                System.out.println("Invalid data");
        }
        return result;
    }

}