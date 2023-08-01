package com.mycompany.practical_03_2;

public class Practical3(2) {
    public static void main(String[] args) {
        Employee emp = new Employee("Bogdan", 50000.0, 10000.0);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Basic Salary: " + emp.getBasicSalary());
        System.out.println("Bonus: " + emp.getBonus());
        System.out.println("Bonus Amount: " + emp.calculatBonusAmount());
    }
}

