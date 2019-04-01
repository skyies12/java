import java.util.Scanner;

public class Exam06_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요.");
		int num = sc.nextInt();
		
		for (int i = num; i <= 9;) {
			for (int j = 9; j >= 1; j--) {
				System.out.printf("%d x %d = %d%n", i, j, (i * j));
			}
			break;
		}
		
		sc.close();
	}
}
