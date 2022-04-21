package com.company;
import java.util.Scanner;
public class For_loop_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");// for printing odd numbers
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println(2*i+1);
        }
    }
}
