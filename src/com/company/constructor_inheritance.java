package com.company;

class base1{
    base1(){
        System.out.println("I am a constructor");
    }
    base1(int x){
        System.out.println("I am a overloaded constructor with the value of : "+x);

    }
}
class derived extends base1{
    derived(){   // constructor...
        super(0);
        System.out.println("I am also a constructor");
    }
    derived(int x,int y){
        System.out.println("I am a overloaded derived constructor with the value of b : "+y);
    }
}

public class constructor_inheritance {
    public static void main(String[] args) {
        //base1 b=new base1();
        derived d = new derived();
        derived d1 = new derived(14,55);
    }
}
