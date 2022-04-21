package com.company;
class myMainEmployee{  // class
     private int id;
    private String name;
//    public myMainEmployee(){  // constructor
//        id = 23;
//        name="harry";
//    }
      public myMainEmployee(String myName,int myId){  // constructor
          id = myId;
          name=myName;
      }
    public void setName(String n){  // method
        name = n;
    }
    public String getName(){  //  method
        return name;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

}
public class concept_of_constructor {
    public static void main(String[] args) {  // main function
        myMainEmployee sagar = new myMainEmployee("java program",41);
        // sagar.setName("sandip");
        //sagar.setId(14);
        System.out.println(sagar.getId());
        System.out.println(sagar.getName());

    }
}
