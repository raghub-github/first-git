package com.company;

public class Array_26 {
    public static void main(String[] args) {
//        int[] marks;
//        marks=new int[5];
//        int[] marks = new int[5]; // 2nd  method to creating array
//        marks[1]=89;
//        marks[0]=69;
//        marks[2]=91;
//        marks[3]=49;
//        marks[4]=68;

        int[] marks = {55,85,67,49,96}; // 3rd method to creating array
        System.out.println(marks[2]);
        System.out.println(marks.length);


        float[] marks1 = {88.5f,45.5f,87.5f,99.0f};
        System.out.println(marks1.length);
        System.out.println(marks[3]);


        String[] student = {"harry","Raghu","Subham"};
        System.out.println(student.length);
        System.out.println(student[2]);

        for( int i=0; i<=student.length-1; i++){  //method of displaying array in short method
            System.out.println(student[i]);
        }

        for(int element: marks){  //another easy method to displaying array
            System.out.println(element);
        }
    }
}
