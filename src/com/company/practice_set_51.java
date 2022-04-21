package com.company;
import java.util.Scanner;
class circle{
    public int radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public circle(int r) {
        System.out.println("radius of circle is : "+r);
        this.radius = r;
    }
}
class cylinder extends circle{
    public int height;
    public double volume(){
        return Math.PI*height*radius*radius;
    }
    public cylinder(int height, int r) {
        super(r);
        System.out.println("height of cylinder : "+height);
        this.height = height;
    }
}
public class practice_set_51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height");
        int height=sc.nextInt();
        System.out.println("Please enter the radius");
        int radius=sc.nextInt();
        cylinder c = new cylinder(height,radius);
        System.out.println("The area of the circle is "+c.area());
        System.out.println("The volume of the cylinder is : "+c.volume());
    }
}
