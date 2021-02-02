package priorityqueue;

import java.util.PriorityQueue;

public class Mainclass 
{
	public static void main(String[] args) 
	{
       PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
       
       pq.add(4);
       pq.add(1);
       pq.add(3);
       pq.add(4);
       pq.add(2);
       pq.add(5);
       
       System.out.println("Size : "+pq.size());
       
       while(pq.isEmpty() == false)
       {
         System.out.println(pq.poll());
       }
       
       System.out.println("Size : "+pq.size());
	}
}
