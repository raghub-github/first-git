package com.company;
abstract class pen{
   abstract void refile();
   abstract void write();
}
class fountainPen extends pen{
    @Override
     void refile(){
         System.out.println("refile");
     }
     @Override
     void write(){
         System.out.println("write");
    }
    void changeName(){
        System.out.println("changing the name...");
    }
}
interface basicHuman{
    void jump();
    void eat();
}
class monkey implements basicHuman{
    @Override
    public void jump(){
        System.out.println("jumping...");
    }
    @Override
    public void eat(){
        System.out.println("eating...");
    }
    public  void speak(){
        System.out.println("Hello sir !");
    }
}
public class practice_set_59 {
    public static void main(String[] args) {
        fountainPen fn = new fountainPen();
        fn.changeName();
        fn.refile();

        monkey mn = new monkey();
        mn.eat();
        mn.speak();
    }
}
