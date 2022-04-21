package com.company;
import java.util.Scanner;
public class RB_prtc_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n number");
        int n = sc.nextInt();

        // question 1 (sum of first n even number)

//        int sum=0;
//        for (int i=1; i<=n; i++){
//            sum = sum+(2*i);
//        }
//        System.out.printf("sum of first %d even number is : %d",n,sum);

        // question 2 (multiplication table)

//        for(int i=1; i<=10; i++){
//            System.out.printf("%d X %d = %d \n",i,n,i*n);
//        }


        // question 3 (multiplication table reverse order)

//        for(int i=10; i>0; i--){
//            System.out.printf("%d X %d = %d \n",i,n,i*n);
//        }
//
        // question 4 (find the factorial of a given number)

        double sum = 1;

        for(int i=1; i<=n; i++){
            if(n==0){
                System.out.println("Factorial of the given number is : 1");
                break;
            }
            sum = sum*i;
        }
        System.out.println("Factorial of the given number is : "+sum);



    }


}
