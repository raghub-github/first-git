package com.company;
import java.util.Scanner;
public class Cl6_percentage
{
    public static void main(String[] args) {
        System.out.println("Please enter 5 input");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int number4 = sc.nextInt();
        int number5 = sc.nextInt();
        sc.close();
        float percentage = (number1 + number2+number3 + number4+ number5)/5f;
        System.out.println("Percentage of 5 subject is :"+ percentage);
    }
}
