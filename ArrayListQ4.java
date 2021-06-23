package myfirstapp;

import java.util.ArrayList;

public class ArrayListQ4 {
    public static void main(String args[]) {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("A");
        lst.add("B");
        lst.add("C");
        lst.add("D");
        System.out.println(lst);

        //Retreive elements at index.

        String ele=lst.get(0);
        System.out.println("First Element: "+ele);
    }
}
