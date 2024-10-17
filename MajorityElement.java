import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {

	
	public static void main(String[] args) {
		
		int[] nums= {2,1,1,2,1,2,2};
		
		int n=nums.length;
		Map <Integer,Integer> m = new HashMap<Integer,Integer>();
		for (int i=0; i<nums.length; i++){
			if(m.containsKey(nums[i])) {
				m.put(nums[i],m.get(nums[i])+1) ;
			}else {
				m.put(nums[i], 1);
			}
			
			
		}
		
		System.out.println(m);
		 int maxValueInMap = (Collections.max(m.values()));
		 System.out.println(maxValueInMap);
		 
		 int majorityElement;
		 for(Map.Entry<Integer,Integer> entry: m.entrySet()) {
			 if(entry.getValue()==maxValueInMap) {
				 majorityElement=entry.getKey();
				 System.out.println(entry.getKey());
			 }
		 }
		 
		
	}
	
	
}
