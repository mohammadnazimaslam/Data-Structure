import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoFinally {
	
	public static void main(String[] args) {
		
		
		int num=0;
		BufferedReader br=null;
		try {
			System.out.println("Enter a number");
			InputStreamReader in = new InputStreamReader(System.in);
			 br = new BufferedReader(in);
			num=Integer.parseInt(br.readLine());
			System.out.println("You enter "+ num);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
