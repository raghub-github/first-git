package com.company;
class myThread1 extends Thread{
    public void run(){
//        while (true){
//            try {
//                Thread.sleep(200);
//            }catch (Exception e){
//                System.out.println(e);
//            }
//            System.out.println("Good Morning");
//        }
    }
}
class myThread2 extends Thread{
    public void run(){
        while (true){
            try {  // try catch is used for fixed the null pointer exception
                Thread.sleep(200);  // sleep method is used for delay to execute the particular Thread
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}
public class practice_13_Thread {
    public static void main(String[] args) {
        myThread1 th1 = new myThread1();
        myThread2 th2 = new myThread2();
        th1.start();
       // th1.setPriority(5);
        System.out.println(th1.getPriority());  // check the priority
       // th2.start();
        // th2.setPriority(6);
        System.out.println(th2.getPriority());
        System.out.println(th1.getState());
        System.out.println(Thread.currentThread().getState());  // another method to check the thread state
        System.out.println(th2.getState());
    }
}
