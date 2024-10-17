class HiR implements Runnable{
	
	public void run() {
		
		for(int i=0;i<10;i++) {
		System.out.println("hi");
		}
	}
}

class HiX implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
	System.out.println("hello");
		}
		
	}
	
}


public class DemoRunnable {
	
	public static void main(String[] args) {
		HiR obj1 = new HiR();
		HiX obj2 = new HiX();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
	}

}
