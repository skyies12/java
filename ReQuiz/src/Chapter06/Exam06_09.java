package Chapter06;
import java.util.Scanner;

public class Exam06_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력한 정수의 값을 구구단 역순으로 출력하는 프로그램");
		int num = sc.nextInt();
		
		for(int i = 9; i > 0; i--) {
			System.out.printf("%d x %d = %d\n", num, i, (num * i));
		}
		sc.close();
	}
}