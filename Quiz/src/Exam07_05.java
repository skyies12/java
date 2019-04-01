import java.util.Scanner;

public class Exam07_05 {
	public static void main(String[] args) {
		
		System.out.println("세번째 정수에 따라 연산하는 프로그램.");
		System.out.println("세개의 정수를 입력해주세요.\n");
	
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i >= 1; i++) {
			System.out.print("첫 번째 정수 : "); 
			int num1 = sc.nextInt();
			
			System.out.print("두 번째 정수 : "); 
			int num2 = sc.nextInt();
			
			System.out.println("(1) 더하기 (2) 빼기 (3) 곱하기 (4) 나누기");
			System.out.print("세 번째 정수 : "); 
			int num3 = sc.nextInt();
			
			if (num3 > 0 && num3 < 5) {
				Add(num1, num2, num3);
				Subtrack(num1, num2, num3);
				Multiply(num1, num2, num3);
				Division(num1, num2, num3);
				break;
			} else {
				System.out.println("재입력 해주세요!!");
				continue;
			}
		}
		
		sc.close();
	}
	
	public static int Add(int num1, int num2, int num3) {
		if(num3 == 1) {
			int sum = num1 + num2;
			System.out.printf("연산 값 : %d + %d = %d",num1, num2, sum);
		}
		return 0;
	}
	
	public static int Subtrack(int num1, int num2, int num3) {
		if(num3 == 2) {
			int sum = num1 - num2;
			System.out.printf("연산 값 : %d - %d = %d",num1, num2, sum);
		}
		return 0;
	}
	
	public static int Multiply(int num1, int num2, int num3) {
		if(num3 == 3) {
			int sum = num1 * num2;
			System.out.printf("연산 값 : %d * %d = %d",num1, num2, sum);
		}
		return 0;
	}
	
	public static int Division(int num1, int num2, int num3) {
		if(num3 == 4) {
			int sum = num1 / num2;
			System.out.printf("연산 값 : %d / %d = %d",num1, num2, sum);
		}
		return 0;
	}

}
