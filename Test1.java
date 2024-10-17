import java.util.HashMap;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
		
//missing number from an array of sequence of number
		// TODO Auto-generated method stub
		
		//Array 2,3,7,6,4,1  5 is missing 
		//Range 1 to 7
		
		int[] a= {2,3,7,6,4,1};
		
		int n =a.length +1;
		System.out.println(n);
		int sum=n*(n+1)/2;
		//int i;
		for(int num:a) {
			
			sum=sum-num;
		}
 System.out.println("Missing number from array" +sum);
 
 
 Map<String, Object> map = new HashMap<String, Object> ();	
 
 map.put("p", 1);
 map.put("q", 0);
 Integer s = 1;
	Integer t = 0;
	Object yes=(Integer) s;
	Object No=(Integer) t;
	
	for(Map.Entry<String, Object> entry : map.entrySet()) {
		if(entry.getValue().equals(yes)) {
			entry.setValue("Y");
			System.out.println(entry.getValue());
		}else if(entry.getValue()==No) {
			entry.setValue("N");
			System.out.println(entry.getValue());
		}
	}
	}

}
