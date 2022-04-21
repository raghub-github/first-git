package com.company;

public class Varargs_concept_33 {
//    static int sum(int a,int b){
//        return  a+b;
//    }
//    static int sum(int a,int b,int c){
//        return  a+b+c;
//    }
    static int sum(int ...arr){ // now we can add soo many number together at a time
        // available as a int [] arr;
        int result =0;
        for (int a:arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("welcome to varargs tutorial");
        System.out.println("the sum of 4 and 5 is : "+sum(4,5));
        System.out.println("the sum of 4, 5 and 7 is : "+sum(4,5,7)); // simple way to sending limited argument


    }
}
