

class HiA extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
		System.out.println("hi");
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
class HiB extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
		System.out.println("hello");
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
public class DemoThread {
	
	public static void main(String[] args) {
		HiA obj1=new HiA();
		HiB obj2=new HiB();
		
		//obj1.show();
		//obj2.show();
		System.out.println(obj1.getPriority());
		
		//obj2.setPriority(Thread.MAX_PRIORITY);
		obj1.start();
		obj2.start();
		
		
	}
	
	

}
