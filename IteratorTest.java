import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
	
	public static void main(String[] args) {
		
		
		List<String> s = new ArrayList<String>();
		s.add("My");
		s.add("name");
		s.add("is");
		s.add("Shazia");
		for (String str : s) {
			System.out.println(str);
			
		}
		
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
