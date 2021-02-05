package threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Mainclass6 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts...");
		Runnable r1 = () -> 
		{
			System.out.println("task1");
		};
		
		Runnable r2 = () -> 
		{
			System.out.println("task2");
		};
		
		Runnable r3 = () -> 
		{
			System.out.println("task3");
		};

	   ScheduledExecutorService stp = 
			                   Executors.newScheduledThreadPool(4);
	   
	    stp.schedule(r1,2,TimeUnit.SECONDS);
	    stp.scheduleAtFixedRate(r2,0,3,TimeUnit.SECONDS);
	   
		System.out.println("Main ends...");
	
	}

}


