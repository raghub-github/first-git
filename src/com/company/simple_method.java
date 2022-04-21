package com.company;

public class simple_method {
    static void tellJoke(){
        System.out.println("Sorry, I don't know any joke");
    }
    static void change(int a){
        a=90;
    }
    static void change2(int[] arr){
        arr[0]=98;
    }

    public static void main(String[] args) {
        tellJoke();
        //Cased 1 : try to changing the integer
//        int x=77;
//        change(x);
//        System.out.println("The value of x after change : "+x); // it's can't change


        //Cased 2 : try to changing the Array
        int [] marks={52,63,87,59,86};
        change2(marks);
        System.out.println("The value of marks after changing :"+marks[0]);//it's changed because it's sending reference

    }
}
