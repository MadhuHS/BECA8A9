package threads;

public class Mainclass8 {

	static String str = new String("hello");

	public static void main(String[] args) {
		Runnable r1 = () -> 
		{
			synchronized (str) 
			{
				str = str.concat("world");
				System.out.println(str);
			}

		};
		Runnable r2 = () -> {
			synchronized (str) {
				str = str.concat("java");
				System.out.println(str);
			}

		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
	}

}
