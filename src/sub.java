
public class sub {

	public static void main(String[] args) {

		System.out.println(sub.subtract(42, 21));

	}

	public static int subtract(int a, int b) {

		while (b != 0) {
			return subtract(a ^ b, (~a & b) << 1);
		}
		return a;
	}

}
