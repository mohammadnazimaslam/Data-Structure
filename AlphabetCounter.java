
public class AlphabetCounter {
	
public static void main(String[] args) {
	boolean result=canConstruct("bb","aabb");
	System.out.println(result);
}
	    public static boolean canConstruct(String ransomNote, String magazine) {
			if (ransomNote.length() > magazine.length()) return false;
	        int[] alphabets_counter = new int[26];
	        
	        for (char c : magazine.toCharArray()) {
	        	System.out.println(c + " " + (c-'a') + " " +alphabets_counter[c-'a']);
	            alphabets_counter[c-'a']++;
	        }

	        for (char c : ransomNote.toCharArray()){
	            if (alphabets_counter[c-'a'] == 0) return false;
	            alphabets_counter[c-'a']--;
	        }
	        return true;
	    }
	}


