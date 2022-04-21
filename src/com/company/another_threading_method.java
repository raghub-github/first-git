package com.company;
class myThreadRunnable1 implements Runnable{   // another method of add tread class
    @Override  // adding Thread using implements runnable class in the subclass
    public void run(){  // we need to declare the class the abstract or add the run method to execute class
        int i=0;
      while (i<1000){
          System.out.println("myThreadRunnable1 is running");
          i++;
      }
    }
}
class myThreadRunnable2 implements Runnable{
    @Override
    public void run(){
        int i=0;
        while (i<1000){
            System.out.println("I am not in myThreadRunnable1");
            i++;
        }
    }
}
public class another_threading_method {
    public static void main(String[] args) {
        myThreadRunnable1 bullet1 = new myThreadRunnable1();  // creating object of the class
        myThreadRunnable2 bullet2 = new myThreadRunnable2();
        Thread gun1 = new Thread(bullet1);  // this the syntax of use of Thread , we cannot call start() method in the bullet object
        gun1.start();
        Thread gun2 = new Thread(bullet2);  // Thread is executing simultaneously in both object
        gun2.start();
    }
}
