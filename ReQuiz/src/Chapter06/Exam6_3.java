package Chapter06;

import java.util.Scanner;

public class Exam6_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("팩토리얼 함수 결과 구하기");
		System.out.println("하나의 정수를 입력하시오.");
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int result = 1;
		// 5*4*3*2*1 = 120
		while (num > 0) {
			if (num != 1) {
				System.out.print(num + " * ");
			} else {
				System.out.print(num + " = ");
			}
			result = result * num;
			num--;
		}
		System.out.println(result);
		
		sc.close();
	}
}