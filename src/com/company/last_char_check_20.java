package com.company;
import java.util.Scanner;
public class last_char_check_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website : ");// like this....   raghubhunia53@gmail.com
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is a organisation website");
        }
        else if (website.endsWith(".in")){
            System.out.println("This is a indian website");
        }
        else if (website.endsWith(".com")){
            System.out.println("This is a commercial website");
        }
    }
}
