package com.company;

class arrayInt{
    // Declaring an array of int values
    int []a;

    public arrayInt(int[] a) {  // Constructor to load the array
        this.a = a;
    }
    void printInt(){  // Method to print the array
        for (int x:a){
            System.out.println(x);
        }
    }
    void reverseArray(){  // Method to reverse the array
        for (int i=0; i<a.length/2; i++){
            int temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
    }
}
public class printing_array {
    public static void main(String[] args) {
        int[] a ={45,88,10};
        arrayInt ar=new arrayInt(a);
        ar.printInt();
        ar.reverseArray();
        ar.printInt();
    }
}
