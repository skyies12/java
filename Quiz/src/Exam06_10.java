import java.util.Scanner;

public class Exam06_10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 정수를 입력해주세요.\n");
		
		int sum = 0;
		
		System.out.println("5개 정수 입력 : ");
		for (int i = 0; i <= 5; i++) {
			int num1 = sc.nextInt();
			sum = sum + num1;
			if (num1 < 1) {
				System.out.println("재입력해주세요.");
				continue;
			} 
		}
		System.out.println("계산의 합 : " + sum);
		sc.close();
	}
}
