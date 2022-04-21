package com.company;

import java.util.Scanner;

public class Cl_19_inhance_switchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int number = scanner.nextInt();

       switch (number){
           case 1 -> System.out.println("One");
           case 2 -> System.out.println("Two");
           case 3 -> System.out.println("three");
           default -> System.out.println("Zero");
       }
    }
}
