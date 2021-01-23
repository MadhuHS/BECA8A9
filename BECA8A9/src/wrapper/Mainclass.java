package wrapper;

public class Mainclass 
{
    public static void printOutput(Object ref)
    {
    	System.out.println(ref);
    }
      
	public static void main(String[] args) 
	{
        int i1 = 10;        
        double d1 = 4.2;
        
        Integer i2 = i1;//AutoBoxing
        Double  d2 = d1;//AutoBoxing
        
        String s1 = new String("hello");
        printOutput(i2);
        printOutput(d2);
        printOutput(s1);
        
        Object obj1 = "hello";
        Object obj2 = 10;// Object obj2 = new Integer(10)
        /*
         * When we try to store primitive value to REFERENCE var
         * of OBJECT CLASS
         * 
         * 1.JVM will create the object of corresponding Wrapper Class
         * 2.Assisgn address to REFRNCE var of OBJECT class and
         *   perform upcasting
         */
        
        Integer v1 = 100;
        Integer v2 = 200;
        Integer v3 = v1 + v2;
        System.out.println(v3);
        
        int a1 = 20;
        int b1 = 10;
       
       int mx =  Integer.max(a1, b1);
       System.out.println(mx);
       
       int mn =  Integer.min(a1, b1);
       System.out.println(mn);
        
	}

}





