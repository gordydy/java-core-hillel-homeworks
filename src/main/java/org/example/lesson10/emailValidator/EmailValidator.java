package org.example.lesson10.emailValidator;

public class EmailValidator {
    public boolean emailValidation(String email) {
        boolean validationPassed = false;
        if (email.indexOf("@") > 0) {
            int index = email.indexOf("@");
            String localPart = email.substring(0, index);
            String domainPart = email.substring(index + 1);
            return ((localPart.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+$")) && domainPart.matches("^[a-zA-Z0-9][a-zA-Z0-9-]{0,61}[a-zA-Z0-9](?:\\.[a-zA-Z]{2,})+$"));
        }
        return validationPassed;
    }
}