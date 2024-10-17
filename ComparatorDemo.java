import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Studs{
	Integer id;
	String name;
	
	public Studs(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

class ComparatorImpl implements Comparator<Studs>{

	@Override
	public int compare(Studs o1, Studs o2) {
		int nameCompare=o1.getName().compareTo(o2.getName());
		int idcompare = o1.getId().compareTo(o2.getId());
		return (nameCompare == 0)? idcompare : nameCompare;
	}
	
}


public class ComparatorDemo  {
	public static void main(String[] args) {
		List<Studs> studentList = new ArrayList<Studs>();
		Studs s1 = new Studs(102, "Shazia");
		Studs s2 = new Studs(101, "Nazim");
		Studs s3 = new Studs(100, "Aunny");
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		Collections.sort(studentList, new ComparatorImpl());
		
		for(Studs std : studentList) {
			System.out.println(std.getId() + " " + std.getName());
		}
		
	}
	

}
