package com.company;

public class Array_insertion {
    public static void printArray(int[] arr){
        for(int a: arr){
            System.out.print(a+ " ");
        }
        System.out.println();
    }
    public static void insertElement(int[] arr,int[] ar, int k, int x){
        int n=ar.length;
         while (n>=k){
             ar[n-1]=arr[n-2];
             n=n-1;
         }
         int i=0;
         while (k>i){
             ar[i]=arr[i];
             i=i+1;
         }
         ar[k]=x;
    }
    public static void main(String[] args) {
        int[] arr = {22, 99, 78, 40, 91, 53, 37};
        int[] ar= new int[arr.length+1];
        System.out.println("old array");
        printArray(arr);
        int k = 2;  // insertion position
        int x=10;  // value of the element
        insertElement(arr,ar,k,x);
        System.out.println("new array");
        printArray(ar);
    }

}
