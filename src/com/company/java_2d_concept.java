package com.company;

public class java_2d_concept {
    public static void main(String[] args) {
        int[][] flats=new int[3][4];
        flats[0][0]=100;
        flats[0][1]=101;
        flats[0][2]=102;
        flats[0][3]=103;
        flats[1][0]=200;
        flats[1][1]=201;
        flats[1][2]=202;
        flats[1][3]=203;
        flats[2][0]=300;
        flats[2][1]=301;
        flats[2][2]=302;
        flats[2][3]=303;
        // Displaying the 2-d Array using the for loop
        for(int i=0; i<flats.length; i++){
            for(int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print("  ");
            }
            System.out.print(" \n");
        }
    }
}
