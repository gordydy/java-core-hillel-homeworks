package org.example.homework3;

public class RemainderAfterDivision {

    public void partsOfDivision(int dividend, int divisor) {
        int integerPart = dividend / divisor;
        System.out.println("Integer part of division result: " + integerPart);
        int afterDivisionPart = dividend % divisor;
        System.out.println("After division part value: " + afterDivisionPart);
    }
}
