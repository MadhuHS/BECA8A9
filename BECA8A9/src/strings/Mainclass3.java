package strings;

public class Mainclass3 
{
	public static String test(String str)
	{
		String res = "";
		StringBuilder sb1 = new StringBuilder("");
		
		System.out.println(str.length());
		
		for (int i = 0; i < str.length(); i++) 
		{
			char c1 = str.charAt(i);
			sb1 = sb1.append(c1);// sb1 = sb1 + c1
			sb1 = sb1.append(c1);
		}
		
		res = sb1.toString();
		return res;
	}
	public static void main(String[] args) 
	{
      System.out.println(test("aaa"));
    }
}





