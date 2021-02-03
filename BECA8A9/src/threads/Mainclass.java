package threads;

class TaskOne extends Thread 
{
	@Override
	public void run() 
	{
		for (int i = 1; i <= 3; i++) 
		{
			System.out.println("task1");
		}
	}
}

class TaskTwo extends Thread 
{
	@Override
	public void run() 
	{
		for (int j = 1; j <= 3; j++) 
		{
			System.out.println("task2");
		}
	}
}

public class Mainclass
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts...");
        
		TaskOne t1 = new TaskOne();
		t1.start();
		
		TaskTwo t2 = new TaskTwo();
		t2.start();
		
		System.out.println("Main ends...");
	}
}






