package Chapter06;

public class Exam6_7 {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i % 7 == 0 || i % 9 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}