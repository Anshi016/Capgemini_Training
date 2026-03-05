package advance_java.DAY3.fileHandling;

import java.util.*;

class Task1 {
	public void countDown() throws InterruptedException {
		
		for(int i = 0 ; i <= 5 ; i++) {
			System.out.println("Count : " + i + " || Thread Name : " + Thread.currentThread().getName()) ;
			
			Thread.sleep(1000); // timed waiting
		}
	}
	
	
}


public class Join {
	public static void main(String[] args) {
		
		Task1 t1 = new Task1();
		Task1 t2 = new Task1();
		
		Thread th1 = new Thread(
				() -> {
					try {
						
						t1.countDown();						
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
 				} , "TH1"
		);
		
		Thread th2 = new Thread (
				() -> {
					try {
						th1.join();
						t2.countDown();
						
					} catch ( InterruptedException e) {
						throw new RuntimeException(e);
					}
				} , "TH2"
		);
		
		th1.start();
		th2.start();
		
		
	}
	
}

