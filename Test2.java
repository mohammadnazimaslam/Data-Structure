import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test2 {
	
	public static void main(String[] args) {
		
		String s="greeksforgreek";
		
		char[] arr = s.toCharArray();
		
		Map <Character,Integer> m = new HashMap();
		
		for (int i=0; i<arr.length; i++) {
			
			if(m.containsKey(arr[i])) {
				m.put(arr[i],m.get(arr[i]) +1);
			}else {
				m.put(arr[i], 1);
			}
			
		}
		
		System.out.println(m);
		
		 Set<Map.Entry<Character,Integer>> set= m.entrySet();
		 Iterator<Map.Entry<Character,Integer>> it= set.iterator();
		 
		 while(it.hasNext()) {
			 Map.Entry<Character,Integer> entry =it.next();
			 if(entry.getValue() >1)
			 System.out.println(entry.getKey() + " value--" + entry.getValue());
		 }
		
	}

}
