package com.company;
public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> l1 = new java.util.ArrayList<>();
        java.util.ArrayList<Integer> l2 = new java.util.ArrayList<>();
        l1.add(52);
        l1.add(25);
        l1.add(70);
        l1.add(88);
        l1.add(96);
        l1.add(41);
        l2.add(4);
        l2.add(1);
        l2.add(0,9);
        l2.add(0,8);  // we can add different element in the same index in a same ArrayList
        l1.addAll(0,l2);  // The array l2 will be add from index 0 when we declare the index number
        System.out.println(l1.indexOf(9));
        System.out.println(l1.contains(41));   // returning boolean value
        l1.set(2,520); // for adding a number in the particular index
        //  l1.clear();  // clear the array
//        for (int i=0; i<l1.size(); i++){
//            System.out.println(l1.get(i));
//        }
    }
}
