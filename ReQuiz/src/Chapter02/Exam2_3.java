package Chapter02;

import java.util.Scanner;

public class Exam2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두개의 정수를 입력하세요.");
		
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.printf("%d 나누기 %d의 몫은 %d 입니다.%n", num1, num2, (num1 / num2));
		System.out.printf("%d 나누기 %d의 몫은 %d 입니다.", num1, num2, (num1 % num2));
		sc.close();
	}
}