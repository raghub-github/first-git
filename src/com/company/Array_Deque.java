package com.company;
import java.util.*;
public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq1 = new ArrayDeque<>();  // smiler as ArrayList...
        dq1.add(18);
        dq1.add(3);
        dq1.add(88);
        dq1.add(27);
        dq1.addFirst(51);
        System.out.println(dq1.getFirst());
        System.out.println(dq1.getLast());
        System.out.println(dq1);  // to get all the element in the array
    }
}
