import java.util.ArrayList;
import java.util.List;

public class FirstnonRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="greeksforgreek";
		
		int index=-1;
		char fnc;
		List a = new ArrayList();
		for (char i: s.toCharArray()) {
			if(s.indexOf(i)==s.lastIndexOf(i)) {
				System.out.println(s.lastIndexOf(i));
				a.add(i);
				//break;
			}else {
				index +=1;
			}
		}
		if(index==s.length()-1) {
			System.out.println("All repeating");
		}else {
			System.out.println(a);
		}

	}

}
