
public class revstring {
	
	public static void main(String[] args) {
		
		String g1= "ganesh";
		
		String g2= "";
		
		for(int i=g1.length()-1;i>=0;i--) {
			g2 = g2+g1.charAt(i);
		}

		System.out.print(g2);
		
		
	}

}
