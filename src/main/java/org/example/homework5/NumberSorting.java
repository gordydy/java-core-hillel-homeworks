package org.example.homework5;

import java.util.Random;

public class NumberSorting {
    int[] intArray;

    public int[] getIntegers(int size) {
        intArray = new int[size];
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(100);
        }
        return intArray;
    }

    public void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element " + i + " contents " + intArray[i]);
        }
    }

    public int[] sortIntegers(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = intArray.length - 1; j > i; j--) {
                if (intArray[j - 1] < intArray[j]) {
                    int temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        return intArray;
    }
}