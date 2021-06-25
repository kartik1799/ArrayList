package myfirstapp;


import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1
{
    public static void main(String args[])
    {
        try
        {
            TreeSet<String> tree = new TreeSet<>();

            tree.add("David");

            tree.add("Warner");

            tree.add("Elon");

            tree.add("Musk");

            tree.add("Elon");

            System.out.println(tree);

            //Iterating..

            for (String e : tree)
            {
                System.out.println(e);
            }

            TreeSet tree1 = new TreeSet();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public void Compare(TreeSet<String> t)
    {
        try
        {
            TreeSet<String> tree2 = new TreeSet<>();

            tree2.add("Warner");

            tree2.add("David");

            for (String s : t)
            {
                System.out.println(tree2.contains(s) ? "Yes" : "No");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void RemoveFirst(TreeSet<String> t)
    {
        try
        {
            System.out.println("Removing the first element:" + t.pollFirst());

            System.out.println(t);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void RemoveLast(TreeSet<String> t)
    {
        try
        {
            System.out.println("Removing the first element:" + t.pollLast());

            System.out.println(t);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void RemoveGivenElement(TreeSet<String> t)
    {
        try
        {
            System.out.println("Removing the given element:" + t.remove("Warner"));

            System.out.println(t);
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void StrictlyGreater(TreeSet<String> t)
    {
        try
        {
            TreeSet<Integer> tree3 = new TreeSet<Integer>();

            tree3.add(10);

            tree3.add(12);

            tree3.add(16);

            tree3.add(28);

            tree3.add(50);

            System.out.println("Strictly greater than 12: " + tree3.higher(12));

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void StrictlyLower(TreeSet<String> t) {
        try {
            TreeSet<Integer> treenum = new TreeSet<Integer>();

            treenum.add(10);

            treenum.add(12);

            treenum.add(16);

            treenum.add(28);

            treenum.add(50);

            System.out.println("Strictly lower than 16: " + treenum.lower(16));

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void Count(TreeSet<String> t)
    {
        try
        {
            System.out.println("Size of TreeSet" + t.size());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void Clone(TreeSet<String> t)
    {
        try {
            TreeSet<String> clone = new TreeSet<String>();

            clone = (TreeSet<String>) t.clone();

            System.out.println(clone);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void Reverse(TreeSet<String> t)
    {
        try {
            Iterator it = t.descendingIterator();

            while (it.hasNext()) {
                System.out.println(it.next());
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void Elementsbelow(TreeSet<String> t)
    {
        try {
            TreeSet<Integer> treenum = new TreeSet<Integer>();

            treenum.add(10);

            treenum.add(12);

            treenum.add(16);

            treenum.add(28);

            treenum.add(50);

            TreeSet<Integer> tree2 = new TreeSet<Integer>();

            tree2 = (TreeSet<Integer>) treenum.headSet(16);

            Iterator itr = tree2.iterator();

            while (itr.hasNext()) {
                System.out.println(itr.next());
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}









