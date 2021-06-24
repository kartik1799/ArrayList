package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList2 {

    public static void main(String args[]) {

        //Join a List...

        LinkedList<String> string = new LinkedList<String>();
        string.add("David");
        string.add("Warner");
        string.add("Elon");
        string.add("Musk");
        LinkedList<String> string2 = new LinkedList<String>();
        string2.add("Kane");
        string2.add("Williamson");
        LinkedList<String> join = new LinkedList<String>();
        join.addAll(string);
        join.addAll(string2);

        System.out.println(join);
        System.out.println(" ");

        //Clone a linked list....
        LinkedList<String> clone = new LinkedList<String>();
        clone = (LinkedList) string.clone();

        System.out.println(clone);
        System.out.println(" ");

        //Remove first element....
        string.pop();
        System.out.println(string);

        System.out.println(" ");

        //Retreive first element....

        System.out.println(string.peekFirst());
        System.out.println(string);
        System.out.println(" ");

        //Convert Linkedlist to ArrayList....

        ArrayList<String> array = new ArrayList<String>(string);
        for (String e : array) {
            System.out.println(e);
        }

        System.out.println(" ");

        //Replace an element in linkedlist....

        string.set(0, "Kane");
        System.out.println(string);
    }



}
