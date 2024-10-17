
public class FrequencyOfChar {
	
	
	public static void main(String[] args) {
		
		String s= "bookkeeper";
		char x='e';
		int count=0;
		char [] a = s.toCharArray();
		for(int i=0;i<a.length;i++) {
			if (a[i]==x) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
		
	}
	
	

}
