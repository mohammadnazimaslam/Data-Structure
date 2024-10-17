
public class RemoveDuplicates {
	
public static void main(String[] args) {
	
	//int[] num= {2,3,3,4,4,5,6,6,7};
	
	int [] num= {1,1,2};
	int i=1;
	
	for (int a=1; a<num.length;a++) {
	
		if(num[a]!=num[a-1]) {
			 num[i] =num[a];
			
			i++;
			
		}
		
		
	}
	
System.out.println(i);
	
}
}
