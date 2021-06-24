package myfirstapp;

import java.util.ArrayList;

public class ArrayListQ15 {
    public static void main(String args[]) {

        //Join a List...

        ArrayList<String> alpha = new ArrayList<String>();
        alpha.add("A");
        alpha.add("B");
        alpha.add("D");
        alpha.add("C");
        ArrayList<String> alphabet = new ArrayList<String>();
        alphabet.add("A");
        alphabet.add("B");
        alphabet.add("E");
        alphabet.add("D");
        ArrayList<String> join = new ArrayList<String>();
        join.addAll(alpha);
        join.addAll(alphabet);
        System.out.println(join);
    }
}
