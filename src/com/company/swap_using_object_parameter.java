package com.company;
public class swap_using_object_parameter {
class person{
    String name;
    float marks;
   person(String name, float marks){  // not working
        this.name=name; this.marks=marks;
    }
}
class swap{
    public <object> void swaping(object x, object y){
        object t;
        t=x;
        x=y;
        y=t;
    }
}
    public void main(String[] args) {
        Object p = new person("Raghu",52.1f);
        Object p1= new person("Anindra",68.90f);
        swap sp = new swap();
        sp.swaping(p,p1);
        System.out.println(p);
        System.out.println(p1);
    }
}
