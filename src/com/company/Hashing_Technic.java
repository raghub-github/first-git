package com.company;

import java.util.HashSet;

public class Hashing_Technic {
    public static void main(String[] args) {   // Hashing technic is use for searching the data very fast, because it's returning the reminder of every element
        HashSet<Integer> myHashSet = new HashSet<>();  //  we can not add the same element in the HashSet
        myHashSet.add(4);
        myHashSet.add(5);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(7);
        myHashSet.add(27);
        System.out.println(myHashSet);
        System.out.println(myHashSet.size());
        System.out.println(myHashSet.contains(27));
    }
}
