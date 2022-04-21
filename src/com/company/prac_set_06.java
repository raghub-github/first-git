package com.company;

public class prac_set_06 {
    public static void main(String[] args) {
        // question 1
        int[] num = {60,50,70,55,86,48,84,91};  // checking the integer is present in the array or not
        int check = 55;
        boolean yes = false;
        for (int element:num){
            if (element==check){
                yes=true;
                break;
            }
        }
        if (yes){
            System.out.println("the number is present in the array");
        }else {
            System.out.println("the number is not present in the array");
        }
    }
}
