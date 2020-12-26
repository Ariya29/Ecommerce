package examples.threads;

import java.util.Date;
import java.util.Scanner;

public class StopWatch {

	public void tick(String endTime) {
	
		String[] hms = endTime.split(":");
		Date d = new Date();
		int totalHours = Integer.parseInt(hms[0]) - d.getHours();
		int totalMins = (totalHours * 60 + Integer.parseInt(hms[1])) - d.getMinutes();
		int totalSecs = (totalMins*60 + Integer.parseInt(hms[2])) - d.getSeconds();
		int totalMillis = totalSecs * 1000;
		
		long startingMillis = System.currentTimeMillis();

		if (System.currentTimeMillis() - startingMillis >= totalMillis) {
			System.err.println("That's an old time!");
			return;
		}
		
		
		Thread t1 = new Thread( new Runnable() {
			
			@Override
			public void run() {

				
				System.out.println("Start");
				
				while (System.currentTimeMillis() - startingMillis < totalMillis) {

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
					
					System.out.println(new Date().getHours() + ":" + new Date().getMinutes() + ":" + new Date().getSeconds());
				}

				System.out.println("---TIME---");
			}
		});
		t1.start();
		
	}
	
	
	public void tick(int seconds) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Start");
				
				for (int i = 0; i < seconds; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
					
					System.out.println(i+1);
				}
				
				System.out.println("---TIME---");
			}
		});
		
		t1.start();
	}
	
	
	public void tick(char[] stopKey, String[] name) {

		ParallelInput pi = new ParallelInput(stopKey, name);
		pi.start();
	}
	
	
	private class ParallelTicking extends Thread {
		
		private boolean running;
		private String name;
		
		public ParallelTicking(String name) {
			this.name = name;
			running = true;
		}
		
		public void setRunning(boolean toRun) {
			this.running = toRun;
		}
		
		public boolean getRunning() {
			return running;
		}
		
		@Override
		public void run() {
			System.out.println("Start");
			
			for (int i = 0; running == true; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
				
				System.out.println(name + " : " + (i+1));
			}
			System.out.println("---TIME of " + name + "---");
		}
	}
	
	private class ParallelInput extends Thread {

		private Scanner scanner;
		private char[] stopKey;
		
		private ParallelTicking[] pt;
		
		
		public ParallelInput(char[] stopKey, String[] name) {
			this.scanner = new Scanner(System.in);
			this.stopKey = stopKey;
			this.pt = new ParallelTicking[name.length];
			
			for (int i = 0; i < name.length; i++) {
				pt[i] = new ParallelTicking(name[i]);
				pt[i].start();
			}
			
		}
		
		@Override
		public void run() {
			boolean keepOnTakingInput = true;
			int stoppedThreads = 0;
			
			while (keepOnTakingInput) {
				
				try {
					
					String input = scanner.nextLine();
					for (int i = 0; i < pt.length; i++)	{		
						if (input.charAt(0) == stopKey[i]) {
							pt[i].setRunning(false); break;
						}
					}

					stoppedThreads = 0;
					for (int i = 0; i < pt.length; i++) {
						if (pt[i].getRunning() == false) {
							stoppedThreads ++;
						}
					}

					if (stoppedThreads == pt.length)
						keepOnTakingInput = false;
				
				} catch(Exception e) {
					System.err.println("Enter some valid data");
				}
				
			}
		}
	}
	
	
}
