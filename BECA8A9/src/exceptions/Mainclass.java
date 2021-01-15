package exceptions;

public class Mainclass 
{
	public static void test(int num) 
	{
		System.out.println("test() starts");

		int res = 50 / num;
		System.out.println("res = " + res);

		System.out.println("test() ends");
	}

	public static void main(String[] args) {
		System.out.println("main() starts");
		try
		{
		  test(0);
		}
		catch (ArithmeticException ae) 
		{
           System.out.println("Handled ArithmeticException");
           ae.printStackTrace();
		}
		System.out.println("main() ends");
	}

}





