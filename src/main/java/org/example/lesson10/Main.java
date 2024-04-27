package org.example.lesson10;

import org.example.lesson10.emailValidator.EmailValidator;
import org.example.lesson10.romanNumbersCalculator.RomanNumbersCalculator;
import org.example.lesson10.stringManipulator.StringManipulator;

import java.util.Arrays;

import static org.example.lesson10.romanNumbersCalculator.RomanNumbersCalculator.RomanNumber.*;

public class Main {
    public static void main(String[] args) {
        StringManipulator strModifier = new StringManipulator();
        String str = "Some string value";
        char[] charsToRemove = {'o', 's', 'T', 'U'};
        String updatedStr = strModifier.removeCharacters(str, charsToRemove);
        System.out.println("Initial string: " + str);
        System.out.println("Characters to remove: " + Arrays.toString(charsToRemove));
        System.out.println("Updated string: " + updatedStr);
        System.out.println("*".repeat(30));

        EmailValidator validator = new EmailValidator();
        boolean validationCheck = validator.emailValidation("Username!#$%^&?@ahOO.com");
        System.out.println(validationCheck);
        System.out.println("*".repeat(30));

        RomanNumbersCalculator calculator = new RomanNumbersCalculator();
        System.out.println(calculator.calculate(L, M, "-"));

    }

}