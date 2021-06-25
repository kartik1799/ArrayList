package myfirstapp;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class TreeMap1
{
    public static void main(String args[])
    {
        try
        {
            TreeMap<Integer, String> treemap = new TreeMap<>();

            treemap.put(1, "David");

            treemap.put(2, "Warner");

            treemap.put(3, "Elon");

            treemap.put(4, "Musk");

            treemap.put(5, "Kane");

            //Iterating the elements of HashMap...

            System.out.println(treemap);

            for (Map.Entry x : treemap.entrySet())
            {
                System.out.println(x.getKey() + " " + x.getValue());
            }

            TreeMap1 hash1 = new TreeMap1();
            hash1.count(treemap);
            hash1.sortKeysUsingComparator(treemap);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void count(TreeMap<Integer,String> t)
    {
        try
        {
            System.out.println("Size of TreeMap" + t.size());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void copyToAnotherTree(TreeMap<Integer,String> t)
    {
        try
        {
            TreeMap<Integer,String> treemap2=new TreeMap<Integer,String>();

            treemap2.put(6,"Curran");

            treemap2.put(7,"Adam");

            treemap2.putAll(t);

            System.out.println(treemap2);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void containsKey(TreeMap<Integer,String> t)
    {
        try
        {
            if(t.containsKey(2))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void containsValue(TreeMap<Integer,String> t)
    {
        try
        {
            if(t.containsValue("Elon"))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void getAllKeys(TreeMap<Integer,String> t)
    {
        try
        {
            Set<Integer> set=t.keySet();

            for(Integer s:set)
            {
                System.out.println(s);
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void greatestLower(TreeMap<Integer,String> t)
    {
        try
        {
            System.out.println(t.firstEntry());

            System.out.println(t.lastEntry());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void sortKeysUsingComparator(TreeMap<Integer,String> t)
    {
        try
        {
            TreeMap<Integer, String> treemap2 = new TreeMap<Integer,String>();

            treemap2.put(2, "David");

            treemap2.put(3, "Warner");

            treemap2.put(5, "Elon");

            treemap2.put(4, "Musk");

            treemap2.put(1, "Kane");

            System.out.println(treemap2);

            class sort implements Comparator<String>
            {
                public int compare(String s1,String s2)
                {
                    return s1.compareTo(s2);
                }
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void reverse(TreeMap<Integer,String> t)
    {
        try
        {
            System.out.println(t.descendingKeySet());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void greatestEntryEqualToLowerToKey(TreeMap<Integer,String> t)
    {
        try
        {
            System.out.println(t.floorEntry(3));

            System.out.println(t.floorEntry(6));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void greatestKeyLessThanOrEqualToKey(TreeMap<Integer,String> t)
    {
        try
        {
            System.out.println(t.floorKey(4));

            System.out.println(t.floorKey(6));
        }
        catch (Exception e) {

            e.printStackTrace();
        }
    }
    public void strictlyLessThanKey(TreeMap<Integer,String> t)
    {
        try
        {
            System.out.println(t.headMap(1));

            System.out.println(t.headMap(4));

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void strictlyLessOrEqual(TreeMap<Integer,String> t)
    {
        try
        {
            System.out.println(t.headMap(1, true));

            System.out.println(t.headMap(4, true));

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void leastKeyStrictlyGreater(TreeMap<Integer,String> t)
    {
        try
        {
            System.out.println(t.higherEntry(1));

            System.out.println(t.higherEntry(5));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void greatestKeyStrictlyLower(TreeMap<Integer,String> t)
    {
        try
        {
            System.out.println(t.lowerEntry(1));

            System.out.println(t.lowerEntry(5));

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }




}
