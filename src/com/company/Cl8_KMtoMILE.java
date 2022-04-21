package com.company;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Cl8_KMtoMILE {
    public static void main(String[] args) {
        String name = "India";
        int number = 23;
        String a = Integer.toString(number);
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(3));
        System.out.println(a);
        byte[] byt = name.getBytes(StandardCharsets.US_ASCII);
        System.out.println(byt);
    }
}
