

class Employee{
	
	int id;
	String name;
	Employee(){
		
	}
	Employee(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	void learn() {
		
		System.out.println("I am inside learn method");
	}
	
	void takeABreak() {
		System.out.println("I am inside break method");
	}
}
public class LaunchLearning {
	
	public static void main(String[] args) {
		System.out.println("Hello");
		
		Employee emp = new Employee();
		
		emp.learn();
		emp.takeABreak();
	}

}
