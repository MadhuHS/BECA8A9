package threads;

class Superclass {

}

class Task1 extends Superclass implements Runnable 
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

class Task2 extends Thread {
	@Override
	public void run() {
		for (int j = 1; j <= 3; j++) {
			System.out.println("task2");
		}
	}
}

public class Mainclass2 {
	public static void main(String[] args) {
		System.out.println("Main starts...");

		Task1 t1 = new Task1();
		
		Thread th1 = new Thread(t1);
		th1.start();
		
		System.out.println("Main ends...");
	}
}





