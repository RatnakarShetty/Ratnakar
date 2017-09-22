
public class pattersns {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {

				if (j <= i)
					System.out.print(j);

			}
			System.out.println();
		}
		for (int i = 4 - 1; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				// if(j<=i)
				System.out.print(j);

			}

			System.out.println();
		}

		System.out.println("*************************************");

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");

			}
			System.out.println();
		}
		System.out.println("*************************************");

		for (int i = 7; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int i = 2; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");

			}
			System.out.println();
		}
		System.out.println("*************************************");

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = 6; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("*************************************");

		for (int i = 1; i <= 7; i++) {

			for (int k = 7 - i; k >= 1; k--) {
				System.out.print("1" + " ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		System.out.println("*************************************");
		for (int i = 1; i <= 7; i++) {
			for (int j = 7; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("*************************************");

		for (int i = 7; i >= 1; i--) {
			for (int j = 7; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("*************************************");
		
		for (int i = 7; i >=1; i--) {
			for (int j = 1; j <=i ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("*************************************");
		for (int i = 1; i <=7; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");
			}
			for (int k = 2; k <=i+1; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
