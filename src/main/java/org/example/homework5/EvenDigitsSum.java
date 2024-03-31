package org.example.homework5;

public class EvenDigitsSum {
    public int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int evenSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            }
            number /= 10;
        }
        return evenSum;
    }
}