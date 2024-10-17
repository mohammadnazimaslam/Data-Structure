
interface A
{
	void show();
}
class Xyz implements A{

	@Override
	public void show() {
		System.out.println("Hello");
		
	}
	
	
}

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj;
		
		//obj  = new Xyz();
		/*obj = new A() //anonymous inner class
			{
				public void show()
				{
					System.out.println("Hello");
			
				}
		
			};*/
			
		obj = ()->
					{
						System.out.println("Hello");
				
					}
					;
			
			
			
		obj.show();

}
}
