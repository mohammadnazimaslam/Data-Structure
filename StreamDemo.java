import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
	
	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(2,3,7,6);
		/*data.stream().forEach(n->System.out.println(n));
		Stream<Integer> num = data.stream();
		Stream<Integer> mapdata = num.map(n->n*2);
		mapdata.forEach(n-> System.out.println(n));*/
		
		Integer reduce = data.stream()
				.filter(n->n%2==1)
				.sorted()
				.map(n->n*2)
				.reduce(0, (c,e) ->c+e);
				//.forEach(n->System.out.println(n));
		
		String [] language= {"Java" , "C++","Python"};
		Stream numbers =Stream.of(language);
		numbers.forEach(n->System.out.println(n));
		
		
		
		Integer red = data.stream().reduce(0, (c,e) -> c+e);
		System.out.println(red);
		
		System.out.println(reduce);
	}
	

}
