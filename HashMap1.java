package myfirstapp;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class HashMap1
{
    public static void main(String args[])
    {
        try {
            HashMap<Integer, String> hash = new HashMap<Integer, String>();

            hash.put(1, "David");

            hash.put(2, "Warner");

            hash.put(3, "Elon");

            hash.put(4, "Musk");

            hash.put(5, "Kane");

            //Iterating the elements of HashMap...

            for (Map.Entry x : hash.entrySet()) {
                System.out.println(x.getKey() + " " + x.getValue());
            }

            HashMap1 hash1 = new HashMap1();
            hash1.setView(hash);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void count(HashMap<Integer,String> h)
    {
        try
        {
            System.out.println("Size of HashMap" + h.size());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void copyToAnotherHash(HashMap<Integer,String> h)
    {
        try
        {
            HashMap<Integer,String> hash2=new HashMap<Integer,String>();

            hash2.put(6,"Williamson");

            hash2.put(7,"Adam");

            hash2.putAll(h);

            System.out.println(hash2);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void remove(HashMap<Integer,String> h)
    {
        try
        {
            h.clear();
            System.out.println(h);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void isEmpty(HashMap<Integer,String> h)
    {
        try
        {
            System.out.println(h.isEmpty());

            h.clear();

            System.out.println(h.isEmpty());

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void shallowCopy(HashMap<Integer,String> h)
    {
        try
        {
            HashMap<Integer,String> hash2=new HashMap<Integer,String>();

            hash2=(HashMap<Integer, String>)h.clone();

            System.out.println(hash2);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void containsKey(HashMap<Integer,String> h)
    {
        try
        {
            if(h.containsKey("Warner"))
            {
                System.out.println(h.get("Warner"));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void containsValue(HashMap<Integer,String> h)
    {
        try
        {
            if(h.containsKey("Warner"))
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
    public void getValue(HashMap<Integer,String> h)
    {
        try
        {
            String str=(String)h.get(3);

            System.out.println(str);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void setView(HashMap<Integer,String> h)
    {
        try
        {
            Set set=h.entrySet();

            System.out.println(set);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
