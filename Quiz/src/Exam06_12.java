import java.util.Scanner;

public class Exam06_12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("2개의 정수를 입력해주세요.\n");
		
		int sum = 0;
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		for (int i = num1; i < num2; i++) {
			if (num1 <= num2) {
				System.out.print(num1 + "+");
			} 
			sum = sum + num1++;
		}
		
		for (int j = num1; j >= num2; j--) {
			if (num1 >= num2) {
				System.out.print(num1 + "+");
			} 
			
			sum = sum + num1--;
		}
		System.out.print("\b = " + sum);
		sc.close();
	}
}
