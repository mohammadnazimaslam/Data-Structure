

interface A1 {
	
	void show();
}

/*class Xyz1 implements A1{

	@Override
	public void show() {
		System.out.println("I am show");
		
	}
	
}*/
public class Lambda1  {
	
	public static void main(String[] args) {
		
	A1 a= () ->{System.out.println("I am show");};

	a.show();
	}

}
