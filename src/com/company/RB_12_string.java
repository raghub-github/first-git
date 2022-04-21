package com.company;

import java.util.Locale;

public class RB_12_string {
    public static void main(String[] args) {
        //string name;
       // name = new String("Raghu");
        String name = "Raghu";
        String name2 = "     Raghu Bhunia   ";
        System.out.println(name);
        System.out.println((int) name.length());//we can find the length of string

        System.out.println((String) name.toLowerCase());//upper case to lower case

        System.out.println((String) name.toUpperCase());//lower case to upper case

        System.out.println((String) name2.trim());//avoid the space

        System.out.println((String) name.substring(2));//Creating a new substring from main string

        System.out.println((String) name.replace('R','J'));//replace a character

        System.out.println((String) name.replace("Raghu","Bhunia"));//replace a word or target

        System.out.println(name.startsWith("Rag"));//check the character start whit the particular Character or not

        System.out.println(name.endsWith("Rag"));//check the character ends whit the particular Character or not

        System.out.println(name.charAt(1));//Which character situated in the particular index number

        System.out.println(name.indexOf("gh"));//Start the character which index number first

        String modifiedNmae = "Raagghhuu";

        System.out.println(modifiedNmae.indexOf("gh"));

        System.out.println(modifiedNmae.indexOf("gh",4));

        System.out.println(name.equals("Raghu"));//the string is match with the name or not

        System.out.println(name.equalsIgnoreCase("Raghu"));//the string is match with the name or not and also ignore case

        System.out.println("I am a doubla code \" ");//appling of double code



    }
}
