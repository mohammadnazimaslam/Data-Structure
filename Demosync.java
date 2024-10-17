class Counter{
	
	int count=0;
	public synchronized void increment() {
		count++;
	}
}

public class Demosync {
	
	
	public static void main(String[] args) {
		
		Counter c= new Counter();
		Runnable obj1 = ()->
				{
					for(int i=0;i<10000;i++) {
						c.increment();
						//System.out.println("hi");
					}
				};
				
				Runnable obj2 = () ->
				{
					for(int i=0; i<10000;i++) {
						c.increment();
						//System.out.println("hello");
					}
				};
				
				Thread t1= new Thread(obj1);
				Thread t2= new Thread(obj2);
			t1.start();
			t2.start();
			
			try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(c.count);
		}
	

}
