package com.company;
class c1{
    public int a = 10;
    private int b = 12;
    int c = 14;
    protected int d = 16;
    public void printing(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class access_modifier {
    public static void main(String[] args) {
        c1 c = new c1();
        c.printing();  //  we can access all the modifier in the same class
        // we can not access the all except privet access modifier in the same package
        // we can not access the all except privet and default access modifier in the subclass
        // we can not access the all except privet, protected and default access modifier in the world
    }
}
