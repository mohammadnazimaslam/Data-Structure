
public class LengthOfLastWord {

	public static void main(String[] args) {
		String s= "Hello World";
		
		String [] array = s.split(" ");
		System.out.println(array);
		
		int arraysize=array.length;
		String lastWord=array[arraysize-1];
		int length = lastWord.length();
		System.out.println(length);
	}
	

	
	
	
	
}
