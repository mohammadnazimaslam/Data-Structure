import java.util.HashMap;
import java.util.Map;

public class PatternMatch {
	
	public static void main(String[] args) {
		
		String s= "dog sun cat dog";
		String pattern="abba";
		
		String [] str = s.split(" ");
		
		if(str.length!=pattern.length()) {
			System.out.println("false");
		}
		
	Map<Character,String> map = new HashMap<Character,String>();
	for(int i=0;i<pattern.length(); i++) {
		char ch = pattern.charAt(i);
		if(map.containsKey(ch)) {
			if(!map.get(ch).equals(str[i])) {
				System.out.println("false1");
			}
		}else {
			if(map.containsValue(str[i])) {
				System.out.println("false");
			}
		}
		
	
		
		map.put(ch, str[i]);
		System.out.println("true");
		
	}
		
	}

}
