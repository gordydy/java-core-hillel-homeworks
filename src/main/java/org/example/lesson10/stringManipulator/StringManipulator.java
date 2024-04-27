package org.example.lesson10.stringManipulator;

public class StringManipulator {

    public String removeCharacters(String str, char[] charsToRemove) {
        StringBuilder strAfterModifying = new StringBuilder(str);
        for (int i = 0; i < strAfterModifying.length(); i++) {
            for (char c : charsToRemove) {
                if (Character.toLowerCase(strAfterModifying.charAt(i)) == Character.toLowerCase(c)) {
                    strAfterModifying.deleteCharAt(i);
                    i--;
                    break;
                }
            }
        }
        return String.valueOf(strAfterModifying);
    }
}