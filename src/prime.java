
public class prime {

	public static void main(String[] args) {
		
		for (int i = 10; i <= 50; i++) {
			
			int flag = 0;
			for (int j = 2; j < i; j++) {
				
				if(i%j == 0)
				{
					flag = 1;
				}
			}
			if(flag == 0) {
				System.out.print(i+" ");
			}
			
		}
	}
}
