
@FunctionalInterface
interface xyzDemo {
	
	public void show();
}

class Detailxyz implements xyzDemo{
	
	public void show() {
		System.out.println("I am xyz interface method");
	}
}

public class LambdaEx {
	
	public static void main(String[] args) {
		xyzDemo obj;
		
		//obj = new Detailxyz();
		/*obj = new xyzDemo() {

			@Override
			public void show() {
				System.out.println("I am xyz interface method from anonymous class");
				
			}
			
		};*/
		
		obj = () ->{
				System.out.println("I am xyz interface method from Lambda expression");
				
			};
			
		
		
		obj.show();
	}
}
		
		
		
		
		
		
		
		
		
/*		List<Integer> numbers =Arrays.asList(1,2,3,4,5);
numbers.forEach(n -> System.out.println(n));
List<String> words = Arrays.asList("apple","banana", "orange");
Collections.sort(words);*/
	
	
	


