package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSet1 {
    public static void main(String args[]) {
        try {
            HashSet<String> string = new HashSet<String>();
            string.add("David");
            string.add("Warner");
            string.add("Elon");
            string.add("Musk");
            string.add("David");

            //Printing the Set...
            System.out.println(string);


            //Iterate the Set.....
            for (String e : string) {
                System.out.println(e);
            }

            System.out.println(" ");

            //To get number of elements in set....

            System.out.println(string.size());
            System.out.println(" ");

            //Empty an hash set...

            //string.removeAll(string);

            //Set is empty or not...

            System.out.println(string.isEmpty());
            System.out.println(" ");

            //clone a set to another....

            HashSet<String> clone = new HashSet<String>();
            clone = (HashSet) string.clone();
            System.out.println(clone);
            System.out.println(" ");

            //Convert a set to array...

            String[] arr = new String[string.size()];
            string.toArray(arr);

            for (String e : arr) {
                System.out.println(e);
            }

            System.out.println(" ");

            //Convert Hash Set to Tree Set...

            TreeSet<String> tree = new TreeSet<String>(string);
            System.out.println(tree);

            System.out.println(" ");

            //Convert hash set to Array List....

            ArrayList<String> array = new ArrayList<String>(string);
            System.out.println(array);

            System.out.println(" ");

            int data=50/0;  //Exception occurs...

            //Retain elements which are same....

            HashSet<String> string1 = new HashSet<String>();
            string1.add("David");
            string1.add("Curran");
            string1.add("Elon");
            string1.add("Kane");
            string1.add("David");

            string.retainAll(string1);
            System.out.println(string);

            System.out.println(" ");

            //Remove all elements....

            string.clear();
            System.out.println(string);
        }
        catch (Exception e){
            e.printStackTrace();
        }



    }
}
