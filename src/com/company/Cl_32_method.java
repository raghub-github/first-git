package com.company;

public class Cl_32_method {
    public static void change(int x){
        int a=90;
        System.out.println("change of "+a);
    }
    static void arr(int [] newarr){
        newarr[0] = 10;
    }
    public static void main(String[] args) {
        int a = 44;
        change(a);
        System.out.println("I am not changed "+a);
        int [] newarr = {14,25,36,47,58,69};
        arr(newarr);
        System.out.println(newarr[0]);
    }
}
