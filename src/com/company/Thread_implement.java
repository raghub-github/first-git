package com.company;
class threading extends Thread{
    public  threading(String name) {
        super(name);
    }
    public void run(){
        System.out.println("I am a Thread");
    }
}
public class Thread_implement {
    public static void main(String[] args) {
        threading th1 = new threading("Thread");
        threading th2 = new threading("Harry");
        th1.start();
        th2.start();
        th2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("My id is "+th1.getId());
        System.out.println("My name is "+th1.getName());
        System.out.println("My id is "+th2.getId());
        System.out.println("My name is "+th2.getName());
    }
}
