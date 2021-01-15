package strings;

public class Mainclass {

	public static void main(String[] args) 
	{
        String str  = new String("jspiders");
        String str2 = new String("JSPIDERS");
                
        int len = str.length();
        System.out.println(len);
        
        char c1 = str.charAt(3);
        System.out.println(c1);
        
        int idx = str.indexOf('s');
        System.out.println(idx);
        
        int idx2 = str.indexOf('s',2);
        System.out.println(idx2);
        
        boolean b1 = str.equals(str2);
        System.out.println(b1);
        
        boolean b2 = str.equalsIgnoreCase(str2);
        System.out.println(b2);
        
        String subStr = str.substring(0,3);
        System.out.println(subStr);
        
	}

}



