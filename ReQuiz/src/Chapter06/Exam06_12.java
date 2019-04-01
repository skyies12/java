package Chapter06;
import java.util.Scanner;

public class Exam06_12 {
	public static void main(String[] args) {
		System.out.println("두개의 정수를 입력받아 더하는 식을 구하는 프로그램");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int use1 = sc.nextInt();
		
		System.out.print("정수 입력 : ");
		int use2 = sc.nextInt();
		
		for (int i = use1; i <= use2; i++) {
			if (i == use2) {
				System.out.println(i);
			} else if (i < use2) {
				System.out.print(i + " + ");
			}
		}
		
		for (int i = use1; i >= use2; i--) {
			if (i == use2) {
				System.out.println(i);
			} else if (i > use2) {
				System.out.print(i + " + ");
			}
		}
		
		sc.close();
	}
}