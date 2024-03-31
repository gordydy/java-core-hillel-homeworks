package org.example.homework5;

public class Main {
    public static void main(String[] args) {
        EvenDigitsSum sum = new EvenDigitsSum();
        System.out.println(sum.getEvenDigitSum(321));
        System.out.println("*".repeat(6));

        NumberSorting test = new NumberSorting();
        System.out.println("Not sorted");
        int[] numbers = test.getIntegers(6);
        test.printArray(numbers);

        System.out.println("Sorted");
        int[] sortedNumbers = test.sortIntegers(numbers);
        test.printArray(sortedNumbers);
        System.out.println("*".repeat(6));

        NumberGenerator generator = new NumberGenerator();
        generator.generateAndPrint();
    }
}