package com.company;

class employee {
    int id;
    String name;
    int salary;

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }

    public int getSalary() {
        return salary;
    }

    public static class Access_modifier {
        public static void main(String[] args) {
            myEmployee Aminesh = new myEmployee();
            Aminesh.setName("Welcome");
            Aminesh.setId(14);
            System.out.println(Aminesh.getId());
            System.out.println(Aminesh.getName());

        }
    }

}
