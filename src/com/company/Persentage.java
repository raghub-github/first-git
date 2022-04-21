package com.company;
import java.util.Scanner;
public class Persentage {
    public static void main(String[] args) {
        int math;
        int physics;
        int chemistry;
        int english;
        int computer;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your math's marks : ");
        math = sc.nextInt();
        System.out.println("Enter your physics's marks : ");
        physics = sc.nextInt();
        System.out.println("Enter your chemistry's marks : ");
        chemistry = sc.nextInt();
        System.out.println("Enter your english's marks : ");
        english = sc.nextInt();
        System.out.println("Enter your computer's marks : ");
        computer = sc.nextInt();
        sc.close();
        int sum = math+physics+chemistry+english+computer;
        float percentage = (sum*100)/500;
        System.out.println("The percentage obtained is : "+percentage+"%");

    }
}
