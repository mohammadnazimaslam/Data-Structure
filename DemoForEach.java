
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*class consImpl implements Consumer<Integer>{

	@Override
	public void accept(Integer i) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}
	
}*/

public class DemoForEach {
	//ForEach Demo
	//External Loops
	//Internal Loops
	
	public static void main(String[] args) {
		
		List<Integer> values= Arrays.asList(4,5,6,7,8);
		
		/*for(int i=0;i<values.size();i++) {
			System.out.println(values.get(i));
		}*/
		
		/*for(int i : values) {
			System.out.println(i);
		}
		*/
		
		values.forEach(i-> System.out.println(i));
		//Consumer<Integer> c = new consImpl();
		Consumer<Integer> c =(Integer i) ->
						{
						
						System.out.println(i);
					}
			
				;
		
		values.forEach(c);
	}

}
