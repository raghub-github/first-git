package com.company;

class bus{
    public void horn(){
        System.out.println("Peee peeeeee........!");
    }
    public void light(){
        System.out.println("light mode");
    }
}

class plane extends bus{
    @Override
    public void horn(){
        System.out.println("Horn is not working...!");
    }
    public void pilot(){
        System.out.println("Excuse me, I am Pilot");
    }
}
public class class_49_dynamik_method_dispatch {
    public static void main(String[] args) {
        bus bs = new bus();
        bus bspln = new plane();
//        plane pl = new bus();  // not allowed
        bs.horn();
        bspln.horn();  // this method is executed from plane class not bus class
//        bspln.pilot();  // can't access the method by this object
    }
}
