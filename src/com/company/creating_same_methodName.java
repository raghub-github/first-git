package com.company;

public class creating_same_methodName {
    static void alexa(){
        System.out.println("good morning broo!");
    }
    static void alexa( int[] n ){  // same method name but we need different argument
        System.out.println("good morning broo!"+" "+ n[0] );
    }
    public static void main(String[] args) {
        int[] p={10,20,88,96};
       alexa();
       alexa(p);
    }
}
