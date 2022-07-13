package com.company;

class EmployeeD{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My ID is : "+id);
        System.out.println("My name is : "+name);
        System.out.println("My salary is : "+salary);
    }
    public int getSalary(){
        return salary;
    }
}
public class Class_38_object {
    public static void main(String[] args) {
        System.out.println("This is my main class");
        EmployeeD anindra = new EmployeeD();
        EmployeeD anakan = new EmployeeD();
        anindra.id=16;
        anindra.name="Anindra";
        anindra.salary = 25000;
        anakan.id=169;
        anakan.name="Ankan";
//        anakan.salary = 20000;
        int salary = anakan.getSalary();
        anindra.printDetails();
        anakan.printDetails();
        System.out.println("salary of ankan is : "+salary);
    }
}
