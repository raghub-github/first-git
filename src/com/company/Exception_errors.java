package com.company;
import java.util.Scanner;
public class Exception_errors {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 56;
        arr[1] = 115;
        arr[2] = 48;
        arr[3] = 97;
        System.out.println("Please enter the array index");
        Scanner sc = new Scanner(System.in);
        int ind = sc.nextInt();
        System.out.println("Enter the number ou want to divided the value with");
        int number = sc.nextInt();
        try {
            System.out.println("The value of array index entered by : "+arr[ind]);
            System.out.println("The value of array-value/number is: "+arr[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occurred");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception occurred"+e);
        }
    }
}
