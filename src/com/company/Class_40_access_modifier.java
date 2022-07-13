package com.company;

class myEmployee1{
   private int id;
   public myEmployee1(){  // Constructor invoke automatically
       id = 98;
       name = "Akash + Arpita ❤🌹💖✔🎁💋💋💋💕😍😘";
   }
   private String name;
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class Class_40_access_modifier {
    public static void main(String[] args) {
        myEmployee1 emp = new myEmployee1();
//        emp.name = "Anindra";
//        emp.id = 59;   // Throns an error due to eccess modifier
//          emp.setId(59);
//          emp.setName("Anindra");
        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }
}
