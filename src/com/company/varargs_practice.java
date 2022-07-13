package com.company;

public class varargs_practice {
    public static void main(String[] args) {
        System.out.println("The sum of 8, 9, 33, 60, 51 & 29 is : "+sum(8,9,33,60,51,29));
    }
    static int sum(int ...arr){
       int result = 0;
        for (int a:arr){
            result = result + a;
        }
        return result;
    }
}
