import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Isomorphic {
	
	public static void main(String[] args) {
		
		String s="bbbaaaba";
		String t="aaabbbba";
		boolean result;
		char[] chars=s.toCharArray();
		char[] chart=t.toCharArray();
		
		Map <Character,Integer> scount= new HashMap<Character,Integer>();
		Map <Character,Integer> tcount= new HashMap<Character,Integer>();
		
		for(Integer i = 0; i <s.length(); i ++) {
			  System.out.println("tcount" +tcount.put(s.charAt(i), i));
			  System.out.println("scount" +scount.put(t.charAt(i), i));
	         if(tcount.put(s.charAt(i), i) != scount.put(t.charAt(i), i))
	           System.out.println(false); 
	         }
		
		if(chars.length !=chart.length)
			result= false;
		
		for(int i=0; i<chars.length; i++) {
			if(scount.containsKey(chars[i])) {
				scount.put(chars[i],scount.get(chars[i]) + 1);
			}else {
				scount.put(chars[i], 1);
			}
		}
		
		for(int i=0; i<chart.length; i++) {
			if(tcount.containsKey(chart[i])) {
				tcount.put(chart[i],tcount.get(chart[i]) + 1);
			}else {
				tcount.put(chart[i],1);
			}
		}
		
	
		
		 HashSet<Integer> set1 = new HashSet<>(tcount.values()); 
		 HashSet<Integer> set2 = new HashSet<>(scount.values()); 
		System.out.println(set1.equals(set2));
		
		
		
	
		
		
	}

}
