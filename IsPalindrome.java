
public class IsPalindrome {
	
	public static void main(String[] args) {
		
		String s="abccba";
		
		int start =0;
		int end =s.length()-1;
		boolean result = true;
		while(start<end) {
			char leftChar=s.charAt(start);
			char rightChar=s.charAt(end);
			
			if(!Character.isLetterOrDigit(leftChar)) {
				start++;
			}else if(!Character.isLetterOrDigit(rightChar)) {
				end--;
			}else {
				if(Character.toLowerCase(leftChar)!=Character.toLowerCase(rightChar)) {
					result = false;
				}
				start++;
				end--;
			}
		}
		
		if(result!=false) {
			result=true;
		}
	}

}
