
public class divided {

	public static void main(String[] args) {
		
		int divisor = 2;
		int dividend = 21;
		int quotient = 0;
		
		while(dividend>=divisor) {
			dividend = dividend - divisor;
			quotient++;
		}
		System.out.println("Quotient is"+quotient);
		System.out.println("Remainder is"+dividend);

	}

}
