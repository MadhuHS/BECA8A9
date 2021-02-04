package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mainclass5 
{
	public static void main(String[] args) 
	{
		Runnable r1 = () -> {
			System.out.println("login()");
		};

		ExecutorService ctp = Executors.newCachedThreadPool();

		for (int i = 1; i <= 2; i++) 
		{
			ctp.submit(r1);
		}
	}

}
