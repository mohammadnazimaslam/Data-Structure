import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
	
	public static void main(String[] args) {
		
	List<Students> studentList = new ArrayList<Students>();
		Students s3 = new Students(105, "Ram");
		Students s1 = new Students(100, "Shazia");
		Students s2 = new Students(101, "Nazim");
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		Collections.sort(studentList);
		
		for(Students stud:studentList) {
			System.out.println(stud.getId() + " " + stud.getName());
		}
		
		
	}

	
	
	

}
