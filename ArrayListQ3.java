package myfirstapp;

import jdk.dynalink.support.SimpleRelinkableCallSite;

import java.net.StandardSocketOptions;
import java.util.ArrayList;

public class ArrayListQ3 {
    public static void main(String args[])
    {
        ArrayList<String> lst=new ArrayList<String>();
        lst.add("A");
        lst.add("B");
        lst.add("C");
        lst.add("D");
        System.out.println(lst);

        //Inserting elements at index.

        lst.add(0,"Alpha");
        lst.add(5,"E");
        System.out.println(lst);
    }
}
