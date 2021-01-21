package strings;

public class Mainclass3 
{
	public static String test(String str)
	{
		String res = "";
		
		System.out.println(str.length());
		
		for (int i = 0; i < str.length(); i++) 
		{
			char c1 = str.charAt(i);
			res = res + c1 + c1;
		}
		
		return res;
	}
	public static void main(String[] args) 
	{
      
         
    }
 
}





