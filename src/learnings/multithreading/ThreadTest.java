package learnings.multithreading;

public class ThreadTest {

	public static void main(String[] args) {


		System.out.println("test main 1");

		Runnable r1 = new CustomThread("CUSTOM THREAD", 250);
		Thread t1 = new Thread(r1);
		t1.start();
		
		Runnable r2 = new CustomThread("DOMINOS THREAD", 500);
		Thread t2 = new Thread(r2);
		t2.start();
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("MAIN " + i + " : " + System.currentTimeMillis());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		
	}
	
	
	// inner class => inside another class
	
	private static class CustomThread implements Runnable {

		private long sleepTime;
		private String name;
		
		public CustomThread(String name, long sleepTime) {
			this.sleepTime = sleepTime;
			this.name = name;
		}
		
		public void run() {
			
			for (int i = 1; i <= 20; i++) {
				System.out.println(name + " " + i + " : " + System.currentTimeMillis());
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {}
			}
		}
	}
}
