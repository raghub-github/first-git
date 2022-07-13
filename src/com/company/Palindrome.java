package com.company;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String");
        String st = sc.next();
        int length = st.length();

        // Not working properly

        if (length%6==0){
                int j=2;
            for (int dv=length/6; dv>0; dv--){
                int temp = j;
                String newSt = "";
                for (int i = j; i>=temp-2; i--){
                     newSt = newSt + st.charAt(i);
                }
                System.out.println(newSt);
                if (st.charAt(j)==newSt.charAt(j+1) && st.charAt(j-1)==newSt.charAt(j+2) && st.charAt(j-2)==newSt.charAt(j+3)){
                j=j+6;
                } else {
                    System.out.println("The String is not a palindrome");
                }
            }
            System.out.println("The String is a palindrome");
        }
        else {
            System.out.println("The String is not Palindrome");
        }
    }
}
