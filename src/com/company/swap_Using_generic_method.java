package com.company;

public class swap_Using_generic_method {
    public static<T> void swap(T x, T y){
        System.out.println(x);
        System.out.println(y);
        T temp;
        temp = x;
        x=y;
        y= temp;
        System.out.println("x = " + x + " & " + "y = " +y);
    }
    public static void main(String[] args) {
        Integer x =new  Integer(99);
        Integer y = new Integer(66);
        System.out.println("x = " + x + " & " + "y = " +y);
        swap(x,y);


    }
}
