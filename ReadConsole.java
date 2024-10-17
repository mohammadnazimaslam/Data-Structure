import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadConsole {
	
	public static void main(String[] args) {
		
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		ArrayList <String> names = new ArrayList<String>();
		try {
			names.add(br.readLine());
			names.add(br.readLine());
			names.add(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(names);
		
		
	}

}
