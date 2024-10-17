
public class RemoveDuplicates2 {
	
	public static void main(String[] args) {
		int[] num= {1,2,2,2,3,3};
		
		int i=2;
		
		for(int a=2;a<num.length;a++) {
			
			if(num[a]!=num[a-2]) {
				System.out.println("indide if" + num[a] + num[a-2] + num[i-2]);
				num[i]=num[a];
				i++;
			}
			
		}
		
		System.out.println(i);
	}

}
