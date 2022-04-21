package com.company;

public class java_docs {
    /**
     *
     * @param args This method is a main method for adding two number
     */
    public static void main(String[] args) {
        System.out.println("I am a main method");
    }
    /**
     *
     * @param a a is the first parameter
     * @param b b is the second parameter
     * @return return type is an integer of a+b
     * @throws Exception if a is 0
     * @deprecated This method is deprecated please use + operator
     */
    public int add(int a, int b) throws Exception{
        if (a==0){
            throw new Exception();
        }
        int c;
        c=a+b;
        return c;
    }
}
