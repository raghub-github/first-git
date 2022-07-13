package com.company;

class mobile{
    int x;
    public void PrintMe(){
        System.out.println("You can use me for calling purpose only");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class smartPhone1 extends mobile{  // we can use the word "extends" for inheritance the class
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void printMe1(){
        System.out.println("You can play music and video also ");
    }
}
public class Class_44_exercise_on_constructor {
    public static void main(String[] args) {
       // creating an object of derived class
        smartPhone1 sm = new smartPhone1();
        sm.PrintMe();
        sm.printMe1();
       // creating an object of base class
        mobile sm1 = new mobile();
        sm1.PrintMe();
//        sm1.printMe1();   // we can not access the method of derived class from base class
    }
}
