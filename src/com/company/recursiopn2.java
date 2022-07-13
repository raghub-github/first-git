package com.company;

 class test {
     static void fun(int n) {
         if (n==0)
             return;
         System.out.println(n);
         fun(n-1);
         System.out.println(n);
    }

}
public class recursiopn2 {
    public static void main(String[] args) {
        test tt = new test();
        tt.fun(3);
    }
}
