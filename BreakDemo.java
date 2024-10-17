
public class BreakDemo {
	
	public static void main(String[] args) {
		
		String day="Sat";
		String time="";
		
		switch(day) {
		case "Sat":
			time="6:00 AM";
			break;
		case "Sun":
			time="6:00 AM";
		case "Mon":
			time="08:00 AM";
		default :
			time="09:00 AM";
		}
		System.out.println(time);
		
		
	}

}
