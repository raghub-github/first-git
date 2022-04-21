package com.company;
import java.util.Scanner;
public class if_else_loop {
    public static void main(String[] args) {
        int a;
        Scanner sc= new Scanner(System.in);
        a = sc.nextInt();
        if(a>64){
            System.out.println("you are qualify");
        }else if (a>54){
            System.out.println("you are semi-qualify");
        }else if (a>46){
            System.out.println("you are semi-semi-qualify");
        }else {
            System.out.println("you are not qualify");
        }
    }
}
