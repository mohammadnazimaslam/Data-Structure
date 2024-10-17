import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	
	public static void main(String[] args) {
		
		String pattern = "abba";
		String s="cat dog cat dog";
		
		String [] words =s.split(" ");
		
		if(pattern.length()!=words.length) {
			System.out.println("No Match");
		}
		
		Map<Character, String> charToWord = new HashMap<Character,String>();
		Map<String, Character> wordToChar = new HashMap<String, Character>();
		
		for(int i=0;i<pattern.length();i++) {
			char c=pattern.charAt(i);
			String word=words[i];
			if(!charToWord.containsKey(c)) {
				charToWord.put(c, words[i]);
			}
			
			if(!wordToChar.containsKey(word)) {
				wordToChar.put(word, c);
			}
			
			if((!charToWord.get(c).equals(word) ) || !wordToChar.get(word).equals(c) ) {
		
				System.out.println("No Match");
				break;
			}
			
		}
		System.out.println(charToWord);
	}

}
