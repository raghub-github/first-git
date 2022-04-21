package com.company;
interface cycle{   // interface is a group of abstract method
    int a=12;  // In the interface all value are final we cannot change the value manually
    void Speed(int increment);  // in the interface or abstract class the methods have no body
    void speedBreak(int decrement);
}
interface light{
    void lighton();
    void lightoff();
}
class byCycle implements cycle,light{   // we can add more then one interface in a class
    void boloHorn(){  // it's a simple method of byCycle class
        System.out.println("pee pee poo poo...");
    }
    public void Speed(int increment){   // when we add the method in the class form interface we should must be public the method here
        System.out.println("speed up...");
    }
    public void speedBreak(int decrement){
        System.out.println("Speed down...");
    }
    public void lighton(){
        System.out.println("light on koro");
    }
   public void lightoff(){
       System.out.println("light off koro");
   }
}
public class interface_class_54 {
    public static void main(String[] args) {
        byCycle b = new byCycle();
        b.speedBreak(11);
      //  b.a = 10;  // you can't modify the property in interface as they are final
        System.out.println(b.a);
        b.boloHorn();
        b.lighton();
        b.lightoff();
    }
}
