package com.company;
@FunctionalInterface
interface demo{  // Functional interface contain only one method
    public void d1(int a);
//    public void d2();
}
//class annoyDemo implements demo{
//    public void annoy(){
//        System.out.println("hello");
//    }
//
//    @Override
//    public void d1() {
//        System.out.println("hii");
//    }
//
//    @Override
//    public void d2() {
//        System.out.println("hay");
//    }
//}
public class anonymous_class {
    public static void main(String[] args) {
//        annoyDemo obj = new annoyDemo();  // access by creating an object of the class
//        obj.d1();

        // Anonymous class
//        demo obj = new demo() {   // this is a simple way to execute a method by anonymous for only once
//            @Override
//            public void d1() {
//                System.out.println("hii");
//            }
//
//            @Override
//            public void d2() {
//                System.out.println("Hello");
//            }
//        };
//        obj.d1();
//        obj.d2();

        // Lambda expression

        demo obj = (a)->{  // syntax of the lambda expression
            System.out.println(" I am d1 "+a);
        };
        obj.d1(8);
    }
}
