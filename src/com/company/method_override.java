package com.company;
class A{
    int a;
    public int math(){
        return 1;
    }
    public void math1(){
        System.out.println("I am a method of class A");
    }
}
class B extends A{
    @Override
    public void math1(){  //  method overriding...
        System.out.println("I am a method of class B");
    }
}
public class method_override {
    public static void main(String[] args) {
        A a = new A();
        a.math1();
        B b = new B();
        b.math1();
    }
}
