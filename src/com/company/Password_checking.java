package com.company;

// Password checking conditions-->
/* 1. At least 4 characters
2. At least one number digit
3. At least one Capital Letter
4. Must not have space or slave(/)
5. Starting character must not be a number */

import java.util.Scanner;

class Password_checking {
    public static int checkPassword(String str, int n){
        if (n<4){
            return 0;
            }
        if (str.charAt(0)>='0' && str.charAt(0)<='9'){
            return 0;
            }
        int num=0, cap =0;
        for(int i=0; i<n; i++){
            if (str.charAt(i)>='A' && str.charAt(i)<='Z'){
                cap++;
            }
            if (str.charAt(i)>='0' && str.charAt(i)<='9'){
                num++;
            }
            if (str.charAt(i)==' ' || str.charAt(i)=='/'){
                return 0;
            }
        }
        if (num>0 && cap>0){
            return 1;
        }else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Password for testing as a String");
        String str = sc.next();
        System.out.println(checkPassword(str, str.length()));
    }
}
