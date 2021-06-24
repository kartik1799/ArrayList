package myfirstapp;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListQ14 {
    public static void main(String args[]) {

        //Swap a List...

        ArrayList<String> alpha = new ArrayList<String>();
        alpha.add("A");
        alpha.add("B");
        alpha.add("D");
        alpha.add("C");

        for (String e : alpha) {
            System.out.println(e);
        }
        Collections.swap(alpha, 0, 2);

        for (String e : alpha) {
            System.out.println(e);
        }
    }
}
