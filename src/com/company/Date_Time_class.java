package com.company;

import java.util.Date;

public class Date_Time_class {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());  // in milliseconds
        System.out.println(d.toInstant());
        System.out.println(d.getDate());  // deprecated method
    }
}
