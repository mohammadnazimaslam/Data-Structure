//A functional Interface has only one method

@FunctionalInterface
interface MyA{
	
	void show();
}

/*class B implements A{
	
	public void show() {
		System.out.println("in show");
	}
}*/


public class DemoFunctionalInterfac {

	public static void main(String[] args) {
		//A obj = new B();
		/*A obj =new A() {
			public void show() {
				System.out.println("inside show");
			}
		};*/
		
		MyA obj1=() ->{
			System.out.println("hi");
		};
		System.out.println("Hi");
		MyA obj= () ->{System.out.println("inside lambda show");};
		
		obj.show();
	
	
	}
}
