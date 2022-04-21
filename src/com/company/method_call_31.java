package com.company;

public class method_call_31 {
    static int over(int x, int y){

        int c1;
        if (x>y){
            c1=x+y;
        }else {
            c1=(x+y)*5;
        }
        return c1;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c;

        if (a>b){
            c=a+b;
        }else {
            c=(a+b)*5;
        }
        System.out.println(c);
       // method_call_31 obj=new method_call_31();  // second method by creating object

        int z;
       // z=obj.over(a,b);// second method
        z= over(a,b);  // method calling first method
        System.out.println(z);


    }
}
