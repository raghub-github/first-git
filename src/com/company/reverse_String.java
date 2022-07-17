package com.company;

class stringReverse<T>{  // Actually It's not reverse all letter of the String one by one ....
    T[] b;

    public stringReverse(T[] b) {
        this.b = b;
    }

    public T getB(int i) {
        return this.b[i];
    }
    void printData(T[] b){
        for (int i=0; i<b.length; i++){
            System.out.println(getB(i) + " ");
            System.out.println();
        }
    }
    void reverse(T[] b){
        for (int j=0; j<b.length/2; j++){
            T temp=b[j];
            b[j]=b[b.length-1-j];
            b[b.length-1-j]=temp;
        }
    }
}
public class reverse_String {
    public static void main(String[] args) {
        String[] st = {"Raghu", "Bhunia"};
        stringReverse<String> sr = new stringReverse<>(st);
        sr.printData(st);
        sr.reverse(st);
        sr.printData(st);
    }
}
