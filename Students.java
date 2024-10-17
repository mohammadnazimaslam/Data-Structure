
public class Students  implements Comparable<Students>{
	
int id;
String name;


public Students(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public int getId() {
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

@Override
public int compareTo(Students s) {
	
	return this.id - s.id;
}

}
