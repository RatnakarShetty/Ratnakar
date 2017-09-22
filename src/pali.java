import java.util.Scanner;

public class pali {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println( "Enter number ");
		int input = sc.nextInt();

		Integer[] num = new Integer[input];

		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
			pali.printpali(num[i]);
		}

	}

	public static void printpali(Integer num) {

		String numString = Integer.toString(num);

		if (numString.length() <= 1) {
			System.out.println(" " + numString);
		} else if (numString.length() == 2) {

			if (numString.charAt(0) == numString.charAt(1)) {
				System.out.println(numString);
			}
		}else if(numString.length()>2) {
			
			for (int i = 0; i <= numString.length()-1; i++) {
				
				if(numString.charAt(i) == numString.charAt((numString.length()-1)-i)) {
					System.out.println(numString);
				}
				
			}
		}

	}

}
