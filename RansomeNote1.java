
public class RansomeNote1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="bbbaaaba";
		String t="aaabbbba";
		boolean result;
		char[] chars=s.toCharArray();
		char[] chart=t.toCharArray();
		
		int [] alphabet_counter = new int[26];
		
		
		for (char c: chars) {
			alphabet_counter[c-'a']++;
		}
		
		for(char c: chart) {
			if(alphabet_counter[c-'a']==0) {
				result=false;
			}
			alphabet_counter[c-'a']--;
		}
		
		result=true;
System.out.println(result);
	}

}
