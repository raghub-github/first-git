package com.company;
import java.util.Scanner;
public class Km_to_mile {
    public static void main(String[] args) {
        System.out.println("Enter km value : ");
        Scanner sc = new Scanner(System.in);
        double km = sc.nextFloat();
        double mile = (km*0.621371);
        System.out.println(""+km+" kilometer = "+mile+" mile");
    }
}
