
public class Testing {
	
	public static void main(String args[]) {
		int n = Integer.parseInt("FF", 16);
		 System.out.println(n);
		 n &= 0xFF;
		 System.out.println("next n"+ n);
		 char ch = (char)n;
		 System.out.println(ch);
		    String s = "" + ch;
		   System.out.println(s);
		   
		 int highValue = 0x7F;
			//sb.append(".");  
			Integer.toHexString(highValue);
			 System.out.println(Integer.toHexString(highValue));
	}

}
