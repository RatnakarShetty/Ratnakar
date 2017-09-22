
public class fib {

	public static void main(String[] args) {

		int fib[] = new int[100];
		
		int i = 0;
		int j = 1;
		int k = 2;
		int x;

		fib[0] = 1;
		fib[1] = 1;
		System.out.print(fib[0] + "," + fib[1]);

		for (x = 1; x <= 21; x++) {

			fib[k] = fib[i] + fib[j];
			i++;
			j++;

			System.out.print("," + fib[k]);
			k++;

		}

		// 1,1,2,3,5

	}

}
