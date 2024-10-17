
public class Sum {

	public static void main(String[] args) {
		
		int []nums = {3,2,4};
		int target = 6;
		int [] result = new int [2];
		for (int i=0;i<nums.length;i++) {
			
			int firstnum=nums[i];
			System.out.println(firstnum);
			for (int j=i+1;j<nums.length; j++) {
				if (firstnum + nums[j]==target) {
					result[0] =i;
					result[1] =j;
					System.out.println("result"+result[0] + result[1]);
					break;
				}
			}
			
		}

	}

}
