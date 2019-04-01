package Chapter07;

import java.util.Scanner;

public class Exam07_05 {

	public static void main(String[] args) {
		System.out.println("세 개의 정수를 입력받아 연산하는 프로그램\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세 개의 정수를 입력하시오.");
		
		while (true) {
			System.out.print("첫 번째 정수 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 정수 입력 : ");
			int num2 = sc.nextInt();
			System.out.println("1 : 더하기 2 : 빼기 3 : 곱하기 4 : 나누기");
			System.out.print("세 번째 정수 입력 : ");
			int num3 = sc.nextInt();
			
			if (num3 == 1) {
				System.out.println("더하기 연산 값 : " + Add(num1, num2) );
				break;
			} else if (num3 == 2) {
				System.out.println("빼기 연산 값 : " + Minus(num1, num2) );
				break;
			} else if (num3 == 3) {
				System.out.println("곱하기 연산 값 : " + Gob(num1, num2) );
				break;
			} else if (num3 == 4) {
				System.out.println("나누기 연산 값 : " + Nanu(num1, num2) );
				break;
			} else {
				continue;
			}
		}
		
		sc.close();
	}
	// 세 번째 정수 값에 따른 연산 값
	public static int Add(int num1, int num2) {
		return num1 + num2;
	}
	public static int Minus(int num1, int num2) {
		return num1 - num2;
	}
	public static int Gob(int num1, int num2) {
		return num1 * num2;
	}
	public static int Nanu(int num1, int num2) {
		return num1 / num2;
	}
}