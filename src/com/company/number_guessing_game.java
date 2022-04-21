package com.company;
import java.util.Random;
import java.util.Scanner;
class game{
    public int computer;
    public int input;
    public int numberOfGuess = 0;
    public game() {
        Random random = new Random();
        this.computer = random.nextInt(100);
    }
    public void input() {
       System.out.println("guess the number");
        Scanner sc = new Scanner(System.in);
        this.input= sc.nextInt();
    }
    public boolean isTrue(){
        numberOfGuess++;
        if (computer== input){
            System.out.format("Yes you guessed it right , it was %d \nYou guessed it in %d number of attempts \n",computer,numberOfGuess);
            return true;
        }else if (computer<input){
            System.out.println("lower number please...");
        }else {
            System.out.println("higher number please...");
        }
        return false;
    }
}
public class number_guessing_game {
    public static void main(String[] args) {
         game g = new game();
        boolean b = false ;
         while (!b){
             g.input();
            b = g.isTrue();
         }
    }
}
