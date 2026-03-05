package advance_java.DAY3.thread;

 class Multithreading extends Thread {
	
	 
	 int threadNumber;
	 
	 public Multithreading(int threadNumber) {
		 this.threadNumber = threadNumber;
	 }
	 @Override
	public void run() {
		for(int i = 1 ; i <= 5; i++) {
			
			if( threadNumber == 3) {
				throw new RuntimeException();
			}
			System.out.println(i + " : Thread Number :" + threadNumber);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
		
	}

}

public class Main {
	public static void main(String[] args) {
		
		
		for(int i = 0 ; i <5 ; i++) {
			Multithreading th1 = new Multithreading(i);
			th1.start();
		}
		
//		
//		th1.start();
//		th2.start();
		
		
//		th1.run();
//		th2.run();
	}
}
