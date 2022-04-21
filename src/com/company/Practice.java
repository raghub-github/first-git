package com.company;
import javax.lang.model.element.Element;
import java.util.*;
import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {

        //  QS 1 --> Create a array list of 10 student and print
        ArrayList<String> ar = new ArrayList<>();
        ar.add("name 1");
        ar.add("name 2");
        ar.add("name 3");
        ar.add("name 4");
        ar.add("name 5");
        ar.add("name 6");
        ar.add("name 7");
        ar.add("name 8");
        ar.add("name 9");
        ar.add("name 10");
       // System.out.println(ar);
        for (Object e: ar){
            System.out.println(e);
        }

        // QS 2 --> Create a Hashset

        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(20);
        hs.add(99);
        hs.add(1);
        hs.add(28);
        hs.add(1);  // We can't add Duplicate element in the same set
        System.out.println(hs);

        // QS 3 -->Using Date class Print the time

        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        // QS 4 -->using Calender class print the time

        Calendar cl = Calendar.getInstance();
        System.out.println(cl.get(Calendar.HOUR_OF_DAY)+":"+cl.get(Calendar.MINUTE)+":"+cl.get(Calendar.SECOND));


    }
}
