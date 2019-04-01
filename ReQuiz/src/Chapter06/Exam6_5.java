package Chapter06;

import java.util.Scanner;

public class Exam6_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오.");
		System.out.println("0을 입력하면 입력한 값의 합이 나옵니다.");
		
		int sum = 0;
		
		while(true) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			sum = sum + num;
			if (num == 0) {
				System.out.println("입력한 값의 합 : " + sum);
				break;
			}
		}
		
		sc.close();
	}
}