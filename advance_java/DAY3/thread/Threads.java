package advance_java.DAY3.thread;



public class Threads {
	static final Object lock = new Object();
	public static void main(String[] args) throws Exception {
		Thread worker = new Thread(
	
				() -> {
					try {
						System.out.println("Working");
						Thread.sleep(2000);
						synchronized (lock) {
							System.out.println("Worker: Going to waiting state");
							lock.wait();
						}
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
				}
				
		);
		System.out.println("State after creation: " + worker.getState());
		worker.start();
		Thread.sleep(100);
		System.out.println("State after starting : " + worker.getState());
		
		Thread.sleep(500);
		System.out.println("State during sleep :" + worker.getState());
		
		Thread.sleep(200);
		System.out.println("State during wait() :" + worker.getState());
		
 		synchronized (lock) {
			lock.notify();
		}
		
		worker.join();
		System.out.println("State after complete: " + worker.getState());
		
	}

}
