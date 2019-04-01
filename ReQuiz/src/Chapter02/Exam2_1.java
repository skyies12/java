package Chapter02;

import java.util.Scanner;

public class Exam2_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두개의 정수를 입력하시오.");
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int minus = num1 - num2;
		int gob = num1 * num2;
		int nanu = num1 / num2;
		
		System.out.println("더하기 연산 값 : " + sum);
		System.out.println("빼기 연산 값 : " + minus);
		System.out.println("곱하기 연산 값 : " + gob);
		System.out.println("나누기 연산 값 : " + nanu);

		sc.close();
	}
}