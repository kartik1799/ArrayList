package myfirstapp;

import java.util.ArrayList;

public class ArrayListQ7 {
    public static void main(String args[]) {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("A");
        lst.add("B");
        lst.add("C");
        lst.add("D");
        System.out.println(lst);

        //Searching an element...

        if (lst.contains("B")) {
            System.out.println("Found the element");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
