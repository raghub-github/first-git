package com.company;
import java.util.Scanner;
public class Leap_year_20 {
    public static void main(String[] args) {
        System.out.println("Enter the year : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%400==0 && year%4==0){
            if(year%100==0 && year!=2000){
                System.out.println(year + " is not a leap year");
            }else{
                System.out.println(year + " is a leap year");
            }

        }else{
              System.out.println(year + " is not a leap year");

        }

    }
}
