package myfirstapp;

import java.util.ArrayList;

public class ArrayListQ16 {
    public static void main(String args[]) {

        //Clone a List...

        ArrayList<String> alpha = new ArrayList<String>();
        alpha.add("A");
        alpha.add("B");
        alpha.add("D");
        alpha.add("C");
        System.out.println(alpha);

        ArrayList<String> clone = (ArrayList<String>) alpha.clone();
        System.out.println(clone);
    }
}
