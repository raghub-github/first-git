package com.company;
import java.util.Scanner;

public class recursion_function {

    static int factorial(int n){
        //    factorial(0) = 1
        //    factorial(5) = 5*4*3*2*1
        //    factorial(n) = n*(n-1)*(n-2)....3*2*1
        //    factorial(n) = n * factorial(n-1)
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        System.out.println("The factorial of "+n+" is :"+factorial(n));

    }
}
