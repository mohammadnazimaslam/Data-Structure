

class Parent{
	String s="Parent";
	void member() {
		System.out.println("I am inside Parent");
	}
	
}

class Child extends Parent{
	
	String s="Child";
	void member() {
		System.out.println("I am inside Child");
	}
}

public class Test3 {
	public static void main(String[] args) {
		
		Parent p= new Child();
		System.out.println(p.s);
		p.member();
		
		Child c =  new Child();
		Parent Par = c;
		Parent Par1 = (Parent)c;
		System.out.println(Par.s);
		Par.member();
		
		System.out.println(Par1.s);
		Par1.member();
	}

}
