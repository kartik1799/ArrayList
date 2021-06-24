package myfirstapp;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListQ9 {
    public static void main(String args[]) {

        //Copy elements from one list to another...

        ArrayList<String> lst = new ArrayList<String>();
        lst.add("1");
        lst.add("2");
        lst.add("3");
        lst.add("4");
        System.out.println(lst);
        ArrayList<String> lstq = new ArrayList<String>();
        lstq.add("A");
        lstq.add("B");
        lstq.add("C");
        lstq.add("D");
        System.out.println(lstq);
        Collections.copy(lst, lstq);
        System.out.println(lst);
        System.out.println(lstq);
    }
}
