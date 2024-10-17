
public class SearchInsertOption {
	
	public static void main(String[] args) {
		int [] nums = {1,3,5,6};
		
		int target =2;
	
		int position=0;
		for(int i=0;i<nums.length; i++) {
		
			if (nums[i] == target) {
				position=i;
				break;
			}else if(nums[i]<target){
				position =i+1;
			}else {
				break;
			}
			
		}
		System.out.println(position);
		
	}

}
