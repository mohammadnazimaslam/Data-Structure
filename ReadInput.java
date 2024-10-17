import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadInput {
	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		
		 
		 int elements = scan.nextInt();
		// scan.close();
		 Map<Integer,String> map = new HashMap<Integer,String>();
		 Scanner input  = new Scanner(System.in);
		for(int i=0;i<elements;i++) {
			 String s= input.nextLine();
			 s.substring(0, s.indexOf(' ')); 
			 s.substring(s.indexOf(' ') + 1); 
			 map.put(Integer.parseInt(s.substring(0, s.indexOf(' '))), s.substring(s.indexOf(' ') + 1));
		 }
		 Scanner find  = new Scanner(System.in);
		Integer key= find.nextInt();
		// input.close();
		 //System.out.println(map);
		 Integer result=0;
		 for(Map.Entry<Integer,String> entry: map.entrySet()) {
			 
			 if(entry.getKey().equals(key)) {
				 result=key;
			 }
			
		 }
		 
		 if(result==0) {
			 System.out.println("-1");
		 }else {
			 System.out.println(result);
		 }
		 
		 input.close();
		 scan.close();
		 find.close();
		
		 
		
		
		   /* List<String> a = new ArrayList<>();
		    while (reader.hasNextLine()) {
		        String s = reader.nextLine();
		        if (s.equals("!q")) {
		            break;
		        }
		        a.add(s);
		    }*/
	}

}
