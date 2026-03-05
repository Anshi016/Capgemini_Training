package advance_java.DAY3.fileHandling;

import java.util.*;

class Task {
	public synchronized void countDown() throws InterruptedException {
		
		for(int i = 0 ; i <= 5 ; i++) {
			System.out.println("Count : " + i);
			
			Thread.sleep(1000); // timed waiting
		}
	}
	
	
}


public class Synchronization {
	public static void main(String[] args) {
		
		Task t1 = new Task();
		Task t2 = new Task();
		
		Thread th1 = new Thread(
				() -> {
					try {
						t1.countDown();						
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
 				}
		);
		
		Thread th2 = new Thread (
				() -> {
					try {
						
						t1.countDown();
						
					} catch ( InterruptedException e) {
						throw new RuntimeException(e);
					}
				}
		);
		
		th1.start();
		th2.start();
		
	}
	
}

