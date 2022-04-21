package com.company;

public class RB_prtc_01_upperToLower {
    public static void main(String[] args) {
        //problem 1
        String name = "Raghu Bhunia";
       String name1=name.toLowerCase(); // converting the upper case to lower case
        System.out.println(name1);

        //problem 2
        name=name.replace(" ","_");
        System.out.println(name);// replace with another word

        //problem 3
        String text = "Dear <|name|> thanks a lot!";
        text=text.replace("<|name|>","Raghu");
        System.out.println(text);

        //problem 4

    }
}
