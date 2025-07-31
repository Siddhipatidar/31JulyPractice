package com.methodOverriding;

public class Employee {
    public void getRole() {
        System.out.println(" Employee Method");
    }
    public static void companyPolicy() {
        System.out.println("Static employees Method");
    }
}
class Manager extends Employee {
    @Override
    public void getRole() {
        System.out.println("Manager Method");
    }
    public static void companyPolicy() {                   //Method Hiding not method overriding
        System.out.println("Static Managers Method");
    }
    public static void main(String[] args) {
        Employee emp=new Manager();

        emp.getRole();
        emp.companyPolicy();

        Manager.companyPolicy();
        Employee.companyPolicy();

    }
}
