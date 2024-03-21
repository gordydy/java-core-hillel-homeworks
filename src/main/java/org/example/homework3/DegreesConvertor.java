package org.example.homework3;

import java.text.DecimalFormat;

public class DegreesConvertor {
    public void degreesConvertor (double celsius) {
        DecimalFormat decimalFormat = new DecimalFormat( "#.#");
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " Celsius degrees" +   " is equal to " + decimalFormat.format(fahrenheit) + " Fahrenheit degrees.");
        double kelvin = celsius + 273.15;
        System.out.println(celsius + " Celsius degrees" +  " is equal to " + decimalFormat.format(kelvin) + " Kelvin degrees.");


    }
}
