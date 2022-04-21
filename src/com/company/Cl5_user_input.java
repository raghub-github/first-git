package com.company;
import java.util.Scanner;

public class Cl5_user_input {
    public static void main(String[] args) {
        System.out.println("taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
        String str = sc.next();  // For read a word
        System.out.println(str);
        String str1 = sc.nextLine();  // for read a line
        System.out.println(str1);
    }
}
