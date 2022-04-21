package com.company;

public class Cl27_array {
    public static void main(String[] args) {
        int marks[] = {51, 87, 62, 86, 39};
//        int marks[] = new int[5];
        System.out.println("Length of the marks array is : "+marks.length);
        float [] marks1 = {42.10f, 77.21f, 78.441f};
        String [] name = {"Rohan", "Kabita","prattay"};
        System.out.println(marks[3]);
        System.out.println(name[2]);
        for (int i=0; i< marks.length; i++){
            System.out.println(marks[i]);
        }
        for (String element: name){  // for_each loop
            System.out.println(element);
        }
    }
}
