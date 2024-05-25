package org.example.homework10.employeeProcessing;


import java.time.LocalDate;


public record Employee(String firstName, String lastName, String hireDate) {
    public String fullName() {
        return firstName + " " + lastName;
    }

    public int yearsOfWork() {
        LocalDate startDate = LocalDate.parse(hireDate);
        return LocalDate.now().getYear() - startDate.getYear();
    }
}