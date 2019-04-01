public class Exam06_08 {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i+=2) {
			for (int j = 1; j <= 9; j++) {
				if (j <= i) {
				System.out.printf("%d x %d = %d%n", i, j, (i * j));
				}
			}  
		}
	}
}
