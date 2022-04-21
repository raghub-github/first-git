package com.company;


class invalidInputException extends Exception{
    @Override
    public String toString() {
        return "can't add 8 and 9";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
class maxValueException extends Exception{
    @Override
    public String toString() {
        return "input cannot be grater then 10000";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
class cannotDivedByZeroException extends Exception{
    @Override
    public String toString() {
        return "can't divide by 0";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
class customCalculator {
    double add(double a, double b) throws invalidInputException{
        if (a==8 || b==9){
            throw new invalidInputException();
        }
        return a+b;
    }
    double subtract(double a, double b){
        return a-b;
    }
    double multiply(double a, double b)throws maxValueException{
        if (a>10000 || b>10000){
            throw new maxValueException();
        }
        return a*b;
    }
    double division(double a, double b) throws cannotDivedByZeroException{
        if (b==0){
            throw new cannotDivedByZeroException();
        }
        return a/b;
    }
}
public class custom_calculator {
    public static void main(String[] args) throws invalidInputException,cannotDivedByZeroException,maxValueException{
        /*
        Creating a calculator and through some custom Exception
         */
        customCalculator c = new customCalculator();
        c.add(8,9);
        c.division(155,0);
    }
}
