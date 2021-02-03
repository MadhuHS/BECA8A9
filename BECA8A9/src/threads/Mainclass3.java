package threads;

public class Mainclass3
{
	public static void main(String[] args) 
	{
		Runnable r1 = () -> 
		{
			for (int i = 1; i <= 3; i++) {
				System.out.println("task1");
			}
		};

		Runnable r2 = () -> 
		{
			for (int j = 1; j <= 3; j++) {
				System.out.println("task2");
			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
	}
}
