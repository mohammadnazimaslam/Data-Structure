import java.util.Arrays;


public class LongestCommonPrefix {
	
	public static void main(String[] args) {
	String [] strs=	{"flower","flow","flight"};
	
		Arrays.sort(strs);
		StringBuilder ans =new StringBuilder();
		 System.out.println("Modified arr[] : "
                 + Arrays.toString(strs));
		 
		 String firstString= strs[0];
		 String lastString = strs[strs.length-1];
		 
		 for (int i=0;i< Math.min(firstString.length(),lastString.length());i++) {
			 
			 if(firstString.charAt(i)!=lastString.charAt(i)) {
				 System.out.println(ans); 
				 break;
			 }
			 ans.append(firstString.charAt(i));
		 }
		
/*	Map <String, Integer> map = new HashMap<String, Integer>();
	
	for (int i=0;i<strs.length; i++) {
		
		map.put(strs[i], strs[i].length());
	}
	
	int minLength = Collections.min(map.values());
	System.out.println(minLength);
	
	StringBuffer prefix = new StringBuffer();
	Character CharatJ;
	for(int i=0;i<minLength;i++) {
		
		for(int j=0;j<strs.length-2;j++) {
			
			if(strs[j].charAt(j)==strs[j+1].charAt(j)) {
				
			}
			
		}
	}*/
	
	}

}
