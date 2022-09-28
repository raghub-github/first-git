package com.company;

import java.util.Scanner;

public class Varargs_concept_33 {
//    static int sum(int a,int b){
//        return  a+b;
//    }
//    static int sum(int a,int b,int c){
//        return  a+b+c;
//    }
    static int sum(int ...arr){ // now we can add so many number together at a time
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

    public static class income_tax_21 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your income per annum");
            double income = sc.nextFloat();
            double tax = 0;
            if(income<=250000.0){
                tax = tax+0;
            }

            if(income>250000 && income<=500000){
                tax = tax+0.05*(income-250000);
            }

            if(income>500000 && income<=1000000){
                tax = tax+0.05*(500000-250000);
                tax = tax+0.2*(income-500000);
            }

            if(income>1000000){
                tax = tax+0.05*(500000-250000);
                tax = tax+0.2*(1000000-500000);
                tax = tax+0.3*(income-1000000);
            }
            System.out.println("Your income rax is : "+tax);

        }
    }
}
