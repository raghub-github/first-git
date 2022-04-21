package com.company;
import java.util.Scanner;
public class name_prt {
    public static void main(String[] args) {
        System.out.println("Please enter your name here : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello "+name+" have a good day!");

    }
}
