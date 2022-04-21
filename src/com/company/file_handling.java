package com.company;

import java.awt.print.PrinterIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_handling {
    public static void main(String[] args){

        // code create a new file...
        /*
         File myFile = new File("firstFile.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }


        // code to write to a file
        try {
            FileWriter fileWriter = new FileWriter("firstFile.txt");
            fileWriter.write("This is the first file of java program \nokay now bye");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        // code for reading a file
        File myFile = new File("firstFile.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        */

        // code for deleting aq file
        File myFile = new File("firstFile.txt");
        if (myFile.delete()){
            System.out.println("I am deleted now "+myFile.getName());
        }else {
            System.out.println("some problem occurred to deleting the file!!");
        }
    }
}
