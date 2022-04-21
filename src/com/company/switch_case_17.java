package com.company;

import java.util.Scanner;

public class switch_case_17 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        switch (a){
            case 10:
                System.out.println("good boy");
                break;
            case 20:
                System.out.println("very good");
                break;
            case 30:
                System.out.println("really good");
                break;
            default:
                System.out.println("very bad");
        }
    }
}
