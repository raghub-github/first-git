package com.company;

public class custom_class {
    public static void main(String[] args) {
        employee harry = new employee();  //creating object
        harry.id = 23;  // set details
        harry.name = "harry";
        harry.salary = 15000;
        employee kapil = new employee();
        kapil.id = 51;
        kapil.name = "kapil";
        kapil.salary = 14000;
        harry.printDetails();
        kapil.printDetails();
        int salary = kapil.getSalary();
        System.out.println("The salary of kapil is " + salary);

    }
}
