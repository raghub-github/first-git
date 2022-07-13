package com.company;
class labour{
    int id;
    String name;
    int salary;
    public int getId() {
        return id;
    }
    public int getSalary(){
        return salary;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
public class class_39_practiceClass {
    public static void main(String[] args) {
        labour ani = new labour();
        labour vivek = new labour();
        ani.id=89;
        vivek.id=9;
        ani.salary = 25000;
        vivek.salary = 20000;
        ani.setName("Anindra");
        vivek.setName("vivek raj");
        System.out.println(ani.getName());
        System.out.println(ani.getId());
        System.out.println(ani.getSalary());
        System.out.println(vivek.getName());
        System.out.println(vivek.getId());
        System.out.println(vivek.getSalary());
    }
}
