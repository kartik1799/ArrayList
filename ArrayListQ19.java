package myfirstapp;

import java.util.ArrayList;

public class ArrayListQ19 {
    public static void main(String args[]) {

        //Trim a List...

        ArrayList<String> alpha = new ArrayList<String>();
        alpha.add("A");
        alpha.add("B");
        alpha.add("D");
        alpha.add("C");
        System.out.println(alpha);
        alpha.trimToSize();
        System.out.println(alpha);
    }

}
