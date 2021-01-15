package exceptions;

public class Mainclass2 
{
	public static void test(int num)throws InterruptedException
	{
		System.out.println("test() starts");
		Thread.sleep(num);
		System.out.println("test() ends");
	}
	public static void main(String[] args)
	{
		System.out.println("main() starts");
		try
		{
		 test(5);
		}
		catch (InterruptedException ie)
		{
          ie.printStackTrace();
		}
		System.out.println("main() ends");
	}
}
