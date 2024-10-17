import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Test4 {
	
	public static void main(String[] args) {
		
		/*BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		try {
			String name=read.readLine();
			System.out.println("My name is" +name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*Scanner scan = new Scanner (System.in);
		String name=scan.nextLine();
		System.out.println("Me name is" + name);*/
		
		
	 int[] arr= new int[] {5,6,7,8,9};
	 
	 int max=0;
	 for (int i: arr) {
		 if (i>max) {
			 max=i;
		 }
	 }
	 
	 System.out.println(max);
		
	}

}
