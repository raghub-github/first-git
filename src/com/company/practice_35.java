package com.company;
import java.util.Scanner;
public class practice_35 {
    public static void multiplication(int n){  // problem 1 multiplication function
        for (int i=1; i<=10; i++){
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
    }
    static int rec(int a){  // problem 2 recursion function
        if (a==1){
            return 1;
        }
        return a+rec(a-1);
    }
   public static int fibonacci(int a){  // problem 3  fibonacci series
            //        if (a==1){
            //            return 0;
            //        }else if (a==2){
            //            return 1;
            //        }
            if (a==1 || a==2){
                int c=a-1;
                return c;
            }
            else {

                int c =fibonacci(a-1)+fibonacci(a-2);
                return c;
            }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a=sc.nextInt();

        // multiplication(a);

        // System.out.println("The sum of first "+a+" number is : "+rec(a));

        System.out.println("The fibonacci series for first "+a+" number is : ");
        for (int j=1; j<=a; j++){
            int c= fibonacci(j);
            System.out.print(c+" ");
        }



    }
}
