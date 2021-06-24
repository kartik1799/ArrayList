package LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedList1 {
    public static void main(String args[]) {

        LinkedList<String> string = new LinkedList<String>();
        string.add("Aman");
        string.add("Bob");
        string.add("Daman");
        string.add("Caesar");

        //Printing the linked list...
        System.out.println(string);


        //Iterate the list.....
        for (String e : string) {
            System.out.println(e);
        }

        System.out.println(" ");
        System.out.println(" ");


        //Iterate at a specified index....
        Iterator itr = string.listIterator(1);
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println(" ");
        System.out.println(" ");

        //Iterating list in reverse order.....
        Iterator it = string.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(" ");
        System.out.println(" ");

        //Insert the specified element at the specified position.....

        string.add(1, "John");
        System.out.println(string);


        //Inserting elements at first and last position....

        string.addFirst("Kane");
        string.addLast("Williamson");

        System.out.println(string);

        System.out.println(" ");
        System.out.println(" ");

        //Inserting element at front of list....

        string.offerFirst("David");
        System.out.println(string);

        System.out.println(" ");
        System.out.println(" ");


        //Insert element at the end of list....

        string.offerLast("Warner");
        System.out.println(string);

        System.out.println(" ");
        System.out.println(" ");

        //Inserting some elements at the specified position in th list....

        LinkedList<String> newlist= new LinkedList<String>();
        newlist.add("Elon");
        newlist.add("Musk");
        string.addAll(1,newlist);

        System.out.println(string);
        System.out.println(" ");
        System.out.println(" ");

        //Retreiving the first and last element...

        System.out.println("First element:"+ string.getFirst());
        System.out.println("Last element:"+string.getLast());

        //Display elements and their positions....

        for(int i=0;i< string.size();i++)
        {
            System.out.println("Element at index "+i+" is: "+string.get(i));
        }

        //Removing the specified element...

        string.remove(2);
        System.out.println("After removing:"+string);

        //Swap two elements....
        Collections.swap(string,0,1);
        System.out.println(string);

        //Shuffle the elements...
        Collections.shuffle(string);
        System.out.println(string);





    }


}
