
public class PlusOne {

	public static void main(String[] args) {
		int[] digits = {1,2,3};
		
		System.out.println(digits.length-1);
		
		for(int i=digits.length-1;i>=0;i--) {
			System.out.println(i);
			if(digits[i]<9) {
				digits[i]++;
				//return   digits;
				System.out.println("I am in ");
				break;
			}else {
				digits[i]=0;
			}
		}
		 digits= new int[digits.length+1];
		 digits[0]=1;
		
		/*int sum=0;
		for(int i=0;i<digits.length;i++) {
			sum=sum*10+ digits[i];
		}
		sum+=1;
		
		int[] newdigits 
		
		while (n != 0)
		    arr[i] = n % 10 
		    n /= 10 
		    i++ 
		System.out.println(sum);*/
	}
}
