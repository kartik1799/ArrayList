package myfirstapp;

import java.util.ArrayList;
import java.util.*;

public class ArrayListQ12 {
    public static void main(String args[]) {

        //Extract a portion of List...

        ArrayList<String> lst = new ArrayList<String>();
        lst.add("A");
        lst.add("B");
        lst.add("D");
        lst.add("C");
        System.out.println(lst);
        List<String> sub = lst.subList(0, 3);
        System.out.println(sub);
    }
}
