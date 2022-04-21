package com.company;
class base{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("I am in base class and I am a constructor");
        this.name = name;
    }

}
class derive extends base{
    private  int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("I am in derive class ");
        this.id = id;
    }
}

public class concept_of_inheritance {
    public static void main(String[] args) {
        // creating a object of base class
      base b = new base();
      b.setName("raghu");
        System.out.println(b.getName());

        // creating an object of derive class

        derive d = new derive();
        d.setName("rahul");
        System.out.println(d.getName());

        d.setId(12);
        System.out.println(d.getId());
    }
}
