
public class Palindrome {
	
	public static void main(String[] args) {
		int x=121;
		int num=x;
		int newnum=0;
		while(num>0) {
			newnum =newnum*10 +num % 10;
			num=num/10;
			
		}
		System.out.println(newnum);
		if(newnum==x) {
			System.out.println(newnum);
		}
	}

}
