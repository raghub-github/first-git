package com.company;

class myCycle{
   public void run(){
       System.out.println("I am running from myCycle class");
   }
}
class myBike extends myCycle{
   @Override   // @Override annotation is not mandatory
    public void run(){
        System.out.println("I am running from myBike class (I am override from class myCycle)");
    }public void mileage(){
        System.out.println("I am BULLET , Don't judge me by my mileage");
    }
}
public class class_48_method_overriding {
    public static void main(String[] args) {
        myCycle mycl = new myCycle();
        mycl.run();
        myBike mbk = new myBike();
        mbk.run();
        mbk.mileage();
    }
}
