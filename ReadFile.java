import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	
	public static void main(String[] args) {
		try {
		FileReader fileReader = new FileReader ("src//text.sql");
		
		BufferedReader bf = new BufferedReader(fileReader);
		
		
			while(bf.ready()) {
				System.out.println(bf.readLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
