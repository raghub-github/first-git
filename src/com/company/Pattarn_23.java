package com.company;

public class Pattarn_23 {
    public static void main(String[] args) {
        int n=5;
        //type 1

//        for(int i=0; i<n; i++){
//            for(int j=0; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        //type 2

        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}

