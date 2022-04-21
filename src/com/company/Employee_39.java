package com.company;
class employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name =n;
    }

}
public class Employee_39 {
    public static void main(String[] args) {
        employee1 manas = new employee1();
        manas.setName("harry");
        manas.salary=12000;
        System.out.println(manas.getName());
        System.out.println(manas.getSalary());

    }
}
