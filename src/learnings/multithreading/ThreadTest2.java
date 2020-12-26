package learnings.multithreading;

public class ThreadTest2 {

	public static void main(String[] args) {


		System.out.println("test main 1");

		new Thread(new Runnable() {
			
			public void run() {
				
				for (int i = 1; i <= 20; i++) {
					System.out.println("CUSTOM " + i + " : " + System.currentTimeMillis());
					try {
						Thread.sleep(250);
					} catch (InterruptedException e) {}
				}
			}
		}).start();
		
		
		new Thread(new Runnable() {
			
			public void run() {
				
				for (int i = 1; i <= 20; i++) {
					if (i % 2 == 0)
						System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {}
				}
			}
		}).start();
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("MAIN " + i + " : " + System.currentTimeMillis());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		
	}
	
	
}
