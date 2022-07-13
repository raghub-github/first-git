package com.company;

class genericArray<T>{
    T[] a;

    public genericArray(T[] x) {
        a = x;
    }

    public T getA(int i) {
        return a[i];
    }
    void printData(T []b){
        for (int i=0; i<b.length; i++){
            System.out.println(getA(i));
            System.out.println();
        }
    }
    void reverseArray(T []b){
        for (int j=0; j<b.length/2; j++){
            T temp=b[j];
            b[j]=b[b.length-1-j];
            b[b.length-1-j]=temp;
        }
    }
}
public class generic_array {
    public static void main(String[] args) {
        Integer[] x ={10,20,30,40};
        genericArray<Integer> gn=new genericArray<>(x);
        gn.printData(x);
        gn.reverseArray(x);
        gn.printData(x);
    }
}
