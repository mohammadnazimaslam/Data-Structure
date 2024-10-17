import java.util.ArrayList;


import java.util.List;
import java.util.stream.Collectors;


class Employe{
	
	private String name;

	public Employe(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class StreamProblems {
	
	public static void main(String[] args) {
		
		List<Employe> employeeList = new ArrayList<Employe>();
		
		Employe e1 = new Employe ("Alexa");
		Employe e2 = new Employe ("Adams");
		Employe e3 = new Employe ("John");
		Employe e4 = new Employe ("Mark");
		
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		
		
		List<Employe> collect = employeeList.stream()
						.filter(e->e.getName().startsWith("A"))
						.collect(Collectors.toList());
		
		collect.stream().forEach(e->System.out.println(e.getName()));
		
	}

}
