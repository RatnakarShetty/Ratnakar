
public class revnum {

	public static void main(String[] args) {
		
		int input = 1234;
		int sum = 0;
		
		while(input!=0) {
			
			int r = input%10;
			sum = sum*10+r;
			input = input/10;
		}
		System.out.println(sum);
		
	}
}
