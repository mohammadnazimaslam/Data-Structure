

 class MultiThreadingRun implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread" + Thread.currentThread().getId());
	}
	
}
public class MultiThreadDem {
	
public static void main(String[] args) {
	
	for (int i = 0; i < 10; i++) {
		Thread t = new Thread(new MultiThreadingRun());
		
		t.start();
	}
}
}
