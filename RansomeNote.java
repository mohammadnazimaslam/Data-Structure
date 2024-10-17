import java.util.HashMap;
import java.util.Map;

public class RansomeNote {

	
	public static void main(String[] args) {
		String ransomNote ="aa";
		String magazine = "aab";
		
		Map<Character, Integer> mag = new HashMap<Character, Integer> ();
		
		for(int i=0;i<magazine.length();i++) {
			char ch=magazine.charAt(i);
			if(mag.containsKey(ch)) {
				mag.put(ch, mag.get(ch) +1);
			}else {
				mag.put(ch,1);
			}
		}
		
		for(int i=0;i<ransomNote.length();i++) {
			char ch=ransomNote.charAt(i);
			if(mag.containsKey(ch)) {
				
				if(mag.get(ch)==1) {
					mag.remove(ch);
				}
				else {
				mag.put(ch, mag.get(ch) -1);
				}
			}else {
				System.out.println("False");
				break;
			}
			
		}
		
	}
}
