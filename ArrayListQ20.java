package myfirstapp;

import java.util.ArrayList;

public class ArrayListQ20 {
    public static void main(String args[]) {

        //Increase the size of List...

        ArrayList<String> alpha = new ArrayList<String>();
        alpha.add("A");
        alpha.add("B");
        alpha.add("D");
        alpha.add("C");
        System.out.println(alpha);
        alpha.ensureCapacity(6);
        alpha.add("E");
        alpha.add("F");
        System.out.println(alpha);
    }
}
