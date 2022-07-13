package com.company;


class static_generic_method {
    // Defining a static generic method to print any data type
    static<T> void printGeneric(T t){
        // The following statement print which type parameter T this method is handling
        System.out.println(t.getClass().getName() + ":" + t);
    }
    public static void main(String[] args) {

        printGeneric(1005544150);  // Calling generic method with integer argument
        printGeneric("Play with java");  // Calling generic method with String argument
        printGeneric('w');  // Calling generic method with Char argument
    }
}
