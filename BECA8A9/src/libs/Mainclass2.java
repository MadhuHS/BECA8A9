package libs;

class Demo extends Object 
{
	@Override
	public int hashCode() 
	{
		return 10;
	}

	@Override
	public String toString() 
	{
	  String returnValue = "toString() is overriden";
	  return returnValue;
	}

}

public class Mainclass2 {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo();

		int h1 = d1.hashCode();
		System.out.println(h1);

		int h2 = d2.hashCode();
		System.out.println(h2);

		String s1 = d1.toString();
		System.out.println(s1);

		boolean b1 = d1.equals(d2);
		System.out.println(b1);

	}
}
