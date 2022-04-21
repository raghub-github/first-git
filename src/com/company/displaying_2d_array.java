package com.company;

public class displaying_2d_array {
    public static void main(String[] args) { // printing the 2d array as a array
        int[][] num = {{10,4,6},{12,11,3}};
        int[][] num1 = {{13,1,4},{14,9,8}};
        int[][] result = {{0,0,0},{0,0,0}};
        for (int i=0; i<num.length; i++){
            for (int j=0; j<num[i].length; j++){
                result[i][j] = num[i][j]+num1[i][j];
                System.out.print(result[i][j]+" ");

            }
            System.out.println();
        }

    }
}
