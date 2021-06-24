package myfirstapp;

import java.util.ArrayList;

public class ArrayListQ21 {
    public static void main(String args[]) {

        //Replace  a element in a List...

        ArrayList<String> alpha = new ArrayList<String>();
        alpha.add("A");
        alpha.add("B");
        alpha.add("D");
        alpha.add("C");
        String newalpha = "E";
        alpha.set(1, newalpha);
        for (String e : alpha) {
            System.out.println(e);
        }
    }
}
