package strings;

public class Mainclass4 
{	
	public static void main(String[] args) 
	{
       StringBuffer sb1 = new StringBuffer("hello");
       StringBuffer sb2 = new StringBuffer("hello");
       
       String s1 = new String("hello");
       String s2 = new String("hello");      
       
       System.out.println(s1.hashCode());
       System.out.println(s2.hashCode());
       
       System.out.println(sb1.hashCode());
       System.out.println(sb2.hashCode());      
       
       System.out.println(sb1.toString());
       
       System.out.println(sb1.equals(sb2));
    }
}





