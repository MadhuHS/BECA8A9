package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Mainclass 
{
	public static void main(String[] args) 
	{
      HashSet<String> hs = new HashSet<String>();
      
      hs.add("aaa");
      hs.add("bbb");
      hs.add("fff");
      hs.add(null);
      hs.add("bbb");
      
      System.out.println(hs);
      
       hs.stream()
         .filter(str -> str!=null)
         .forEach(str -> System.out.println(str));
      
       Iterator<String> i1 = hs.iterator();
       while(i1.hasNext())
       {
         System.out.println(i1.next());
       }
  
	}
}




