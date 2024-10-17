
public class ReverseAString {
	
	public static void main(String[] args) {
		String s= " the sky  is blue ";
		String [] sa =s.trim().replaceAll(" +", " ").split(" ");
	
		
		for (int i=0;i<sa.length;i++) {
		System.out.println(sa[i]);
		}
		StringBuffer ans=new StringBuffer();
		//System.out.println(sa.length-1);
		for (int i=sa.length-1; i>=0; i--) {
			//System.out.println(i );
			if(i>0) {
				if(!sa[i].equals(" ")) {
					System.out.println("I am inside "+ sa[i] );
				ans=ans.append(sa[i]).append(" ");
				}
				
			}
			else {
				ans=ans.append(sa[i]);
			}
			System.out.println(ans);
		}
	
	}

}
