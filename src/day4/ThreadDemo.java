package day4;

public class ThreadDemo extends Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadDemo thread1 = new ThreadDemo();
		ThreadDemo thread2 = new ThreadDemo();
		ThreadDemo thread3 = new ThreadDemo();
		
		thread1.setPriority(MAX_PRIORITY);
		thread1.start();
		thread1.join(3000);
		thread2.setPriority(MIN_PRIORITY);
		thread2.start();
		thread3.start();
		
		
	}
	
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		for(int i=0; i<3; i++) {
			
			System.out.println("Thread "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				System.out.println(e);
			}
			if(i==1) { Thread.currentThread().yield(); }
		}
		
	}

}
