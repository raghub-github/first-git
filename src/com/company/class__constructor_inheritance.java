package com.company;

class myBase{
   public myBase(){
       System.out.println("I am a constructor");
   }
   public myBase(int a){
       System.out.println("I am a overloaded constructor of base class with the value of "+a);
   }
}
class myDerived extends myBase{

    public myDerived(){   // constructor of the base class execute first then the derived class constructor executed
//       super(0);
        System.out.println("I am a constructor from derived class");
    }
    public myDerived(int a, int b){
        super(a);  // at first execute the single value attribute base class constructor by super key
        System.out.println("I am a overloaded constructor of derived class with the value of "+b);
    }
}

class childCl extends myDerived{
    childCl(int x, int y, int z){
        super(x,y);
        System.out.println("I am in child class constructor derived from myDerided class with the value of "+z);
    }
}

public class class__constructor_inheritance {
    public static void main(String[] args) {
//        myBase mb = new myBase();
//        myDerived md = new myDerived(110,39);
        childCl cl = new childCl(44,5,91);
    }
}
