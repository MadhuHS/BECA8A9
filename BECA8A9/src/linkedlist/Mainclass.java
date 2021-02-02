package linkedlist;

import java.util.LinkedList;

public class Mainclass {

	public static void main(String[] args) {
		 LinkedList<Integer> list = new LinkedList<Integer>();
	       
	       list.add(1);
	       list.add(2);
	       list.add(3);
	       list.add(3);
	       list.add(null);
	       list.add(4);
	       list.add(5);
	       list.add(6);
	       list.add(null);
	       
	       System.out.println("Size : "+list.size());
	       
	       for(int index = 0; index<list.size(); index++)
	       {
	    	   System.out.println(list.get(index));//list
	       }
	       
	       System.out.println("Size : "+list.size());
	       
	       while(list.isEmpty() == false)
	       {
	         System.out.println(list.poll());//queue
	       }
	       
	       System.out.println("Size : "+list.size());
	}

}
