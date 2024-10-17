

class Student{
	
	private int id;
	private int age;
	private String name;
	
	
	
	void setId(int id){
		this.id=id;
	}
	
	void setAge(int age) {
		this.age=age;
	}
	
	void setName(String name) {
		this.name=name;
	}
	
	int getId() {
		return id;
	}
	
	int getAge() {
		return age;
	}
	String getName() {
		return name;
	}
	
}
public class LaunchEncap {
	
	public static void main(String[] args) {
		Student stud = new Student();
		
		stud.setId(1);
		stud.setAge(18);
		stud.setName("Shazia");
		
		stud.getId();
		stud.getAge();
		stud.getName();
		
		System.out.println("id" +stud.getId() + "age" +stud.getAge() + "name" + stud.getName() );
		
	}

}
