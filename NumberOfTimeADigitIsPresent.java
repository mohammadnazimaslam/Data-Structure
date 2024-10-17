
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class NumberOfTimeADigitIsPresent {
	
	public static void main(String[] args) {
		
		Integer number=1212121;
		
		char [] arr =number.toString().toCharArray();
		
		
		//System.out.println(arr);
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		//System.out.println(map);
		
		for(Map.Entry<Character,Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey() +":" + entry.getValue());
			
		}
	}
	
	


}
