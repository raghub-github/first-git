package com.company;
class runnableClass implements Runnable{

    @Override
    public void run(){
        System.out.println("I am implementing Runnable class");
    }
}
public class Runnable_implement {
    public static void main(String[] args) {
        runnableClass rn1 = new runnableClass();
        Thread th1 = new Thread(rn1);
        th1.start();
        System.out.println(th1.getId());
        System.out.println(th1.getName());
    }
}
