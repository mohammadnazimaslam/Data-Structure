
public class isSubsequence {
	
	public static void main(String[] args) {
		
		
		String s="abc";
		String t="ahbgdc";
		StringBuffer temp=new StringBuffer();
		char c;
		int position=0;
		for(int i=0;i<s.length();i++) {
			c=s.charAt(i);
			for(int j=position; j<t.length();j++) {
				if(c==t.charAt(j)) {
					position=j+1;
					temp.append(c);
					break;
				}
			}
		}
		System.out.println(temp);
		
		if(temp.toString().equals(s)) {
			System.out.println(temp);
		}
	}

}
