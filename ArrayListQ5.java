package myfirstapp;

import java.util.ArrayList;

public class ArrayListQ5 {
    public static void main(String args[]) {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("A");
        lst.add("B");
        lst.add("C");
        lst.add("D");
        System.out.println(lst);

        //Changing elements at index.

        lst.set(2, "A");
        System.out.println(lst);
    }
}
