package Chapter06;

import java.util.Scanner;

public class Exam6_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두개의 정수를 입력하시오.");
		
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		
		if(num2 > num1) {
			System.out.println("두 수의 차 : " + (num2 - num1));
		} else {
			System.out.println("두 수의 차 : " + (num1 - num2));
		}
		sc.close();
	}
}