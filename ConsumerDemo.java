import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsImpl implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
		
	}
	
}


public class ConsumerDemo {
	
	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(4,5,6,7);
		
		//Consumer<Integer> c = new ConsImpl();
		
		Consumer<Integer> c = (Integer t) ->{System.out.println(t);};
		
		myList.forEach(c);
		
	}

}
