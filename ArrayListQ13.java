package myfirstapp;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQ13 {
    public static void main(String args[]) {

        //Compare a List...

        ArrayList<String> alpha = new ArrayList<String>();
        alpha.add("A");
        alpha.add("B");
        alpha.add("D");
        alpha.add("C");
        ArrayList<String> alphabet = new ArrayList<String>();
        alphabet.add("A");
        alphabet.add("B");
        alphabet.add("E");
        alphabet.add("C");
        ArrayList<String> compare = new ArrayList<String>();
        for (String e : alpha)
            compare.add(alphabet.contains(e) ? "Yes" : "No");
        System.out.println(compare);
    }
}
