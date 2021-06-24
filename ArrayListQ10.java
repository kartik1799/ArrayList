package myfirstapp;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListQ10 {
    public static void main(String args[]) {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("A");
        lst.add("B");
        lst.add("D");
        lst.add("C");
        System.out.println(lst);

        //Shuffle the elements of ArrayList...

        Collections.shuffle(lst);
        System.out.println(lst);
    }
}
