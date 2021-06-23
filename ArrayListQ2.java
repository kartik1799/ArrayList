package myfirstapp;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListQ2 {
    public static void main(String args[])
    {
        ArrayList<String> lst=new ArrayList<String>();
        lst.add("A");
        lst.add("B");
        lst.add("C");
        lst.add("D");
        System.out.println(lst);
        Iterator<String> itr=lst.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }
    }
}
