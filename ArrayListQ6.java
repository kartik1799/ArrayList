package myfirstapp;

import java.util.ArrayList;

public class ArrayListQ6 {

    //Removing the array Elements...

    public static void main(String args[]) {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("A");
        lst.add("B");
        lst.add("C");
        lst.add("D");
        System.out.println(lst);

        lst.remove(2);
        System.out.println(lst);
    }
}
