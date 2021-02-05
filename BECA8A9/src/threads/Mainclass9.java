package threads;

public class Mainclass9 {
	static String str1 = new String("hello");
	static String str2 = new String("world");

	public static void main(String[] args) {

		Runnable r1 = () -> {
			System.out.println("t1 starts");

			System.out.println("t1 waiting to lock str1");
			synchronized (str1) {
				System.out.println("t1 locked str1");
				str1 = str1.concat("world");

				System.out.println("t1 waiting to lock str2");
				synchronized (str2) {
					System.out.println("t1 locked str2");
					str2 = str2.concat("hello");
				}
				System.out.println("t1 unlocked str2");

			}
			System.out.println("t1 unlocked str1");

			System.out.println("t1 ends");
		};

		Runnable r2 = () -> {
			System.out.println("t2 starts");

			System.out.println("t2 waiting to lock str2");
			synchronized (str2) {
				System.out.println("t2 locked str2");
				str2 = str2.concat("java");

				System.out.println("t2 waiting to lock str1");
				synchronized (str1) {
					System.out.println("t2 locked str1");
					str1 = str1.concat("java");
				}
				System.out.println("t2 unlocked str1");
			}
			System.out.println("t2 unlocked str2");

			System.out.println("t2 ends");
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
	}
}
