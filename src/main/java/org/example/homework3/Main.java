package org.example.homework3;

public class Main {
    public static void main(String[] args) {
        MinMaxVal val = new MinMaxVal();
        val.maxValue(1,3);
        val.minValue(33,78);

        System.out.println("*****");

        Calculator calculator = new Calculator();
        calculator.sum(3,5);
        calculator.subtraction(3,7);
        calculator.multiplication(9,4);
        calculator.division(22,3);

        System.out.println("*****");

        LongToInt convertor = new LongToInt();
        convertor.longToInt(1111111113L);

        System.out.println("*****");

        RemainderAfterDivision division = new RemainderAfterDivision();
        division.partsOfDivision(8,3);

        System.out.println("*****");

        DegreesConvertor degreesConvertor = new DegreesConvertor();
        degreesConvertor.degreesConvertor(33.4);
    }
}