package com.company;

import java.util.Scanner;

public class CL_19_leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int year = scanner.nextInt();
         if (year%400==0)
             System.out.println("leap Year");
            else if (year%4==0)
             System.out.println("leap year");
         else
             System.out.println("not leap year");
    }

}
