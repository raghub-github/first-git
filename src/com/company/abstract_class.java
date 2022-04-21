package com.company;
abstract class parent{
    public parent(){
        System.out.println("I am a constructor of parent class");
    }
   public void sayHello(){
        System.out.println("good morning !");
    }
    abstract void hello();   // Abstract class and method have not any object and body
    abstract void hello1();
}
class child extends parent{
    @Override
    public void hello(){
        System.out.println("good evening");
    }
    @Override
    public void hello1(){
        System.out.println("good night");
    }
}
public class abstract_class {
    public static void main(String[] args) {
    child ch = new child();
    }
}
