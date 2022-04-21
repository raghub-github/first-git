package com.company;
class phone{
    public void greed(){
        System.out.println("I am a phone");
    }
    public void on(){
        System.out.println("switch on the phone");
    }
}
class smartPhone extends phone{
    @Override
    public void greed(){
        System.out.println("I am a smart phone");
    }
    @Override
    public void on(){
        System.out.println("switch on the smart phone");
    }
    public  void  extra(){
        System.out.println("I am not in the phone");
    }
}
public class object_creation_and_polymorphism {
    public static void main(String[] args) {
       // phone obj = new phone();
       // obj.greed();
        phone obj = new smartPhone();  // allowed , it's a dynamic method dispatching
        obj.greed();  //  that is a run time polymorphism
        obj.on();
        //  obj.extra();  // not allowed because the extra method is not in the phone class...
       // smartPhone obj1 = new phone();  // not allowed
    }
}
