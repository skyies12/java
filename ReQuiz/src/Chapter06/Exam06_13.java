package Chapter06;
public class Exam06_13 {
	public static void main(String[] args) {
		// 가로형 구구단
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.printf("%d x %d = %d\t", j, i, (i * j));
			}
			System.out.println();
		}
		System.out.println();
		// 세로형 구구단
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\t", i, j, (i * j));
			}
			System.out.println();
		}
	}
}