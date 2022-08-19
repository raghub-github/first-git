package com.company;
import java.util.*;

public class Array_with_random_number {
    static int generateRandom(int max, int min){
        return (int)(Math.random() * ((max-min)+1)+min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size between 1 to 100");
        int size = sc.nextInt();  // Read a number from the keyboard
        int[] a = new int[100];  // Declaring a 1D array of size 100
        int MIN = 1, MAX = 100;
        if(size<=100 && size>0){
         for(int i=0; i<size; i++){
            a[i] = generateRandom(MAX, MIN);  // Generate and return a random number
         }
        System.out.println("capacity = "+ a.length + "\nsize: "+ size);
         for(int i=0; i<=size-1; i++){
            System.out.print(a[i]);
            System.out.print("\t");
         }
        }else System.out.println("Enter the valid number");
    }
}
