

class Multithreading extends Thread{
	public void run() {
		
		System.out.println("Thread" + Thread.currentThread().getId());
	}
	
	
}
public class MultithreadD {
	public static void main(String[] args) {
		
		
		for (int i = 0; i <10; i++) {
			Multithreading m =new Multithreading();
			m.start();
			
		}
			
	}

}
