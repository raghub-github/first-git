package com.company;
import java.util.Scanner;
public class Do_while_21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number between 0 to 100");
        int n= sc.nextInt();
        int a = 1;
//        while (a<=n){
//            System.out.println(a);
//            a++;
//        }
        do {
            System.out.println(a);
            a++;
        }while (a<=n);




    }


}
