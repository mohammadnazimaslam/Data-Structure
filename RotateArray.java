import java.util.Arrays;

public class RotateArray {
	
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6,7};
		int k=3;
		/*int temp=0;
		for (int i=0;i<k;i++) {
			temp=nums[nums.length-1];
			for (int j=nums.length-2;j>=0;j--) {
				nums[j+1]=nums[j];
			}
			nums[0]=temp;
			System.out.println(Arrays.toString(nums));
		}*/
		
		if (k>nums.length) {
			k=k%nums.length;
		}
		
		int [] result = new int [nums.length];
		for (int i=0;i<k;i++) {
			System.out.println(nums.length-k+i);
			result[i]=nums[nums.length-k+i];
		}
		
		System.out.println(Arrays.toString(result));
		int j=0;
		
		for(int i=k;i<nums.length; i++) {
			result[i]=nums[j];
			j++;
		}
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(nums));
		System.arraycopy(result, 0, nums, 0, nums.length);
		System.out.println(Arrays.toString(nums));
		
		
	}

}
