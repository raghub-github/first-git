package com.company;

public class array_swapping_06 {
    public static void main(String[] args) { //  method of swapping an array
        int[] arr={1,2,3,4,5,6,7,8};
        swapping( arr);
    }
    static void swapping (int []arr){
        int l=arr.length;
        int n=Math.floorDiv(l,2);
        int temp;
        for (int i=0; i<n; i++){
            temp = arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }
        for (int element:arr){
            System.out.print(element +" ");
        }
    }
}
