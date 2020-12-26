package examples.threads;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		
		StopWatch stopWatch = new StopWatch();
		
		
		// press a, when the first  sprinter finishes
		// press b, when the second sprinter finishes
		// press c, when the third  sprinter finishes

		
		stopWatch.tick(new char[] {'a', 'b', 'c'} , new String[] {"A", "B", "C"});
		
		
		Thread.sleep(2000);
		System.out.println("ACTIVE COUNT :::: " + Thread.activeCount());
		
		
	}
	
}
