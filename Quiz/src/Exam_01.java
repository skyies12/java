import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두개의 정수 값을 입력하세요 : ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mult = num1 * num2;
		int divi = num1 / num2;
		
		System.out.printf("더하기 계산 값 : %d%n", sum);
		System.out.printf("빼기 계산 값   : %d%n", sub);
		System.out.printf("곱하기 계산 값 : %d%n", mult);
		System.out.printf("나누기 계산 값 : %d%n", divi);
		
		sc.close();
	}
}