
public class RemoveElement {
	
	public static void main(String[] args) {
		
		int[] num= {5,7,8,7,6,5};
		
		int val =7;
		
		int i= removeElm(num,val);
		
	}

	private static int removeElm(int[] num, int val) {
		
		int i=0;
		
		for (int a=0; a<num.length; a++) {
			
			if(num[a]!=val) {
				num[i]=num[a];
				i++;
			}
		}
		
		System.out.println(num);
		System.out.println(i);
		return i;
		// TODO Auto-generated method stub
		
	}

}
