package com.company;

class boundedgeneric<T extends Number>{  // This is the syntax of upper bounded generic class,
    // if we not declare the upper bound then average method will Throw a compile time error
    T[] array;
    boundedgeneric (T[] t){  // Constructor to load the array
        this.array = t;
    }
     void average(){
        double sum = 0.0;
        for (T t : array) {
            sum += t.doubleValue();
        }
         System.out.println(sum/array.length);
     }
}
public class upper_bounded_generic_class {
    public static void main(String[] args) {
        Integer[] ar = {41,88,752};
//        String st = "Raghu Bhunia";
        boundedgeneric<Integer> bg = new boundedgeneric<>(ar);
        bg.average();
//        boundedgeneric<String> ds = new boundedgeneric<String>(st); // Throw error on compile time
    }
}
