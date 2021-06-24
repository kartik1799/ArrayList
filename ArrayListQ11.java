package myfirstapp;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListQ11 {
    public static void main(String args[]) {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("A");
        lst.add("B");
        lst.add("C");
        lst.add("D");

        // Reverse a list...

        System.out.println(lst);
        Collections.reverse(lst);
        System.out.println(lst);
    }
}
