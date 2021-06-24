package myfirstapp;

import java.util.ArrayList;

public class ArrayListQ18 {
    public static void main(String args[]) {

        //Swap a List...

        ArrayList<String> alpha = new ArrayList<String>();
        alpha.add("A");
        alpha.add("B");
        alpha.add("D");
        alpha.add("C");
        System.out.println(alpha.isEmpty());

        alpha.removeAll(alpha);
        System.out.println(alpha.isEmpty());
    }
}
