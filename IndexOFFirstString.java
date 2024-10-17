
public class IndexOFFirstString {
	
	public static void main(String[] args) {
		String firstString = "sadbutsad";
		String secondString = "pink";
		int output=-1;
		if(firstString.contains(secondString)) {
			output= firstString.indexOf(secondString);
		}
		System.out.println(output);
	}

}
