package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mainclass4 
{
	public static void main(String[] args) 
	{
       Runnable r1 = ()->
       {
    	 System.out.println("scan for files");  
       };
       
        int n = Runtime.getRuntime().availableProcessors();
        System.out.println(n);
        ExecutorService ftp = Executors.newFixedThreadPool(n);
        
       for (int i = 1; i <= 5; i++) 
       {
		 ftp.submit(r1);
	   }
       
       ftp.shutdown();
        
       
	}
}
