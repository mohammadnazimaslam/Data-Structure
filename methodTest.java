
class Calculator{
	
	int num1, num2, res;
	
	int add(int n1, int n2) {
		
		
		res=n1+n2;
		return res;
				
	}
	
	int subtract(int n1, int n2) {
		res=n1-n2;
		return res;
		
	}
}

public class methodTest {
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		int res=calc.add(5, 4);
		int ressubtract=calc.subtract(10,5);
		
		System.out.println(res);
		System.out.println(ressubtract);
		
	}

}
