package com.company;
class thread1 extends Thread{  // we can extends the Thread class in every class
    // we can add Tread in a class by using extends keyword
    @Override
    public void run(){
        int i = 0;
        while (i<1000){
            System.out.println("I am in thread1 and In am good");
            i++;
        }
    }
}
class thread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<1000){
            System.out.println("I am in thread2");
            System.out.println("I am fine...!");
            i++;
        }
    }
}
public class threading_concept {
    public static void main(String[] args) {
        thread1 th1 = new thread1();  // Thread class running simultaneously in both different class
        thread2 th2 = new thread2();
        th1.start();  // start is method of excitation of Thread class
        th2.start();
    }
}
