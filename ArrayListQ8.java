package myfirstapp;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListQ8 {
    public static void main(String args[]) {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("A");
        lst.add("B");
        lst.add("D");
        lst.add("C");
        System.out.println(lst);

        //Sorting an array....

        Collections.sort(lst);
        System.out.println(lst);
    }
}
