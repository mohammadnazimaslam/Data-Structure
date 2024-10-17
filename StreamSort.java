import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Emp{
	
	private String name;
	private int age;
	
	public Emp(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class StreamSort {

	public static void main(String[] args) {
		
		List<Emp> FirstEmpList = new ArrayList<Emp>();
		List<Emp> SecondEmpList = new ArrayList<Emp>();
		Emp e1 = new Emp("John",30);
		Emp e2 = new Emp("Mark",18);
		Emp e3 = new Emp("Alex",26);
		Emp e4 = new Emp("ana",23);
		Emp e5 = new Emp("Mic",29);
		Emp e6 = new Emp("Aleena",12);
		
		FirstEmpList.add(e1);
		FirstEmpList.add(e2);
		FirstEmpList.add(e3);
		SecondEmpList.add(e4);
		SecondEmpList.add(e5);
		SecondEmpList.add(e6);
		
		List<Emp> collect = Stream.concat(FirstEmpList.stream(), SecondEmpList.stream())
		.sorted(Comparator.comparing(e->e.getAge()))
		.collect(Collectors.toList());
		
		
		collect.stream().forEach(e->System.out.println(e.getName()));
		
	}
}
