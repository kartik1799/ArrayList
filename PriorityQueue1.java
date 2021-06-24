package PriorityQueue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PriorityQueue1
{
    public static void main(String args[])
    {
        try
        {
            PriorityQueue<String> queue = new PriorityQueue<String>();

            queue.add("David");

            queue.add("Warner");

            queue.add("Elon");

            queue.add("Musk");

            System.out.println(queue);

            //Iterating..

            for (String e : queue)
            {
                System.out.println(e);
            }

            PriorityQueue1 queue1 = new PriorityQueue1();

            queue1.Compare(queue);

        }

        catch (Exception e)
        {
            e.printStackTrace();
        }



    }
    public void join(PriorityQueue<String> q)
    {
        try
        {
            PriorityQueue<String> queue2 = new PriorityQueue<String>();

            queue2.add("Kane");

            queue2.add("Williamson");

            q.addAll(queue2);

            System.out.println(q);
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
    public void InsertingElement(PriorityQueue<String> q)
    {
        try {
            q.offer("Kane");

            System.out.println(q);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void RemoveAll(PriorityQueue<String> q)
    {
        try
        {
            q.clear();

            System.out.println(q);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void Count(PriorityQueue<String> q)
    {
        try
        {
            System.out.println("Size of PriorityQueue"+q.size());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void Compare(PriorityQueue<String> q)
    {
        try
        {
            PriorityQueue<String> queue2 = new PriorityQueue<String>();

            queue2.add("Elon");

            queue2.add("David");

            for(String s:q)
            {
                System.out.println(queue2.contains(s)?"Yes":"No");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void Remove(PriorityQueue<String> q)
    {
        try
        {
            System.out.println("Removing the first element:"+q.poll());

            System.out.println(q);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void ConvertArrayList(PriorityQueue<String> q)
    {
        try
        {
            ArrayList<String> arr=new ArrayList<String>(q);

            System.out.println(arr);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void ToString(PriorityQueue<String> q)
    {
        try
        {
            String s;

            s=q.toString();

            System.out.println(s);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void MaximumPriorityQueue(PriorityQueue<String> q)
    {
        try
        {
            String val=null;

            while((val=q.poll())!=null)
            {
                System.out.println(val+" ");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
