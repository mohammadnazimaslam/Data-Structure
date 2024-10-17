import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BuyandSellStocks {
	
	public static void main(String[] args) {
		
		int stocks[]= {7,1,5,3,6,4};
		 List<Integer> numbers = new ArrayList<>();
		 
		 
	        // 1.2 add integer numbers to AL
	        numbers.add(86);
	        numbers.add(19);
	        numbers.add(97);
	        numbers.add(63);
	        numbers.add(23);
	        numbers.add(92);
	        numbers.add(94);
	        
	        numbers.forEach(System.out::println);
	        
		       List<Integer> sortedList = numbers
		    		   .stream()
		    		   .sorted()
		    		  .collect(Collectors.toList());
	       
	     
		
		
	}

}
