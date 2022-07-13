package com.company;

class generic<T>{  // where T is the parameter for Type list
    // Defining a static generic method to pint any data type
    public void printMethod(T t){
        System.out.println(t);
    }
}
public class genericMethod {
    public static void main(String[] args) {
        generic gn=new generic(); // Creating an Object
        gn.printMethod(101); // Calling generic method with integer argument
        gn.printMethod("Play with Java");  // calling generic method with String argument
        gn.printMethod(355.05754);  // calling generic method with double argument
    }
}
