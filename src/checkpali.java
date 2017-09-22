
public class checkpali {

	public static void main(String[] args) {

		int input = 212;
		int temp;
		int sum = 0;
		
		temp = input;
		
		while (input > 0) {
			int r = input % 10;
			input = input / 10;
			sum = (sum * 10) + r;
		}

		if (temp == sum) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a pali");
		}

	}

}
