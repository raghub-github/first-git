package com.company;

import java.util.Scanner;

class myException extends Exception{
    @Override
    public String toString() {
        return super.toString()+" I am toString()";
    }

    @Override
    public String getMessage() {
        return super.getMessage()+" I am getMessage()";
    }
}
public class Exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = sc.nextInt();
        if (a<45){
            try {
               // throw new myException();   //  we can throw an Exception by creating new object
                throw new ArithmeticException("This is an Exception");
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();  // The printing message not an error just a Exception message
            }finally {
                System.out.println("I will must be execute at any condition after return or break the loop also");
            }
            System.out.println("Finished");
        }
    }
}
