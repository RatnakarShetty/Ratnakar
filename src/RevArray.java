import java.util.Arrays;

public class RevArray {

	public static void main(String[] args) {

		int marks[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < marks.length / 2; i++) {

			int temp = marks[i];
			marks[i] = marks[marks.length - (1 + i)];
			marks[marks.length - (1 + i)] = temp;

		}
		System.out.println(Arrays.toString(marks));

	}

}
